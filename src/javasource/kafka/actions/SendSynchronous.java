// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package kafka.actions;

import java.util.Date;
import java.util.concurrent.Future;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import kafka.impl.KafkaProducerRepository;
import kafka.impl.KafkaPropertiesFactory;
import kafka.proxies.Header;
import kafka.proxies.RecordMetaData;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * Sends ('produces') a message in a Kafka topic.
 * 
 * Before using this action, make sure a producer with this name has been stared using the StartProducer action.
 * 
 * This action will always return true.
 */
public class SendSynchronous extends CustomJavaAction<IMendixObject>
{
	private IMendixObject __producer;
	private kafka.proxies.Producer producer;
	private java.lang.String topic;
	private java.lang.String key;
	private java.lang.String value;
	private java.util.List<IMendixObject> __headers;
	private java.util.List<kafka.proxies.Header> headers;
	private java.lang.Boolean useCachedProducer;

	public SendSynchronous(IContext context, IMendixObject producer, java.lang.String topic, java.lang.String key, java.lang.String value, java.util.List<IMendixObject> headers, java.lang.Boolean useCachedProducer)
	{
		super(context);
		this.__producer = producer;
		this.topic = topic;
		this.key = key;
		this.value = value;
		this.__headers = headers;
		this.useCachedProducer = useCachedProducer;
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		this.producer = __producer == null ? null : kafka.proxies.Producer.initialize(getContext(), __producer);

		this.headers = new java.util.ArrayList<kafka.proxies.Header>();
		if (__headers != null)
			for (IMendixObject __headersElement : __headers)
				this.headers.add(kafka.proxies.Header.initialize(getContext(), __headersElement));

		// BEGIN USER CODE
		KafkaProducer<String, String>  kafkaProducer;
		
		if (useCachedProducer) {
			kafkaProducer = KafkaProducerRepository.get(producer.getName());
		} else {
			kafkaProducer = new KafkaProducer<String, String>(
					KafkaPropertiesFactory.getKafkaProperties(getContext(), producer));
		}

		ProducerRecord<String, String> producerRecord;
		if (key == null || key.isEmpty()) {
			producerRecord = new ProducerRecord<String, String>(topic, value);
		} else {
			producerRecord = new ProducerRecord<String, String>(topic, key, value);
		}
		
		for (Header header : this.headers) {
			producerRecord.headers().add(header.getKey(), header.getValue().getBytes());
		}

		if (kafkaProducer == null) {
			throw new Exception("Unable to build a producer using the specified configuration settings");
		}
		
		Future<RecordMetadata> future = kafkaProducer.send(producerRecord);
		RecordMetadata record = future.get();
		RecordMetaData result = new RecordMetaData(getContext());
		result.setHasOffset(record.hasOffset());
		if (record.hasOffset())
			result.setOffset(record.offset());
		result.setPartition(record.partition());
		if (record.hasTimestamp())
			result.setTimestamp(new Date(record.timestamp()));
		
		if (!useCachedProducer) {
			// if the cache is not used, Producers are created every time we call this JA
			// and they must be closed; unclosed Producers communicate with the broker every 60s 
			// to re-authenticate; for more information see sasl.kerberos.min.time.before.relogin
			kafkaProducer.close();
		}
		
		return result.getMendixObject();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "SendSynchronous";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}

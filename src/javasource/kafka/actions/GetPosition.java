// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package kafka.actions;

import java.time.Duration;
import java.util.Properties;
import org.apache.kafka.common.TopicPartition;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import kafka.impl.KafkaModule;
import kafka.impl.KafkaPropertiesFactory;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class GetPosition extends CustomJavaAction<java.lang.Long>
{
	private java.lang.String topic;
	private java.lang.Long partition;
	private IMendixObject __consumer;
	private kafka.proxies.Consumer consumer;

	public GetPosition(IContext context, java.lang.String topic, java.lang.Long partition, IMendixObject consumer)
	{
		super(context);
		this.topic = topic;
		this.partition = partition;
		this.__consumer = consumer;
	}

	@Override
	public java.lang.Long executeAction() throws Exception
	{
		this.consumer = __consumer == null ? null : kafka.proxies.Consumer.initialize(getContext(), __consumer);

		// BEGIN USER CODE
		Properties kafkaProps = KafkaPropertiesFactory.getKafkaProperties(getContext(), consumer);
		KafkaConsumer<String, String> kafkaConsumer = new KafkaConsumer<>(kafkaProps);
		long position = -1;
		
		try {
			TopicPartition tp = new TopicPartition(topic, partition.intValue());
			kafkaConsumer.position(tp, Duration.ofMillis(10000));
		} catch (Exception e) {
			KafkaModule.LOGGER.error("Error while obtaining position for " + consumer.getName() + ": " + e.getMessage(), e);
		} finally {
			kafkaConsumer.close();
		}
		return position;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "GetPosition";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}

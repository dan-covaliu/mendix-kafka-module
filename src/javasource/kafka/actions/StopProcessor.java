// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package kafka.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import kafka.impl.KafkaModule;
import kafka.impl.KafkaProcessorRepository;

/**
 * Stops a certain Kafka processor
 * 
 * This action will always return true.
 */
public class StopProcessor extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String ProcessorName;

	public StopProcessor(IContext context, java.lang.String ProcessorName)
	{
		super(context);
		this.ProcessorName = ProcessorName;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		try {	
			KafkaProcessorRepository.close(ProcessorName);
		} catch (Exception e) {
			KafkaModule.LOGGER.error("Failed to close Processor " + ProcessorName + e);
		}

		
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "StopProcessor";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}

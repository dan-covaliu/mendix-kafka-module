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
import kafka.actions.WatchObjectForChange.CheckForChangesThread;

public class StopWatchingObjects extends CustomJavaAction<java.lang.Void>
{
	public StopWatchingObjects(IContext context)
	{
		super(context);
	}

	@java.lang.Override
	public java.lang.Void executeAction() throws Exception
	{
		// BEGIN USER CODE
		for(CheckForChangesThread thread : WatchObjectForChange.changesThreads) {
			thread.disable();
		}
		return null;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "StopWatchingObjects";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}

// This file was generated by Mendix Modeler 6.10.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package demo.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;

public class Microflows
{
	// These are the microflows for the Demo module
	public static boolean startup(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "Demo.Startup", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}
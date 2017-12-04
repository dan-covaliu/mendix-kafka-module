// This file was generated by Mendix Modeler 6.10.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package alertsdemo.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the AlertsDemo module
	public static void consumeMessage(IContext context, java.lang.String _key, java.lang.String _value)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("key", _key);
			params.put("value", _value);
			Core.execute(context, "AlertsDemo.ConsumeMessage", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static alertsdemo.proxies.Alert createAlert(IContext context, alertsdemo.proxies.AlertFilterCriteria _mappingParameter, java.lang.String _category, java.lang.String _message)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("MappingParameter", _mappingParameter == null ? null : _mappingParameter.getMendixObject());
			params.put("category", _category);
			params.put("message", _message);
			IMendixObject result = (IMendixObject)Core.execute(context, "AlertsDemo.CreateAlert", params);
			return result == null ? null : alertsdemo.proxies.Alert.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static alertsdemo.proxies.Alert createNewAlert(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "AlertsDemo.CreateNewAlert", params);
			return result == null ? null : alertsdemo.proxies.Alert.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static alertsdemo.proxies.AlertFilterCriteria createNewAlertFilterCriteria(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "AlertsDemo.CreateNewAlertFilterCriteria", params);
			return result == null ? null : alertsdemo.proxies.AlertFilterCriteria.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void retrieveMessages(IContext context, alertsdemo.proxies.AlertFilterCriteria _alertFilterCriteria)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("AlertFilterCriteria", _alertFilterCriteria == null ? null : _alertFilterCriteria.getMendixObject());
			Core.execute(context, "AlertsDemo.RetrieveMessages", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean sendAlertToKafka(IContext context, alertsdemo.proxies.Alert _alert)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Alert", _alert == null ? null : _alert.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "AlertsDemo.SendAlertToKafka", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean startAlertProducer(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "AlertsDemo.StartAlertProducer", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}
// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package kafka.proxies;

public class ConfigChanges
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject configChangesMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Kafka.ConfigChanges";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		LastChange("LastChange");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public ConfigChanges(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Kafka.ConfigChanges"));
	}

	protected ConfigChanges(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject configChangesMendixObject)
	{
		if (configChangesMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Kafka.ConfigChanges", configChangesMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Kafka.ConfigChanges");

		this.configChangesMendixObject = configChangesMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ConfigChanges.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static kafka.proxies.ConfigChanges initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return kafka.proxies.ConfigChanges.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static kafka.proxies.ConfigChanges initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new kafka.proxies.ConfigChanges(context, mendixObject);
	}

	public static kafka.proxies.ConfigChanges load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return kafka.proxies.ConfigChanges.initialize(context, mendixObject);
	}

	public static java.util.List<kafka.proxies.ConfigChanges> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<kafka.proxies.ConfigChanges> result = new java.util.ArrayList<kafka.proxies.ConfigChanges>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Kafka.ConfigChanges" + xpathConstraint))
			result.add(kafka.proxies.ConfigChanges.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of LastChange
	 */
	public final java.util.Date getLastChange()
	{
		return getLastChange(getContext());
	}

	/**
	 * @param context
	 * @return value of LastChange
	 */
	public final java.util.Date getLastChange(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.LastChange.toString());
	}

	/**
	 * Set value of LastChange
	 * @param lastchange
	 */
	public final void setLastChange(java.util.Date lastchange)
	{
		setLastChange(getContext(), lastchange);
	}

	/**
	 * Set value of LastChange
	 * @param context
	 * @param lastchange
	 */
	public final void setLastChange(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date lastchange)
	{
		getMendixObject().setValue(context, MemberNames.LastChange.toString(), lastchange);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return configChangesMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final kafka.proxies.ConfigChanges that = (kafka.proxies.ConfigChanges) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "Kafka.ConfigChanges";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}

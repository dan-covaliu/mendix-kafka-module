// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package demo.proxies;

public class Temperature
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject temperatureMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Demo.Temperature";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Celsius("Celsius"),
		MinCelcius("MinCelcius"),
		MaxCelsius("MaxCelsius");

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

	public Temperature(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Demo.Temperature"));
	}

	protected Temperature(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject temperatureMendixObject)
	{
		if (temperatureMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Demo.Temperature", temperatureMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Demo.Temperature");

		this.temperatureMendixObject = temperatureMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Temperature.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static demo.proxies.Temperature initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return demo.proxies.Temperature.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static demo.proxies.Temperature initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new demo.proxies.Temperature(context, mendixObject);
	}

	public static demo.proxies.Temperature load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return demo.proxies.Temperature.initialize(context, mendixObject);
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
	 * @return value of Celsius
	 */
	public final java.lang.Integer getCelsius()
	{
		return getCelsius(getContext());
	}

	/**
	 * @param context
	 * @return value of Celsius
	 */
	public final java.lang.Integer getCelsius(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Celsius.toString());
	}

	/**
	 * Set value of Celsius
	 * @param celsius
	 */
	public final void setCelsius(java.lang.Integer celsius)
	{
		setCelsius(getContext(), celsius);
	}

	/**
	 * Set value of Celsius
	 * @param context
	 * @param celsius
	 */
	public final void setCelsius(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer celsius)
	{
		getMendixObject().setValue(context, MemberNames.Celsius.toString(), celsius);
	}

	/**
	 * @return value of MinCelcius
	 */
	public final java.lang.Integer getMinCelcius()
	{
		return getMinCelcius(getContext());
	}

	/**
	 * @param context
	 * @return value of MinCelcius
	 */
	public final java.lang.Integer getMinCelcius(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.MinCelcius.toString());
	}

	/**
	 * Set value of MinCelcius
	 * @param mincelcius
	 */
	public final void setMinCelcius(java.lang.Integer mincelcius)
	{
		setMinCelcius(getContext(), mincelcius);
	}

	/**
	 * Set value of MinCelcius
	 * @param context
	 * @param mincelcius
	 */
	public final void setMinCelcius(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer mincelcius)
	{
		getMendixObject().setValue(context, MemberNames.MinCelcius.toString(), mincelcius);
	}

	/**
	 * @return value of MaxCelsius
	 */
	public final java.lang.Integer getMaxCelsius()
	{
		return getMaxCelsius(getContext());
	}

	/**
	 * @param context
	 * @return value of MaxCelsius
	 */
	public final java.lang.Integer getMaxCelsius(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.MaxCelsius.toString());
	}

	/**
	 * Set value of MaxCelsius
	 * @param maxcelsius
	 */
	public final void setMaxCelsius(java.lang.Integer maxcelsius)
	{
		setMaxCelsius(getContext(), maxcelsius);
	}

	/**
	 * Set value of MaxCelsius
	 * @param context
	 * @param maxcelsius
	 */
	public final void setMaxCelsius(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer maxcelsius)
	{
		getMendixObject().setValue(context, MemberNames.MaxCelsius.toString(), maxcelsius);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return temperatureMendixObject;
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
			final demo.proxies.Temperature that = (demo.proxies.Temperature) obj;
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
		return "Demo.Temperature";
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

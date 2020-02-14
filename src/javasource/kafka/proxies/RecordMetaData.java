// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package kafka.proxies;

public class RecordMetaData
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject recordMetaDataMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Kafka.RecordMetaData";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		HasOffset("HasOffset"),
		Offset("Offset"),
		Partition("Partition"),
		Timestamp("Timestamp");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public RecordMetaData(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Kafka.RecordMetaData"));
	}

	protected RecordMetaData(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject recordMetaDataMendixObject)
	{
		if (recordMetaDataMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Kafka.RecordMetaData", recordMetaDataMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Kafka.RecordMetaData");

		this.recordMetaDataMendixObject = recordMetaDataMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'RecordMetaData.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static kafka.proxies.RecordMetaData initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return kafka.proxies.RecordMetaData.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static kafka.proxies.RecordMetaData initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new kafka.proxies.RecordMetaData(context, mendixObject);
	}

	public static kafka.proxies.RecordMetaData load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return kafka.proxies.RecordMetaData.initialize(context, mendixObject);
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
	 * @return value of HasOffset
	 */
	public final java.lang.Boolean getHasOffset()
	{
		return getHasOffset(getContext());
	}

	/**
	 * @param context
	 * @return value of HasOffset
	 */
	public final java.lang.Boolean getHasOffset(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.HasOffset.toString());
	}

	/**
	 * Set value of HasOffset
	 * @param hasoffset
	 */
	public final void setHasOffset(java.lang.Boolean hasoffset)
	{
		setHasOffset(getContext(), hasoffset);
	}

	/**
	 * Set value of HasOffset
	 * @param context
	 * @param hasoffset
	 */
	public final void setHasOffset(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean hasoffset)
	{
		getMendixObject().setValue(context, MemberNames.HasOffset.toString(), hasoffset);
	}

	/**
	 * @return value of Offset
	 */
	public final java.lang.Long getOffset()
	{
		return getOffset(getContext());
	}

	/**
	 * @param context
	 * @return value of Offset
	 */
	public final java.lang.Long getOffset(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.Offset.toString());
	}

	/**
	 * Set value of Offset
	 * @param offset
	 */
	public final void setOffset(java.lang.Long offset)
	{
		setOffset(getContext(), offset);
	}

	/**
	 * Set value of Offset
	 * @param context
	 * @param offset
	 */
	public final void setOffset(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long offset)
	{
		getMendixObject().setValue(context, MemberNames.Offset.toString(), offset);
	}

	/**
	 * @return value of Partition
	 */
	public final java.lang.Integer getPartition()
	{
		return getPartition(getContext());
	}

	/**
	 * @param context
	 * @return value of Partition
	 */
	public final java.lang.Integer getPartition(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Partition.toString());
	}

	/**
	 * Set value of Partition
	 * @param partition
	 */
	public final void setPartition(java.lang.Integer partition)
	{
		setPartition(getContext(), partition);
	}

	/**
	 * Set value of Partition
	 * @param context
	 * @param partition
	 */
	public final void setPartition(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer partition)
	{
		getMendixObject().setValue(context, MemberNames.Partition.toString(), partition);
	}

	/**
	 * @return value of Timestamp
	 */
	public final java.util.Date getTimestamp()
	{
		return getTimestamp(getContext());
	}

	/**
	 * @param context
	 * @return value of Timestamp
	 */
	public final java.util.Date getTimestamp(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.Timestamp.toString());
	}

	/**
	 * Set value of Timestamp
	 * @param timestamp
	 */
	public final void setTimestamp(java.util.Date timestamp)
	{
		setTimestamp(getContext(), timestamp);
	}

	/**
	 * Set value of Timestamp
	 * @param context
	 * @param timestamp
	 */
	public final void setTimestamp(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date timestamp)
	{
		getMendixObject().setValue(context, MemberNames.Timestamp.toString(), timestamp);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return recordMetaDataMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final kafka.proxies.RecordMetaData that = (kafka.proxies.RecordMetaData) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "Kafka.RecordMetaData";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}

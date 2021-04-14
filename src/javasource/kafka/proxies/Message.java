// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package kafka.proxies;

public class Message
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject messageMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Kafka.Message";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Offset("Offset"),
		Key("Key"),
		Timestamp("Timestamp"),
		Partition("Partition"),
		Topic("Topic"),
		Payload("Payload"),
		Message_MessageOverview("Kafka.Message_MessageOverview");

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

	public Message(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Kafka.Message"));
	}

	protected Message(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject messageMendixObject)
	{
		if (messageMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Kafka.Message", messageMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Kafka.Message");

		this.messageMendixObject = messageMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Message.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static kafka.proxies.Message initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return kafka.proxies.Message.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static kafka.proxies.Message initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new kafka.proxies.Message(context, mendixObject);
	}

	public static kafka.proxies.Message load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return kafka.proxies.Message.initialize(context, mendixObject);
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
	 * @return value of Key
	 */
	public final java.lang.String getKey()
	{
		return getKey(getContext());
	}

	/**
	 * @param context
	 * @return value of Key
	 */
	public final java.lang.String getKey(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Key.toString());
	}

	/**
	 * Set value of Key
	 * @param key
	 */
	public final void setKey(java.lang.String key)
	{
		setKey(getContext(), key);
	}

	/**
	 * Set value of Key
	 * @param context
	 * @param key
	 */
	public final void setKey(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String key)
	{
		getMendixObject().setValue(context, MemberNames.Key.toString(), key);
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
	 * @return value of Topic
	 */
	public final java.lang.String getTopic()
	{
		return getTopic(getContext());
	}

	/**
	 * @param context
	 * @return value of Topic
	 */
	public final java.lang.String getTopic(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Topic.toString());
	}

	/**
	 * Set value of Topic
	 * @param topic
	 */
	public final void setTopic(java.lang.String topic)
	{
		setTopic(getContext(), topic);
	}

	/**
	 * Set value of Topic
	 * @param context
	 * @param topic
	 */
	public final void setTopic(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String topic)
	{
		getMendixObject().setValue(context, MemberNames.Topic.toString(), topic);
	}

	/**
	 * @return value of Payload
	 */
	public final java.lang.String getPayload()
	{
		return getPayload(getContext());
	}

	/**
	 * @param context
	 * @return value of Payload
	 */
	public final java.lang.String getPayload(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Payload.toString());
	}

	/**
	 * Set value of Payload
	 * @param payload
	 */
	public final void setPayload(java.lang.String payload)
	{
		setPayload(getContext(), payload);
	}

	/**
	 * Set value of Payload
	 * @param context
	 * @param payload
	 */
	public final void setPayload(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String payload)
	{
		getMendixObject().setValue(context, MemberNames.Payload.toString(), payload);
	}

	/**
	 * @return value of Message_MessageOverview
	 */
	public final kafka.proxies.MessageOverview getMessage_MessageOverview() throws com.mendix.core.CoreException
	{
		return getMessage_MessageOverview(getContext());
	}

	/**
	 * @param context
	 * @return value of Message_MessageOverview
	 */
	public final kafka.proxies.MessageOverview getMessage_MessageOverview(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		kafka.proxies.MessageOverview result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Message_MessageOverview.toString());
		if (identifier != null)
			result = kafka.proxies.MessageOverview.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Message_MessageOverview
	 * @param message_messageoverview
	 */
	public final void setMessage_MessageOverview(kafka.proxies.MessageOverview message_messageoverview)
	{
		setMessage_MessageOverview(getContext(), message_messageoverview);
	}

	/**
	 * Set value of Message_MessageOverview
	 * @param context
	 * @param message_messageoverview
	 */
	public final void setMessage_MessageOverview(com.mendix.systemwideinterfaces.core.IContext context, kafka.proxies.MessageOverview message_messageoverview)
	{
		if (message_messageoverview == null)
			getMendixObject().setValue(context, MemberNames.Message_MessageOverview.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Message_MessageOverview.toString(), message_messageoverview.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return messageMendixObject;
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
			final kafka.proxies.Message that = (kafka.proxies.Message) obj;
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
		return "Kafka.Message";
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

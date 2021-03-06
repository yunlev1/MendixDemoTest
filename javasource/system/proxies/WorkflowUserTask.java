// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package system.proxies;

public class WorkflowUserTask
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject workflowUserTaskMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "System.WorkflowUserTask";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		Description("Description"),
		StartTime("StartTime"),
		DueDate("DueDate"),
		EndTime("EndTime"),
		Outcome("Outcome"),
		State("State"),
		Reason("Reason"),
		WorkflowUserTask_TargetUsers("System.WorkflowUserTask_TargetUsers"),
		WorkflowUserTask_Assignee("System.WorkflowUserTask_Assignee"),
		WorkflowUserTask_Workflow("System.WorkflowUserTask_Workflow"),
		WorkflowUserTask_WorkflowUserTaskDefinition("System.WorkflowUserTask_WorkflowUserTaskDefinition");

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

	public WorkflowUserTask(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "System.WorkflowUserTask"));
	}

	protected WorkflowUserTask(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject workflowUserTaskMendixObject)
	{
		if (workflowUserTaskMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("System.WorkflowUserTask", workflowUserTaskMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a System.WorkflowUserTask");

		this.workflowUserTaskMendixObject = workflowUserTaskMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'WorkflowUserTask.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static system.proxies.WorkflowUserTask initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return system.proxies.WorkflowUserTask.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static system.proxies.WorkflowUserTask initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new system.proxies.WorkflowUserTask(context, mendixObject);
	}

	public static system.proxies.WorkflowUserTask load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return system.proxies.WorkflowUserTask.initialize(context, mendixObject);
	}

	public static java.util.List<system.proxies.WorkflowUserTask> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<system.proxies.WorkflowUserTask> result = new java.util.ArrayList<system.proxies.WorkflowUserTask>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//System.WorkflowUserTask" + xpathConstraint))
			result.add(system.proxies.WorkflowUserTask.initialize(context, obj));
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
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of Description
	 */
	public final java.lang.String getDescription()
	{
		return getDescription(getContext());
	}

	/**
	 * @param context
	 * @return value of Description
	 */
	public final java.lang.String getDescription(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Description.toString());
	}

	/**
	 * Set value of Description
	 * @param description
	 */
	public final void setDescription(java.lang.String description)
	{
		setDescription(getContext(), description);
	}

	/**
	 * Set value of Description
	 * @param context
	 * @param description
	 */
	public final void setDescription(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String description)
	{
		getMendixObject().setValue(context, MemberNames.Description.toString(), description);
	}

	/**
	 * @return value of StartTime
	 */
	public final java.util.Date getStartTime()
	{
		return getStartTime(getContext());
	}

	/**
	 * @param context
	 * @return value of StartTime
	 */
	public final java.util.Date getStartTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.StartTime.toString());
	}

	/**
	 * Set value of StartTime
	 * @param starttime
	 */
	public final void setStartTime(java.util.Date starttime)
	{
		setStartTime(getContext(), starttime);
	}

	/**
	 * Set value of StartTime
	 * @param context
	 * @param starttime
	 */
	public final void setStartTime(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date starttime)
	{
		getMendixObject().setValue(context, MemberNames.StartTime.toString(), starttime);
	}

	/**
	 * @return value of DueDate
	 */
	public final java.util.Date getDueDate()
	{
		return getDueDate(getContext());
	}

	/**
	 * @param context
	 * @return value of DueDate
	 */
	public final java.util.Date getDueDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.DueDate.toString());
	}

	/**
	 * Set value of DueDate
	 * @param duedate
	 */
	public final void setDueDate(java.util.Date duedate)
	{
		setDueDate(getContext(), duedate);
	}

	/**
	 * Set value of DueDate
	 * @param context
	 * @param duedate
	 */
	public final void setDueDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date duedate)
	{
		getMendixObject().setValue(context, MemberNames.DueDate.toString(), duedate);
	}

	/**
	 * @return value of EndTime
	 */
	public final java.util.Date getEndTime()
	{
		return getEndTime(getContext());
	}

	/**
	 * @param context
	 * @return value of EndTime
	 */
	public final java.util.Date getEndTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.EndTime.toString());
	}

	/**
	 * Set value of EndTime
	 * @param endtime
	 */
	public final void setEndTime(java.util.Date endtime)
	{
		setEndTime(getContext(), endtime);
	}

	/**
	 * Set value of EndTime
	 * @param context
	 * @param endtime
	 */
	public final void setEndTime(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date endtime)
	{
		getMendixObject().setValue(context, MemberNames.EndTime.toString(), endtime);
	}

	/**
	 * @return value of Outcome
	 */
	public final java.lang.String getOutcome()
	{
		return getOutcome(getContext());
	}

	/**
	 * @param context
	 * @return value of Outcome
	 */
	public final java.lang.String getOutcome(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Outcome.toString());
	}

	/**
	 * Set value of Outcome
	 * @param outcome
	 */
	public final void setOutcome(java.lang.String outcome)
	{
		setOutcome(getContext(), outcome);
	}

	/**
	 * Set value of Outcome
	 * @param context
	 * @param outcome
	 */
	public final void setOutcome(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String outcome)
	{
		getMendixObject().setValue(context, MemberNames.Outcome.toString(), outcome);
	}

	/**
	 * Set value of State
	 * @param state
	 */
	public final system.proxies.WorkflowUserTaskState getState()
	{
		return getState(getContext());
	}

	/**
	 * @param context
	 * @return value of State
	 */
	public final system.proxies.WorkflowUserTaskState getState(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.State.toString());
		if (obj == null)
			return null;

		return system.proxies.WorkflowUserTaskState.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of State
	 * @param state
	 */
	public final void setState(system.proxies.WorkflowUserTaskState state)
	{
		setState(getContext(), state);
	}

	/**
	 * Set value of State
	 * @param context
	 * @param state
	 */
	public final void setState(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.WorkflowUserTaskState state)
	{
		if (state != null)
			getMendixObject().setValue(context, MemberNames.State.toString(), state.toString());
		else
			getMendixObject().setValue(context, MemberNames.State.toString(), null);
	}

	/**
	 * @return value of Reason
	 */
	public final java.lang.String getReason()
	{
		return getReason(getContext());
	}

	/**
	 * @param context
	 * @return value of Reason
	 */
	public final java.lang.String getReason(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Reason.toString());
	}

	/**
	 * Set value of Reason
	 * @param reason
	 */
	public final void setReason(java.lang.String reason)
	{
		setReason(getContext(), reason);
	}

	/**
	 * Set value of Reason
	 * @param context
	 * @param reason
	 */
	public final void setReason(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String reason)
	{
		getMendixObject().setValue(context, MemberNames.Reason.toString(), reason);
	}

	/**
	 * @return value of WorkflowUserTask_TargetUsers
	 */
	public final java.util.List<system.proxies.User> getWorkflowUserTask_TargetUsers() throws com.mendix.core.CoreException
	{
		return getWorkflowUserTask_TargetUsers(getContext());
	}

	/**
	 * @param context
	 * @return value of WorkflowUserTask_TargetUsers
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<system.proxies.User> getWorkflowUserTask_TargetUsers(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<system.proxies.User> result = new java.util.ArrayList<system.proxies.User>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.WorkflowUserTask_TargetUsers.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(system.proxies.User.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of WorkflowUserTask_TargetUsers
	 * @param workflowusertask_targetusers
	 */
	public final void setWorkflowUserTask_TargetUsers(java.util.List<system.proxies.User> workflowusertask_targetusers)
	{
		setWorkflowUserTask_TargetUsers(getContext(), workflowusertask_targetusers);
	}

	/**
	 * Set value of WorkflowUserTask_TargetUsers
	 * @param context
	 * @param workflowusertask_targetusers
	 */
	public final void setWorkflowUserTask_TargetUsers(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<system.proxies.User> workflowusertask_targetusers)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (system.proxies.User proxyObject : workflowusertask_targetusers)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.WorkflowUserTask_TargetUsers.toString(), identifiers);
	}

	/**
	 * @return value of WorkflowUserTask_Assignee
	 */
	public final system.proxies.User getWorkflowUserTask_Assignee() throws com.mendix.core.CoreException
	{
		return getWorkflowUserTask_Assignee(getContext());
	}

	/**
	 * @param context
	 * @return value of WorkflowUserTask_Assignee
	 */
	public final system.proxies.User getWorkflowUserTask_Assignee(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		system.proxies.User result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.WorkflowUserTask_Assignee.toString());
		if (identifier != null)
			result = system.proxies.User.load(context, identifier);
		return result;
	}

	/**
	 * Set value of WorkflowUserTask_Assignee
	 * @param workflowusertask_assignee
	 */
	public final void setWorkflowUserTask_Assignee(system.proxies.User workflowusertask_assignee)
	{
		setWorkflowUserTask_Assignee(getContext(), workflowusertask_assignee);
	}

	/**
	 * Set value of WorkflowUserTask_Assignee
	 * @param context
	 * @param workflowusertask_assignee
	 */
	public final void setWorkflowUserTask_Assignee(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.User workflowusertask_assignee)
	{
		if (workflowusertask_assignee == null)
			getMendixObject().setValue(context, MemberNames.WorkflowUserTask_Assignee.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.WorkflowUserTask_Assignee.toString(), workflowusertask_assignee.getMendixObject().getId());
	}

	/**
	 * @return value of WorkflowUserTask_Workflow
	 */
	public final system.proxies.Workflow getWorkflowUserTask_Workflow() throws com.mendix.core.CoreException
	{
		return getWorkflowUserTask_Workflow(getContext());
	}

	/**
	 * @param context
	 * @return value of WorkflowUserTask_Workflow
	 */
	public final system.proxies.Workflow getWorkflowUserTask_Workflow(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		system.proxies.Workflow result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.WorkflowUserTask_Workflow.toString());
		if (identifier != null)
			result = system.proxies.Workflow.load(context, identifier);
		return result;
	}

	/**
	 * Set value of WorkflowUserTask_Workflow
	 * @param workflowusertask_workflow
	 */
	public final void setWorkflowUserTask_Workflow(system.proxies.Workflow workflowusertask_workflow)
	{
		setWorkflowUserTask_Workflow(getContext(), workflowusertask_workflow);
	}

	/**
	 * Set value of WorkflowUserTask_Workflow
	 * @param context
	 * @param workflowusertask_workflow
	 */
	public final void setWorkflowUserTask_Workflow(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.Workflow workflowusertask_workflow)
	{
		if (workflowusertask_workflow == null)
			getMendixObject().setValue(context, MemberNames.WorkflowUserTask_Workflow.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.WorkflowUserTask_Workflow.toString(), workflowusertask_workflow.getMendixObject().getId());
	}

	/**
	 * @return value of WorkflowUserTask_WorkflowUserTaskDefinition
	 */
	public final system.proxies.WorkflowUserTaskDefinition getWorkflowUserTask_WorkflowUserTaskDefinition() throws com.mendix.core.CoreException
	{
		return getWorkflowUserTask_WorkflowUserTaskDefinition(getContext());
	}

	/**
	 * @param context
	 * @return value of WorkflowUserTask_WorkflowUserTaskDefinition
	 */
	public final system.proxies.WorkflowUserTaskDefinition getWorkflowUserTask_WorkflowUserTaskDefinition(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		system.proxies.WorkflowUserTaskDefinition result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.WorkflowUserTask_WorkflowUserTaskDefinition.toString());
		if (identifier != null)
			result = system.proxies.WorkflowUserTaskDefinition.load(context, identifier);
		return result;
	}

	/**
	 * Set value of WorkflowUserTask_WorkflowUserTaskDefinition
	 * @param workflowusertask_workflowusertaskdefinition
	 */
	public final void setWorkflowUserTask_WorkflowUserTaskDefinition(system.proxies.WorkflowUserTaskDefinition workflowusertask_workflowusertaskdefinition)
	{
		setWorkflowUserTask_WorkflowUserTaskDefinition(getContext(), workflowusertask_workflowusertaskdefinition);
	}

	/**
	 * Set value of WorkflowUserTask_WorkflowUserTaskDefinition
	 * @param context
	 * @param workflowusertask_workflowusertaskdefinition
	 */
	public final void setWorkflowUserTask_WorkflowUserTaskDefinition(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.WorkflowUserTaskDefinition workflowusertask_workflowusertaskdefinition)
	{
		if (workflowusertask_workflowusertaskdefinition == null)
			getMendixObject().setValue(context, MemberNames.WorkflowUserTask_WorkflowUserTaskDefinition.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.WorkflowUserTask_WorkflowUserTaskDefinition.toString(), workflowusertask_workflowusertaskdefinition.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return workflowUserTaskMendixObject;
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
			final system.proxies.WorkflowUserTask that = (system.proxies.WorkflowUserTask) obj;
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
		return "System.WorkflowUserTask";
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

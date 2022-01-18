package designPatterns.groupWork;

public abstract class LeaveHandler {
	protected LeaveHandler superVisor;

	public abstract void applyLeave(Leave leave);

	public void setSuperVisor(LeaveHandler superVisor) {
		this.superVisor = superVisor;
	}

}

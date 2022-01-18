package designPatterns.groupWork;

public class ProjectLeader extends LeaveHandler {

	@Override
	public void applyLeave(Leave leave) {
		if (leave.getNumberOfDays() <= 14) {
			System.out.println("Leave approved by " + this.getClass().getSimpleName());
		} else {
			superVisor.applyLeave(leave);
		}
	}

}

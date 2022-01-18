package designPatterns.groupWork;

public class TeamLeader extends LeaveHandler {

	@Override
	public void applyLeave(Leave leave) {
		if (leave.getNumberOfDays() <= 7) {
			System.out.println("Leave approved by " + this.getClass().getSimpleName());
		} else {
			superVisor.applyLeave(leave);
		}

	}

}

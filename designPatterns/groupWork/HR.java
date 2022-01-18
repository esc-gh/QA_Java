package designPatterns.groupWork;

public class HR extends LeaveHandler {

	@Override
	public void applyLeave(Leave leave) {
		if (leave.getNumberOfDays() <= 21) {
			System.out.println("Leave approved by " + this.getClass().getSimpleName());
		} else {
			System.out
					.println("Leave request rejected by " + this.getClass().getSimpleName() + "\nYou may never leave!");
			;
		}
	}

}

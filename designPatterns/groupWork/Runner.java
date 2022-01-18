package designPatterns.groupWork;

//Use Chain of Responsibility to construct a program to grant or reject employee leave requests
//For requests of 7 days or less, the Team Leader may approve
//For requests of 14 days or less, the Project Leader may approve
//For requests of 21 days or less, HR may approve
//Requests for longer time periods are denied

public class Runner {
	public static void main(String[] args) {
		TeamLeader teamLeader = new TeamLeader();
		ProjectLeader projectLeader = new ProjectLeader();
		HR hr = new HR();

		teamLeader.setSuperVisor(projectLeader);
		projectLeader.setSuperVisor(hr);

		teamLeader.applyLeave(new Leave(6));
		teamLeader.applyLeave(new Leave(10));
		teamLeader.applyLeave(new Leave(20));
		teamLeader.applyLeave(new Leave(25));

	}
}

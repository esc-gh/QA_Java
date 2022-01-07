package com.qa;
public class Results {
	public int physics;
	public int chemistry;
	public int biology;
	public int total;
	public double percentage;

	public void marks() {
		total = physics + chemistry + biology;
		System.out.println("Physics mark: "+physics+"/150");
		System.out.println("Chemistry mark: "+chemistry+"/150");
		System.out.println("Biology mark: "+biology+"/150");
		System.out.println("Total mark: "+total+"/450");
	}
	
	public void percent() {
		marks();
		double percentage = (physics + chemistry + biology)*100/450;
		int fails = 0;
		System.out.println("Overall percentage: "+percentage+"%");
//		if (physics < 90) {
//			System.out.println("Physics score under 60%. Fail");
//		} else if (chemistry < 90) {
//			System.out.println("Chemistry score under 60%. Fail");
//		} else if (biology < 90) {
//			System.out.println("Biology score under 60%. Fail");
//		} if (total < 270) {
//			System.out.println("Total score under 60%. Fail.");
//		}
		if (physics < 90) {
			System.out.println("Physics score under 60%. Fail");
			fails += 1;
		} if (chemistry < 90) {
			System.out.println("Chemistry score under 60%. Fail");
			fails += 1;
		} if (biology < 90) {
			System.out.println("Biology score under 60%. Fail");
			fails += 1;
		} if (total < 270) {
			System.out.println("Total score under 60%. Fail.");
		} if (fails > 0) {
			System.out.println("Failed "+fails+" subject(s).");
		}
	}
}
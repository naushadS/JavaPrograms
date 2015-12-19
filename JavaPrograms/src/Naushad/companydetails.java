package Naushad;

public class companydetails {
	String founderName="Naushad Shukoor";

	public companydetails(int turnover){
		System.out.println("company turnover="+turnover);
	}

	public void yearfounded(int yearfounded){
		System.out.println("Founded:"+yearfounded);
	}
	public String founderName(){
		return founderName;
	}
	public void founder(){
		System.out.printf("Founded by %s \n",founderName());

	}
}
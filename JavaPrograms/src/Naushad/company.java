package Naushad;

import java.util.Scanner;

public class company {

	public static void main(String[] args) {
		int yearfounded;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("*****************");
		System.out.println("ABC Company Private Ltd:");

		companydetails cd=new companydetails();
		
		System.out.println("what year was this company founded?");
		yearfounded=input.nextInt();
		
		cd.yearfounded(yearfounded);
		cd.founder();
		System.out.println("*****************");
	}

}

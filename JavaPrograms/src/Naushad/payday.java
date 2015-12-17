package Naushad;

import java.util.Scanner;

public class payday {

	public static void main(String[] args) {
		int week;

		Scanner input=new Scanner(System.in);

		System.out.println("Enter Week Number(of current month)");
		week=input.nextInt();

		switch(week){
		case 1:
			System.out.println("your are 3 weeks away from getting salary");
			break;		
		case 2:
			System.out.println("your are 2 weeks away from getting salary");
			break;	
		case 3:
			System.out.println("your are 1 week away from getting salary");
			break;	
		case 4:
			System.out.println("you will be getting salary by the end of this week");
			break;	
		default:
			System.out.println("wrong week number entered.Try again");
			break;
		}

	}

}

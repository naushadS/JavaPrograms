package Naushad;

import java.util.Scanner;

public class temperature {

	public static void main(String[] args) {
		double temp;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter todays temperature nigga");
		temp=input.nextDouble();
		

		System.out.print("The Temperature today is ");
		System.out.print(temp);
		System.out.println("° Celsius");
	}
}

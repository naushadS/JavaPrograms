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
		
		if(temp<50){
			System.out.println("you can survive in this weather");
		}else{
			System.out.println("you may die due to heat");
		}
	}
}

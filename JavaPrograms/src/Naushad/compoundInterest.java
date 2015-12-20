package Naushad;

import java.util.Scanner;

public class compoundInterest {
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		
	double amount,principal,rate;
	int years;
	System.out.println("Enter the principal amount:");
	principal=input.nextDouble();
    
	System.out.println("Enter the rate of interest:");
	rate=input.nextDouble();
	
	System.out.println("Enter the number of years:");
	years=input.nextInt();
	
	for(int year=1;year<=years;year++){
		amount=principal*Math.pow(1+rate, year);
		System.out.println("year "+year+"  =  "+amount);
	}
	input.close();
	}
}

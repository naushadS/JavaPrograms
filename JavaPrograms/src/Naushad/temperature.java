package Naushad;

import java.util.Scanner;

public class temperature {

	public static void main(String[] args) {
		double temp,bodytemp=37;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter todays temperature nigga");
		temp=input.nextDouble();
		

		System.out.print("The Temperature today is ");
		System.out.print(temp);
		System.out.println("° Celsius");
		
		if(temp>50){
			System.out.println("its really hot today");
		}else{
			System.out.println("its not that hot today");
			if(temp<15){
				System.out.println("are you a native of russia?");
			}else{
				System.out.println("you are from india ,arent you?");
			}
		}
		
		if(temp<0 || temp>50){
			System.out.println("you may die due to extreme weather conditions");
		}else{
			System.out.println("you can survive in this weather");
		}
		
		
	}
}

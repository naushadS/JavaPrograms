package Naushad;

import java.util.Scanner;

public class temperature {

	public static void main(String[] args) {
		double temp,bodytemp=37;
		
		
		//array creation (Type 1) (Cities corresponding to counter) 
		String Counter[]={"Mumbai","Delhi","Chennai"};
		
		//array creation (Type 2)
				int tempInCities[]=new int[3];
				tempInCities[0]=15;
				tempInCities[1]=20;
				tempInCities[2]=25;
				
				
		//printing out elements
		System.out.println("Index"+"\t"+"Value");
		for(int counter=0;counter<tempInCities.length;counter++){
			System.out.println(Counter[counter]+"\t"+tempInCities[counter]);
		};
				
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter todays temperature nigga");
		temp=input.nextDouble();
		

		System.out.print("The Temperature today is ");
		System.out.print(temp);
		System.out.println("� Celsius");
		
		System.out.println(temp>bodytemp? "you will get sick":"you wont get sick");
		
		if(temp>=60){
			System.out.println("okay ,you can cook omlette on any hot surface outside today");
		}else if (temp>=50){
			System.out.println("damn!its really hot today!");
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
		
		input.close();
	}
}

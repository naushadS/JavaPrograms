package Naushad;

import java.util.Scanner;

public class totalNaverage {

	public static void main(String[] args) {
		int n,counter=0,total=0,average,num;
		Scanner input=new Scanner(System.in);
		System.out.println("enter total number of numbers");
		n=input.nextInt();
		while (counter <n){
			System.out.println("enter num"+(counter+1));
			num=input.nextInt();
			total += num;
			counter++;
		}
		average=total/n;
		System.out.println("total = "+total);
		System.out.println("average = "+average);
	}

}

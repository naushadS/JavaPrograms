package Naushad;

import java.util.Random;
import java.util.Scanner;

public class freqOfDice {

	public static void main(String[] args) {
		int sum=0;
		int freq[]=new int[7];
        
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of dice roll-ups:");
		int numOfRollups=input.nextInt();

		Random rand=new Random();
		for(int roll=1;roll<=numOfRollups;roll++){
			freq[1+rand.nextInt(6)]++;
		}

		System.out.println("Face"+"\t"+"Frequency");

		for(int face=1;face<freq.length;face++){
			System.out.println(face+"\t"+freq[face]);
			sum+=freq[face];
		}

        //just to be sure ;)
		System.out.println("Sum of all the frequencies is "+sum);
		input.close();
	}
     
}

package Naushad;

import java.util.Random;

public class helloworld {

	public static void main(String[] args) {
		int luckyNumber;
		
		System.out.println("Hello World!"); //prints message on screen
		
		Random rand=new Random();
		luckyNumber=1+rand.nextInt(99);
		System.out.println("Your lucky number for today:"+luckyNumber); //prints out users lucky number
		
	}
}

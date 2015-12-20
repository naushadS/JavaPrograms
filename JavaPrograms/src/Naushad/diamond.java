package Naushad;

import java.util.Scanner;

public class diamond {

	public static void main(String[] args) {

        /*
           1
          212
         32123
        4321234
         32123
          212
           1
        */
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size(till 17,it looks good) (Also input odd numbers only)");
		int size=input.nextInt();

		int numOfColumns=1;
		int start;
		int numOfSpaces=size/2;

		for(int row=1;row<=size;row++){
			if(row<=((size/2)+1)){
				start=row;
			}else{
				start=(size+1)-row;
			}


			for(int space=1;space<=numOfSpaces;space++){
				System.out.print(" ");
			}


			for(int column=1;column<=numOfColumns;column++){
				int middleColumn=(numOfColumns/2)+1;	
				System.out.print(start);
				if(column<middleColumn){
					start--;
				}else{
					start++;
				}
			}
			System.out.println();

			if(row<((size/2)+1)){
				numOfSpaces--;
				numOfColumns+=2;
			}else {
				numOfSpaces++;
				numOfColumns-=2;
			}
		}
		input.close();
	}
}

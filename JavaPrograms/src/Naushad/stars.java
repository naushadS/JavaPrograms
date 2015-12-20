package Naushad;

public class stars {

	public static void main(String[] args) {
		
		
		 /* 
		 Output:
		 
		 *
		 **
		 ***
		 ****
		 *****
		 
		 */
		 
		for(int rows=1;rows<=5;rows++){
			for(int numberOfStars=1;numberOfStars<=rows;numberOfStars++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		/* 
		 Output:
		 
		     *
		    **
		   ***
		  ****
		 *****
		 
		 */
		 
		for(int rows=1;rows<=5;rows++){
			for(int spaces=1;spaces<=(5-rows);spaces++){
				System.out.print(" ");
			}
			for(int numberOfStars=1;numberOfStars<=rows;numberOfStars++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		/* 
		 Output:
		 
              * 
             * * 
            * * * 
           * * * * 
          * * * * * 
		 
		 */
		
		for(int rows=1;rows<=5;rows++){
			for(int spaces=1;spaces<=(5-rows);spaces++){
				System.out.print(" ");
			}
			for(int numberOfStars=1;numberOfStars<=rows;numberOfStars++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		/* 
		 Output:
		 
             * 
            * * 
           * * * 
          * * * * 
         * * * * * 
          * * * * 
           * * * 
            * * 
             * 
		 
		 */
		int numOfColumns=1;
		int numOfSpaces=4;
		for(int rows=1;rows<=10;rows++){
			for(int space=1;space<=numOfSpaces;space++){
				System.out.print(" ");
			}
			for(int column=1;column<=numOfColumns;column++){
				System.out.print("* ");
			}
			System.out.println();
			if(rows<5){
				numOfSpaces--;
				numOfColumns++;
			}else{
				numOfSpaces++;
				numOfColumns--;
			}
		}
	}
}

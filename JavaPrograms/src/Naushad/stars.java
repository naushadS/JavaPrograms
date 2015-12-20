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
		
		for(int rows=1;rows<=5;rows++){
			for(int spaces=1;spaces<=(5-rows);spaces++){
				System.out.print(" ");
			}
			for(int numberOfStars=1;numberOfStars<=rows;numberOfStars++){
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int rows=4;rows>=1;rows--){
			for(int spaces=1;spaces<=(5-rows);spaces++){
				System.out.print(" ");
			}
			for(int numberOfStars=1;numberOfStars<=rows;numberOfStars++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

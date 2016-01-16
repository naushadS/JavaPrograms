package Naushad;

public class arrayManipulation {

	public static void main(String[] args) {
		
		//single dimensional array
		int originalNumbers[]={1,2,3,4};
		
		//multidimensional array
		int multidimensionalArray[][]={{1,2,3},{4,5},{6,7,8,9}};
		
		System.out.println("length of single dimensional array");
		System.out.println(originalNumbers.length);
		System.out.println("length of multi-dimensional array");
		System.out.println(multidimensionalArray.length);
		System.out.println("*********************");
		
		System.out.println("Total of single dimensional array before manipulation:"+total(originalNumbers));
		System.out.println();
		
		//calling method to add 4 to Single Dimensional Array values
		add4(originalNumbers);
		
		//enhanced for-loop(for displaying new Single Dimensional Array values)
        System.out.println("Displaying Single-Dim Array Values:");
		for(int y:originalNumbers){
			System.out.print(y+"\t");
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println("Total of single dimensional array after manipulation:"+total(originalNumbers));
		
		
		//calling method for displaying Multiple-Dimensional Array values
		dispMultiDimArray(multidimensionalArray);

	}


	//method to add 4 to Single Dimensional Array values
	public static void add4(int singledimarray[]){
		for(int counter=0;counter<singledimarray.length;counter++)
			singledimarray[counter]+=4;	
	}
	
	
    //method for displaying Multiple Dimensional Array values
	public static void dispMultiDimArray(int multidimarray[][]) {
		System.out.println();
		System.out.println("Displaying Multi-Dim Array Values:");
		for(int row=0;row<multidimarray.length;row++){
			for(int column=0;column<multidimarray[row].length;column++){
				System.out.print(multidimarray[row][column]+"\t");
			}
			System.out.println();
		}
	}
	
	//method for getting the total of all Single-Dimensional array values (takes in variable length arguments)
	public static int total(int...num) {
		int total=0;
		for(int y:num)
		total+=y;
		return total;
	}
}

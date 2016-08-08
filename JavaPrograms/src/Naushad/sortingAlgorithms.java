package Naushad;

import java.io.IOException;


public class sortingAlgorithms {
	 

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int array[]=new int[6];
		for(int i=0;i<6;i++){
			array[i]=(int)(Math.random()*90)+10;
	    }
		
		System.out.println("Before sort:");
		printArray(array);
		
		//bubbleSort(array);
		selectionSort(array);
		
	}

	private static void selectionSort(int array[]) {
		System.out.println("\nSelection Sort: \n");
		int n=array.length;
		for(int pass=1;pass<=n-1;pass++){ //for passes ( requires (n-1) passes )
			
			//set 1st element as smallest
			int small=array[pass-1];
			int pos=pass-1;
			
			//searching the smallest element from the remaining
			for(int i=pass;i<=n-1;i++){
				if(small>array[i]){
					small=array[i];
					pos=i;
				}
			}
			
			//swap if found the smallest from the remaining
			if(array[pass-1]!=small){
				System.out.println("Swapping "+array[pass-1]+" and "+array[pos]);
			int temp=array[pass-1];
			array[pass-1]=array[pos];
			array[pos]=temp;
			}
			System.out.println("After Pass "+pass);
			printArrayWithIndex(array);
		}		
	}

	private static void bubbleSort(int array[]) {
		System.out.println("\nBubble Sort: \n");
		int n=array.length;
		for(int pass=1;pass<=n-1;pass++){  //requires (n-1) passes since each pass places largest value in place
			for(int current=0;current<=n-pass-1;current++){
				if(array[current]>array[current+1]){
					System.out.println("Swapping "+array[current]+" and "+array[current+1]);
					swap(current,current+1,array);
				}
				printArrayWithIndex(array);
			}
			System.out.println("After Pass "+pass);
			printArray(array);
			System.out.println();
		}
	}
	
	private static void printArrayWithIndex(int array[]){
		int len=array.length;
		for(int i=0;i<len;i++){
		System.out.print(i+"  ");
		}
		System.out.println();
		for(int i=0;i<len;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println("\n");
	}
	
	private static void printArray(int array[]){
		int len=array.length;
		for(int i=0;i<len;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	private static void swap(int indexI, int indexJ,int array[]) {
		int temp=array[indexI];
		array[indexI]=array[indexJ];
		array[indexJ]=temp;
	}
	
}

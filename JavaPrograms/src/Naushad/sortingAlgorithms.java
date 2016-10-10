package Naushad;

import java.io.IOException;


public class sortingAlgorithms {
	 

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int array[]=new int[7];
		for(int i=0;i<array.length;i++){
			array[i]=(int)(Math.random()*90)+10; //low =10 high =100
	    }
		
		System.out.println("Before sort:");
		printArray(array);
		
		//bubbleSort(array);
		//selectionSort(array);
		//insertionSort(array);
		//mergeSort(array);   /* Print array*/ for(int m=0;m<=(array.length)-1;m++){System.out.print(array[m]+" ");}
		//quickSort(array,0,6);   /* Print array*/ for(int m=0;m<=(array.length)-1;m++){System.out.print(array[m]+" ");}
		
	}
	
	private static void quickSort(int array[],int start,int end){  //followed ravindrababu's
		if(start < end){
		int pIndex=partition(array, start, end);
		quickSort(array, start, pIndex-1);
		quickSort(array, pIndex+1, end);
		}
	}
	
	private static int partition(int array[],int start,int end){ 
		int pivot=array[end]; 
		int i=start-1; 
		for(int j=start;j<=end-1;j++){ 
			if(array[j]<pivot){ 
				i++;
				swap(i, j, array);
			}
		}
		swap(i+1, end, array);
		return i+1;
	}
	
	private static void mergeSort(int array[]){ //followed mycodeschool
        int n=array.length;
        if(n<2)
            return;
        int mid=n/2;
        int left[]=new int[mid];
        int right[]=new int[n-mid];
        for(int i=0;i<=mid-1;i++){
            left[i]=array[i];
        }
        for(int i=mid;i<=n-1;i++){
            right[i-mid]=array[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left,right,array);
    }
	
    private static void merge(int left[],int right[],int array[]){ 
        int nL=left.length;
        int nR=right.length;
        int i=0,j=0,k=0;
        while(i<nL && j<nR){
            if(left[i]<right[j]){
                array[k++]=left[i++];
            }else{
                array[k++]=right[j++];
                
            }
        }
        while(i<nL){
            array[k++]=left[i++];
        }
        while(j<nR){
            array[k++]=right[j++];
        }
       }
    
    
	private static void insertionSort(int array[]){  //followed mycodeschool
		System.out.println("\nInsertion Sort: \n");
		int n=array.length;
		for(int pass=1;pass<=n-1;pass++){
			int value=array[pass];
			int hole=pass;
			while(hole>0 && array[hole-1]>value){
				array[hole]=array[hole-1];
				hole--;
			}
			array[hole]=value;
			System.out.println("After Pass "+pass);
			printArrayWithIndex(array);
		}
	}
	
	
	private static void selectionSort(int array[]) { //followed yusufshakeel's
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

	private static void bubbleSort(int array[]) {    //followed yusufshakeel's
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
	
	//used for bubble sort
	private static void swap(int indexI, int indexJ,int array[]) {
		int temp=array[indexI];
		array[indexI]=array[indexJ];
		array[indexJ]=temp;
	}
	
}

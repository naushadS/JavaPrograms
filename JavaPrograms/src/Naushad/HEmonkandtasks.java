package Naushad;

import java.io.*;
import java.util.*;

class HEmonkandtasks {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int i,j,count=0;
		long n,N=0L;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		long Array[][]=new long[T][100000];
		long Count[][]=new long[T][100000];
		Map<Long,Long> Map=new HashMap<>();
		
		for(i=0;i<T;i++){ //loops through No. of sets
			N=Integer.parseInt(br.readLine());
			String temp[]=br.readLine().split(" ");
			for(j=0;j<N;j++){  //loops through No of days
				
				
				    //get the no of tasks of each day's in Array[i][j]
					Array[i][j]=Integer.parseInt(temp[j]);
					
					//Count of bit-representation of Array[i][j]
					n=Array[i][j];
					while(n!=0){
						n=n&(n-1);
						count++;
					}
					Count[i][j]=count;
					count=0;
					
					//inserting keys and respective values into hashmap
					Map.put(Array[i][j],Count[i][j]);
			}
		}
		
		
		//sorting hashmap using insertion sort method(with stable  support)
				for(i=0;i<T;i++){
					for(j=0;j<N-1;j++){
				         if(Map.get(Array[i][j])>Map.get(Array[i][j+1])){
				        	 long temp=Array[i][j];
				        	 Array[i][j]=Array[i][j+1];
				        	 Array[i][j+1]=temp;
				         }
				       }
					}
			
		//displaying sorted hashmap
		for(i=0;i<T;i++){
			for(j=0;j<N;j++){
				System.out.print(Array[i][j]+" ");
			}
			System.out.println();
		}
	}

}

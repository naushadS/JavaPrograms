package Naushad;

import java.util.*;
import java.io.*;

public class TCSminprodarray {
	public static void main(String args[]) throws IOException{
		
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		
		String line = br.readLine();
		
		
		String[] temp = line.split(" ");
		final int n  = Integer.parseInt(temp[0]);	//n=array row length
		int k = Integer.parseInt(temp[1]);//k=modifications allowed
		
		int Oa1[] = new int[n];
		int a1[] = new int[n];
		int a2[] = new int[n];
				
		line = br.readLine();
		String[] arr1 = line.split(" ");
		
		line = br.readLine();
		String[] arr2 = line.split(" ");
		
		for(int i=0; i< n; i++) {
			a1[i] = Integer.parseInt(arr1[i]);	
	}
	
		for(int i=0; i< n; i++) {
			a2[i] = Integer.parseInt(arr2[i]);	
	}
		Oa1=a1.clone();
	
		
		//Possibilities of increase
		int IncrSets = n;
		int IncrSetAns[]=new int[IncrSets];
		for(int j=0;j<IncrSets;j++){
			a1[j]+=2*k;
			IncrSetAns[j]=prod(a1,a2,n);
			a1=Oa1.clone();
		}
		
		//Possibilities of decrease
		int DecrSets = n;
		int DecrSetAns[]=new int[DecrSets];
		for(int j=0;j<DecrSets;j++){
			a1[j]-=2*k;
			DecrSetAns[j]=prod(a1,a2,n);
			a1=Oa1.clone();
		}
		
		//
		
		Arrays.sort(IncrSetAns);
		Arrays.sort(DecrSetAns);
		int min1=IncrSetAns[0];
		int min2=DecrSetAns[0];
		if(min1<min2){
			System.out.println(min1);
		}else{
			System.out.println(min2);
		}
		
}
	static int prod(int a1[],int a2[],int n){
		//finding product of two arrays
				int ans=0;
				for(int i=0;i<n;i++){
					ans+=a1[i]*a2[i];
				}
				return ans;	
	}
}

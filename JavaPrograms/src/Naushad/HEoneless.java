package Naushad;

import java.io.*;

public class HEoneless {

	public static void main(String[] args) throws IOException {
		int i;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String input=br.readLine();
        int arraySize=Integer.parseInt(input);
        int array[]=new int[arraySize];
        
        //read the array
        for(i=0;i<array.length;i++){
        	array[i]=Integer.parseInt(br.readLine());
        }
        
        //reduction
        for(i=0;i<array.length;i++){
        	array[i]--;
        }
        
        //display
        for(i=0;i<array.length;i++){
        	System.out.println(array[i]);
        }
        
        
        
	}

}

package Naushad;

import java.io.*;

class HEcountdivisors {

	public static void main(String[] args) throws IOException {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      String temp[] =br.readLine().split(" ");
      int l=Integer.parseInt(temp[0]);
      int r=Integer.parseInt(temp[1]);
      int k=Integer.parseInt(temp[2]);
      
      int count=0;
      for(int i=l;i<=r;i++){
    	  if(i%k==0){
    		  count++;
    	  }
      }
      System.out.println(count);
      
	}

}

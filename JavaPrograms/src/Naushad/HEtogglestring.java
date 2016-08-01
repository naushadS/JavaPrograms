package Naushad;

import java.io.*;

class HEtogglestring {
 public static void main(String args[]) throws IOException{
	 
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 String str=br.readLine();
	 
	 //input string constraint(limit to 100 chars)
	 int MAXCHAR=100;
	 int MaxLength=(str.length()<MAXCHAR? str.length() : MAXCHAR);
	 str=str.substring(0, MaxLength);
	 
	 //toggled string & display
	 StringBuilder toggled=new StringBuilder(str.length());
     for(char a : str.toCharArray()){
		if(Character.isUpperCase(a)){
			a= Character.toLowerCase(a);
		 }else{
			a= Character.toUpperCase(a);
		 }
    	 toggled.append(a);
     }	//end for loop
	 System.out.println(toggled); 
 }
}

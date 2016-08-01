package Naushad;

import java.io.*;
public class HEpalindrome {

	public static void main(String[] args) throws IOException {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

     String str=br.readLine();
     
     //using naive method
     String rev="";
     
     for(int i=(str.length()-1);i>=0;i--){
    	 rev+=str.charAt(i);
     }
     
     if(str.equalsIgnoreCase(rev)){
    	 System.out.println("YES");
     }else{
    	 System.out.println("NO");
     }
     
     
     //using stringbuilder
     /* if(new StringBuilder(str).reverse().toString().equalsIgnoreCase(str)){
    	  System.out.println("YES");
      }else{
     	 System.out.println("NO");
      }
*/
	}

}

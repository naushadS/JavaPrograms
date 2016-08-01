package Naushad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HEcountofnumbers {

	public static void main(String[] args) throws IOException {
		    	int count[]={0,0,0,0,0,0,0,0,0,0};
		        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		        String num=br.readLine();
		        
		        for(int i=0;i<num.length();i++){
		        	if(num.charAt(i)=='0')
		        	    count[0]++;
		        	else if(num.charAt(i)=='1')
		        	    count[1]++;  
		        	else if(num.charAt(i)=='2')
		        	    count[2]++;
		        	else if(num.charAt(i)=='3')
		        	    count[3]++;  
		        	else if(num.charAt(i)=='4')
		        	    count[4]++;  
		        	else if(num.charAt(i)=='5')
		        	    count[5]++;  
		        	else if(num.charAt(i)=='6')
		        	    count[6]++;  
		        	else if(num.charAt(i)=='7')
		        	    count[7]++;  
		        	else if(num.charAt(i)=='8')
		        	    count[8]++;  
		        	else if(num.charAt(i)=='9')
		        	    count[9]++;  		        
		        	}
		        
		        
		        for(int i=0;i<=9;i++){
		        	System.out.println(i+" "+count[i]);
	        }	        
		    }

	
	}


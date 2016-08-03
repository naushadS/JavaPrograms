package Naushad;

import java.io.*;
class HEfactorial {
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int fact=1;
        for(int i=2;i<=n;i++){
        	fact*=i;
        }
        System.out.println(fact);
	}

}

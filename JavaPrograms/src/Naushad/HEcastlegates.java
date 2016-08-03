package Naushad;

import java.io.*;
class HEcastlegates {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		int n,h,i,j,count[]=new int[T];
		for(h=0;h<T;h++){
			n=Integer.parseInt(br.readLine());
			for(i=1;i<n;i++){
				for(j=(i+1);j<=n;j++){
						if((i^j)<=n){
							count[h]++;											
					}
				}
			}			
		}	
		for(h=0;h<T;h++){
			System.out.println(count[h]);
		}
	}
}

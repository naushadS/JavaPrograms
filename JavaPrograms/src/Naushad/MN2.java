package Naushad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MN2 {

	public static void main(String[] args) throws IOException,NullPointerException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String inp1=br.readLine();
		String input_dps[]=inp1.split(" ");
		String inp2=br.readLine();
		String input_hp[]=inp2.split(" ");
		
		int length=input_dps.length;
		int dps[]=new int[length];
		int hp[]=new int[length];
		
		int additionsDPS=0;
		for(int i=0;i<length;i++){
		dps[i]=Integer.parseInt(input_dps[i]);
		hp[i]=Integer.parseInt(input_hp[i]);
		}
		
		int total = 0;
		for(int i=0;i<length;i++){
		for(int j=i;j<length;j++){
			additionsDPS+=dps[j];
		}
		
		total+=(hp[i]*additionsDPS);
		additionsDPS=0;
		}
		System.out.println(total);
	}

}

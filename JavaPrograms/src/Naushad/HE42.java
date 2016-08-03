package Naushad;
import java.io.*;
public class HE42 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuffer b=new StringBuffer();
		int inp=Integer.parseInt(br.readLine());
		while(inp!=42){
			b.append(inp+" ");
			inp=Integer.parseInt(br.readLine());
		}
		String bb[]=b.toString().split(" ");
		for(int i=0;i<bb.length;i++){
			System.out.println(bb[i]);
		}
	}
}

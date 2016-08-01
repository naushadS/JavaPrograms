package Naushad;
import java.io.*;

class HEfindproduct {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int arraySize=Integer.parseInt(br.readLine());
        int a[]=new int[arraySize];
        
        String inp=br.readLine();
        String input[]=inp.split(" ");
        
        long ans=1;
        for(int i=0;i<arraySize;i++){
           a[i]=Integer.parseInt(input[i]);
           ans=((ans*a[i])%((long)Math.pow(10, 9)+7));
        }
        System.out.println(ans);
	}
}
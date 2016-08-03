package Naushad;
import java.io.*;
class HEprofilephoto {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int L=Integer.parseInt(br.readLine());
		int N=Integer.parseInt(br.readLine());
		
		
		
		//get width's and height's
		int WH[][]=new int[N][2];
		String temp[];
		for(int i=0;i<N;i++){
			temp=br.readLine().split(" ");
			WH[i][0]=Integer.parseInt(temp[0]);
			WH[i][1]=Integer.parseInt(temp[1]);
		}
		
		for(int i=0;i<N;i++){
		if(WH[i][0]<L || WH[i][1]<L){
			System.out.println("UPLOAD ANOTHER");
		}else if(WH[i][0]>=L && WH[i][1]>=L){
			if(WH[i][0]==WH[i][1]){
				System.out.println("ACCEPTED");
			}else{
				System.out.println("CROP IT");
			}
		}
		}
	}
}

package Naushad;

import java.io.*;

public class MN1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String inp=br.readLine();
		String input[]=inp.split(" ");
		int no_of_classes=Integer.parseInt(input[0]);
		int no_of_cakes=Integer.parseInt(input[1]);
		
		int students_in_class[]=new int[no_of_classes];
		for(int i=0;i<no_of_classes;i++){
			students_in_class[i]=Integer.parseInt(br.readLine());
		}
		
		//calculation
		int totalStudents=0;
		for(int i=0;i<no_of_classes;i++){
			totalStudents+=students_in_class[i];
		}

		float output=(float)totalStudents/(float)no_of_cakes;
		System.out.println((int)Math.ceil(output));
	}
}

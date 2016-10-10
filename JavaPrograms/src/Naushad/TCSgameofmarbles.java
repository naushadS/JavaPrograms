package Naushad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TCSgameofmarbles {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		N=N/2;
		
	    int sallyPoints=0;
	    int darrelPoints=0;
		int correctAnswer[]=new int[N];
		int passAnswer=0;
		String[] qpName = new String[N];
		String[] apName = new String[N];
		String[] question = new String[N];
		String[] answer = new String[N];
		int[][] setsArr = new int[N][7];
		int[] ansArr = new int[N];
		int[] result = new int[N];
		String gameResult;
		
		for(int i=0;i<N;i++){
		//Question 
			question[i]= br.readLine();
			String[] qLine = question[i].split(" ");
			qpName[i] = qLine[0];
			
			try{
				String z=qLine[1];
		    }catch(Exception e){
		    	System.out.println("Invalid Input");
		    	System.exit(0);
		    }
		    String setsLine = qLine[1];
		    
			String[] tempsetsarr = setsLine.split(",");
			for(int j=0;j<tempsetsarr.length;j++){
				setsArr[i][j]=Integer.parseInt(tempsetsarr[j]);   //3,5
			}
			
			
			//ANSWER
			answer[i]= br.readLine();
			String[] aLine = answer[i].split(" ");
		    apName[i] = aLine[1];                           //darrel
		    answer[i]=aLine[2];
			if(answer[i].equals("PASS")){
				ansArr[i] = 65001;
			}else{
				ansArr[i] = Integer.parseInt(aLine[2]); //15
			}
			
			
			
		}
		
		//calculating result
		for(int i=0;i<N;i++){  //loops through no of test cases
		for(int j=0;j<(setsArr[i].length)-1;j++){  //loops through no setsArray
			    
			
			    
			    result[i]=lcm(setsArr[i][j], setsArr[i][j+1]);
			    if(ansArr[i]==65001){
			    	passAnswer=result[i];
			    }
			    else if(result[i]==ansArr[i]){
					correctAnswer[i]=1;
					if(apName[i].equals("Darrel")){ 
						darrelPoints+=10;
					}else{
						sallyPoints+=10;
					}
				}
				
				
			  }
		    }
		
		
		//final output
		for(int i=0;i<N;i++){ 
			//loops through no of test cases
			System.out.print(qpName[i]+"\'s question is: "+setsArr[i][0]);
			for(int j=1;j<(setsArr[i].length) && setsArr[i][j]!=0;j++){  //loops through no setsArray
				System.out.print(","+setsArr[i][j]);
			}
			System.out.println();
			
			if(correctAnswer[i]==1){
			System.out.println("Correct Answer");
			System.out.println(apName[i]+":10points");
			}else{
				if(ansArr[i]==65001){
					System.out.println("Question is PASSed");
					System.out.println("Answer is: "+passAnswer);
					System.out.println(apName[i]+":0point");
				}else{
				System.out.println("Wrong Answer");
				System.out.println(apName[i]+":0points");
				}
			}
			
			
		}
		System.out.println("Total Points:");
		System.out.println("Sally: "+sallyPoints+"points");
		System.out.println("Darrel: "+darrelPoints+"points");
		if(sallyPoints<darrelPoints){
			gameResult="Darrel is winner";
		}else if(sallyPoints>darrelPoints){
			gameResult="Sally is winner";
		}else{
			gameResult="Draw";
		}
		System.out.println("Game Result: "+gameResult);
		
	}

	private static int lcm(int num1,int num2) {
		int a = num1;
		int b = num2;  
		int lcmReturnValue = 0;
		for(int i = 1; i <= a; i++) {
			if(i*b % a == 0){
		        lcmReturnValue=Math.abs(i*b);
			    i=a;
			}
		}
		return lcmReturnValue;
	}
}

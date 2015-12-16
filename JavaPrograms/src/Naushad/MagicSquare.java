package Naushad;

import java.util.*;
public class MagicSquare{
Scanner in = new Scanner(System.in);
int[][] square; //initialised the array
int value;
int posY,posX;

public static void main(String[] args){
	
MagicSquare n=new MagicSquare();
n.square=n.createSquare();
n.fillMethod();
n.displaySquareWCords();
n.displaySquare();
}//end of main method


public int[][] createSquare(){
    int[][] temp;
	System.out.println("Enter the square vector");
	int num = in.nextInt();
	temp=new int[num][num];
	return temp;
}//end of createSquare

public void displaySquareWCords(){
	for(int row=0;row<square.length;row++){
		for(int column=0;column<square[row].length;column++)
			System.out.print("("+row+","+column+"):"+square[row][column]+" ");
		System.out.println();
	}
     System.out.println("*********************************");
	
}//end of displaySquare

public void displaySquare(){
	for(int row=0;row<square.length;row++){
		for(int column=0;column<square[row].length;column++)
			System.out.print(square[row][column]+" ");
		System.out.println();
	}
	System.out.println("*********************************");
}//end of displaySquare

public void fillMethod(){
	value=1;
	System.out.println("Enter the starting position(For Eg. 0 1):");
	posY = in.nextInt();
	posX = in.nextInt();
	setValue(posY,posX);
	int tempY,tempX;
	int index=(int)Math.pow(square.length,2)-1;
	for(int i=0;i<index;i++){
		tempY=posY;
		tempX=posX;
		posY -= 1; //up by 1
        posX += 1; //right by 1 
        fold();
		if(square[posY][posX]==0){
			setValue(posY,posX);
		}
		else{
			posY=tempY;
			posX=tempX;
			posY +=1; //down by 1
			posX=posX;
			fold();
			setValue(posY,posX);
		}
		
		}
}//ends fillMethod

public void setValue(int posY,int posX){
	square[posY][posX] = value;
	value++;
}

public void fold(){
	if(posY > square.length-1)
		posY=0;
	else if(posY < 0)
		posY=square.length-1;
	else
		posY=posY;
	
	if(posX > square.length-1)
		posX=0;
	else if(posX < 0)
		posX=square.length-1;
	else
		posX=posX;
}
}//end of class
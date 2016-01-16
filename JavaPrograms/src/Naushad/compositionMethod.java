package Naushad;

public class compositionMethod {
	
	private int date,month,year;
	
	public compositionMethod(int d,int m,int y){
		date=d;
		month=m;
		year=y;
		System.out.printf("%s\n",this);
	}
	
	public String toString(){
		return String.format("%d-%d-%d", date, month, year);
	}

}

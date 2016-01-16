package Naushad;

public class compositionExampleObject2 {
	private String name;
	private compositionMethod date;
	
	public compositionExampleObject2(String n,compositionMethod d){
		name=n;
		date=d;
	}
	public String toString(){
		return String.format("my name is %s.my birthday is %s",name,date);
	}

}

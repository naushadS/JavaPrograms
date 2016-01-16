package Naushad;

public enum cities {
	Mumbai("Maharashtra","Vada Pav"),
	Delhi("Uttar Pradesh","chaat"),
	Kolkata("West Bengal","Fish!!!!!!"),
	Trivandrum("Kerala","banana chips"),
	Punjab("Uttar Pradesh","sarson da saag ,makke di rotti");
	
	
	final String StateLocated,KnownFor;
	
	cities(String State, String Known){
		StateLocated=State;
		KnownFor=Known;
	}
	
	String getStateLocated(){
		return StateLocated;
	}
	
	String getKnownAs(){
		return KnownFor;
	}

}

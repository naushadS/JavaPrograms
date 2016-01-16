package Naushad;

import java.util.EnumSet;

public class EnumerationExample {

	public static void main(String[] args){
		System.out.println("--------------------------------------------------------");
		System.out.println("-City- \t\t-Location- \t\t-Known As-");
		System.out.println("--------------------------------------------------------");
		
		for(cities c:cities.values())
		    System.out.printf("%s\t\t%s\t\t%s\n",c ,c.StateLocated ,c.KnownFor);
		
		System.out.println("\n ++++++++ Demonstrating EnumSet.range +++++++++++\n");
		
		System.out.println("--------------------------------------------------------");
		System.out.println("-City- \t\t-Location- \t\t-Known As-");
		System.out.println("--------------------------------------------------------");
		
		for(cities c:EnumSet.range(cities.Delhi,cities.Trivandrum))
		    System.out.printf("%s\t\t%s\t\t%s\n",c ,c.StateLocated ,c.KnownFor);
		
	}

}

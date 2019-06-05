package What_to_eat;

import java.util.Scanner;

public class What_to_eat {
	
private static Scanner scnr;

public static void main(String [] args) {

	scnr = new Scanner(System.in);
	//.
	String eventType;
	int partySize;
	String result;
	String food = "the";
	String prepMethod = "and";
	
	System.out.println("Is this going to be a: casual, semi-formal or formal event?");
	
	eventType = scnr.next();
	
	System.out.println("How many people will be attending?");
	
	partySize = scnr.nextInt();
	
	
	if(eventType.equalsIgnoreCase("casual")) {
		food = "sandwiches ";
	}
	else if (eventType.equals("semi-formal")) {
		food =  ("fried chicken ");
	}
	else if (eventType.equals("formal")) {
		food = ("chicken parmesean ");
	}
	
	
	if(partySize == 1) {
		prepMethod = ("in the microwave.");
	}
	else if(partySize > 1 && partySize < 13) {
		prepMethod = ("in your kitchen.");
	}
	else if(partySize >= 13) {
		prepMethod = ("by a caterer.");
	}
	
	result = "Since you’re hosting a " + eventType + " for " + partySize + " participants, you should serve " + food + ""
			+ "prepared " + prepMethod;
	System.out.println(result);
	}
			
}


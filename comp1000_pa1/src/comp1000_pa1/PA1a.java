package comp1000_pa1;

import java.util.Scanner;

/**
 * Solution to the first part
 * 
 * @author Sarah Yussef 
 */
import.java.util.Scanner;

public class PA1a {
	
	/** 
	 * Starts the program 
	 * 
	 * @param args convert yards, feet and inches to a total number of inches 
	 */
	
	public static void main(String [] args) {
		//asks for input from the user
		Scanner in = new Scanner(System.in); 
		//insert number of yards
		System.out.print("Enter number of yards: ");
		int yards = in.nextInt();
		//insert number of feet
		System.out.print("Enter number of feet: ");
		int feet = in.nextInt();
		//insert number of inches
		System.out.print("Enter number of inches: ");
		int inches = in.nextInt();
		//calculate total in inches 
		int totalInches = (((yards * 3) + feet) * 12) + inches;
		//prints total in inches 
		System.out.println("Total number of inches: " + totalInches);
		
	}

}

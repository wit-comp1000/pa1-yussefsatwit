package comp1000_pa1;

import java.util.Scanner;

/**
 * Solution to the second part
 * 
 * @author Sarah Yussef 
 */

public class PA1b {
	
	/** 
	 * Starts the program in "reverse"
	 * 
	 * @param args convert a number of inches into yards, feet and inches
	 */
	
	public static void main(String[] args) {
		//asks for input from the user 
				Scanner in = new Scanner(System.in);
				//prints question
				System.out.print("Enter number of inches: ");
				//asks for number of inches 
				int inches = in.nextInt();
				//converts the number of inches into yards
				int yards = inches / 36;
				//one yard is 3feet=36inches so divide inches by 36 to find value in yards ^
				inches %= 36;
				// use the remainder from the inches
				int feet = inches / 12;
				// one feet is 12 inches so divide
				inches %= 12;
				//prints number of yards, feet and inches respectively 
				System.out.printf("Yards: %d%n", yards);
				System.out.printf("Feet: %d%n", feet);
				System.out.printf("Inches: %d%n", inches);
	}

}

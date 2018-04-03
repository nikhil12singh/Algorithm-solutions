package first;


/*-------------------------------------------------------------------------
// AUTHOR: Daniel "Cade" McClaughry
// FILENAME: Lab2.java
// SPECIFICATION: Takes input of first name and last name; generates full name in all upper-case, and counts characters in full name.
// FOR: CSE 110- Lab #2
// TIME SPENT: 45 minutes
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		String firstName = "";
		String lastName = "";
		String fullName = "";
		int nameLength = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter first name: "); // Asks users to enter first name.
		firstName = scan.nextLine();

		System.out.println("Please enter last name: "); // Asks users to enter last name.
		lastName = scan.nextLine();

		fullName = (firstName + " " + lastName); // Combines first and last name and then assigns this to variable
													// "fulLName".
		
		fullName = fullName.toUpperCase(); // Changes fullName to be all uppercase.
		nameLength = fullName.length(); // Finds the length of the full name.

		System.out.println("Your full name in capital letters is " + fullName); // Prints this message with the user's
																				// full name
		
		System.out.println("The length of your full name is " + nameLength + " characters"); // Prints the length of the
																								// user's full name.

		String title1 = new String("cse110");
		String title2 = "cse110";

		if (title1 == title2) {
			System.out.println("String comparison using \"==\" sign works");
		} else {
			System.out.println("String comparison using \"==\" does not work"); // Using the '==' method to compare the
																				// strings does not work in this case
		}
		if (title1.equals(title2)) {
			System.out.println("String comparison \"equals\" works.");
		} else {
			System.out.println("String comparison \"equals\" does not work.");
		}
	}

}

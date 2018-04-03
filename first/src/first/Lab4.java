package first;

//**********
//Austin Buss
//Lab4.java
//Displaying Menu Options and Arithmetic Operations
//CSE110- LAB 4
//4 Hours
//**********

import java.util.Scanner;

public class Lab4
{
	public static void main(String[] args)
	{
		Scanner keyin = new Scanner(System.in);

		int choice;
		int m, sum = 0;
		int n;
		int i = 1;
		int rem = 1;

		do
		{
			System.out.println("Please select an option from the following menu:");
			System.out.println("1)Calculate the sum of integers 1 to m.");
			System.out.println("2)Calculate the factorial of given number.");
			System.out.println("3)Find the first digit of the given number.");
			System.out.println("4)Quit");
			choice = keyin.nextInt ();
            
				switch(choice)
				{
					case 1 : System.out.println("Enter an integer: ");
							 m = keyin.nextInt ();
							 i = 1;
							 
							 while(i <= m)
							 {
								 sum = sum + i;
								 i++;
							 }
							 System.out.println("The sum of integers to " + m + " is " + sum);
							break;
					case 2 : System.out.println("Enter an integer: ");
							 n = keyin.nextInt ();
							 i = 1;
							 int fact = 1;
							 
							 while(i <= n)
							 {
								 fact = fact * i;
								 
								 i++;
							 }
							 System.out.println("The factorial of " + n + " is " + fact);
							break;
					case 3 : System.out.println("Enter an integer: ");
							 int digit = keyin.nextInt();
							 int num = digit;
							 
							 while(digit != 0)
							 {
								 rem = digit%10;
								 digit = digit/10;
							 }
							 System.out.println("The first digit of " + num + " is " + rem);
							break;
				}
			System.out.println();
		} while( choice != 4);
	}
}
package first;

/*-------------------------------------------------------------------------
//AUTHOR: Jadon Solomon
//FILENAME: Lab3
//SPECIFICATION: Final Grade Calculator
//FOR: CSE 110- Lab #3
//TIME SPENT: 2 hours
//-----------------------------------------------------------*/

//All "import" lines must be before class
import java.util.Scanner;
//class name should match the file name
public class Lab3
{public static void main(String[] args){
	double finalexamGrade = 50.0;
	double midtermGrade = 50.0;
	double homeworkGrade = 0.0;
	double finalGrade = 0.0;
		// a character called letterGrade
	char letterGrade = ' ';
		// a variable scan of type Scanner
	Scanner scan = new Scanner(System.in);
	
		//User input and validation:

		// Print a statement to the user asking for
		// student's homework grade
		//-->
	System.out.print("Enter your homework points: ");
		double  homeworkGrade = input.nextDouble();
		
		// Use the Scanner class to ask the user inputs
		//for 'homeworkGrade', 'midtermGrade' and 'finalexamGrade'.
		//-->
	System.out.print("Enter your homework points, midterm points, and final exam points received ");
		homeworkGrade = input.nextDouble();
		midtermGrade = input.nextDouble();
		finalexamGrade = input.nextDouble();

	if(homeworkGrade >= 0 & homeworkGrade =< 100){
			// Case of True condition (correct input)
			
			// Calculate "finalGrade":

			//write the formula to calculate the final grade
			//and store the result in the finalGrade variable
			//--> 
		finalGrade = ((finalexamGrade/200)*0.5)+(midtermGrade*0.25)+(homeworkGrade*0.25))*100;
		System.out.println("Your homework grade is " + finalGrade);
			
			// "if statement" - finding grade letter:

	if(finalGrade >= 50){
			letterGrade = 'P'
				// Case of True condition (finalGrade >= 50)
				// letter should be 'P'
				//-->

		} else {
			letterGrade = 'F'
				// Case of false condition (finalGrade < 50)
				// letter should be 'F'
				//-->
			}

			//checking the grade

	if(letterGrade = 'P'){
			System.out.println("You passed!");
					// Tell user that student have passed - look at sample output
					//-->
		} else	{ System.out.println("You didn't pass!"); }
					// Tell user that student have failed - look at sample output
					//-->
			}


		} else {
		// Case of false condition (wrong input)
		System.out.print("Renter your homework points: ");
			homeworkGrade = input.nextDouble();
		// Proper exit message for wrong input:
			
		//Use System.out. println to explain what happened to the user.
		// Make sure your output looks similar to sample output below
		//-->
		System.out.println("Incorrect input was entered for homework grade; grade not between 0 and 100");
		}

}//end main method
}//end Lab3 class
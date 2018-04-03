package first;


import java.util.Scanner;

/*-------------------------------------------------------------------------
// AUTHOR: Jadon Solomon
// FILENAME: Assignment5
// SPECIFICATION: Bank account with a bigger menu
// TIME SPENT: 6
//----------------------------------------------------------------------*/
public class Assignment5.java
{public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		char command;
		boolean flag;
		double enteredAmount1; 
		double enteredAmount2; 
		double enteredAmount=0;
		String input;
		
		public static void printMenu()
        System.out.println("Hello world");
        System.out.print("What is your bank account number? ");
		String enteredID = scan.nextLine();
		
        do
        {
            System.out.print("Intial checking account deposit: ");
            enteredAmount1 = scan.nextDouble();
			
            if ( enteredAmount1 <= 0 )
            {
                System.out.println("Value entered must be positive");
            }

        } while ( enteredAmount1 <= 0 );

        do
		{
		     System.out.print("Initial savings deposit: ");
		     enteredAmount2 = scan.nextDouble();


		     if ( enteredAmount2 <= 0 )
		     {
		           System.out.println("Value entered must be positive");
		     }

        } while ( enteredAmount2 <= 0 );


		BankAccount account1= new BankAccount(enteredID, enteredAmount1, enteredAmount2);


        printMenu();
		do
		 {

		   System.out.println("Please enter a command");
		   input = scan.next();
           command = input.charAt(0);

           switch (command)
            {
                 case 'a': 
                            System.out.println("Amount to deposit: ");
                            enteredAmount = scan.nextDouble();
                            account1.deposit(enteredAmount);
                            System.out.println("You deposited " + enteredAmount + " to Checking.");


                      break;
					  
                 case 'b':
					        do
					        {
					          System.out.print("Amount to withdraw: ");
					          enteredAmount = scan.nextDouble();

					     
					          if (enteredAmount <= 0)
					          		System.out.println("Value must be positive");
					        } while (enteredAmount <= 0);

					       flag = account1.withdraw(enteredAmount);
					       if (flag)
					       			System.out.println("You withdrew " + enteredAmount);
					       	else
					       		System.out.println("Insufficient funds");

                      break;

                 case 'c':
                 		System.out.println(account1.toString());

                      break;
					  
					 
                 case 'd': 
					      
						System.out.print("What is your bank account number? ");
						enteredID = scan.next();

						   if (account1.equals(enteredID))
						   	System.out.println("Your balance is:  " + account1.toString());
						   	else
								System.out.println("Invalid ID");

                      break;
					  
                 case '?': 
                        printMenu();
                        break;
						
                 case 'e':
						account1.addInterest();
                 		System.out.println(account1.toString());
                      break;
					  
				 default:
					  System.out.println("Try again");
					  break;
            }

        } while (command != 'e');
	{System.out.print("Command Options"
                   + "a: deposit"
                   + "b: withdraw"
                   + "c: display the balance"
                   + "d: Check the account"
				   + "e: quit this program");
                   + "?: display the menu again"

    }
		
} 
}

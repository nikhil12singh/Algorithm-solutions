package first;

/*-------------------------------------------------------------------------
// AUTHOR: Jacob Babik
// FILENAME: Assignment4.java
// SPECIFICATION: Simple Banking Program with loops
// FOR: CSE 110- Assignment #4
// TIME SPENT: 3 hours
//-----------------------------------------------------------*/
/* Answers to exercises:
 * a) 
 * i is : 0
 * i is : 1
 * i is : 2
 * i is : 3
 * i is : 4
 * b) 55 times
 * c) 
 * int x
 * Scanner keyboard = new Scanner(System.in);
 * System.out.println("Please enter a number between 0 and 100: ");
 * x = keyboard.nextInt();
 * while (x<0 || x>100)
 * {
 * 		System.out.println("Error: Enter a valid number.");
 * 		x = scan.nextInt();
 * }
 */
import java.util.Scanner;
import java.text.NumberFormat;
public class Assigment4 
{
	public static void main(String[] args)
	{
		//declare main values and strings
		String name;
		double savings;
		double checking;
		double totalBalance;
		System.out.println("Welcome to CSE110 Bank");
		System.out.println("What is your name?: ");
		Scanner scan=new Scanner(System.in); 
		name=scan.nextLine();
		//Ask for initial deposit
		System.out.println("Initial deposit into Savings: ");
		savings=scan.nextDouble();
		//Check to make sure deposit is not a negative number
		while(savings<=0)
		{
			System.out.println("Invalid choice (number must be positive).");
			System.out.println("Initial deposit into Savings: ");
			savings=scan.nextDouble();
		}
		System.out.println("Initial deposit into Checking: ");
		checking=scan.nextDouble();
		//Check to make sure that deposit is not a negative number
		while(checking<=0)
		{
			System.out.println("Invalid choice (number must be positive).");
			System.out.print("Initial deposit into Checking: ");
			checking=scan.nextDouble();
		}
		String accountType;
		//Determine what account type the user has based off their balance
		NumberFormat fmt=NumberFormat.getCurrencyInstance();
		double amount;
		int choice;
		//Do loop to run program until user decides to stop it
		do
		{
			totalBalance = (checking+savings);
			if(totalBalance>0&&totalBalance<1000)
			{
				accountType="Basic";
			}
			else if(totalBalance>=1000&&totalBalance<=5000)
			{
				accountType="Premium";
			}
			else
			{
				accountType="Platinum";
			}
				totalBalance=checking+savings;
				//Output main menu
				System.out.println(name+"'s "+accountType+" Account balance is: "+fmt.format(totalBalance)+"(S: "+fmt.format(savings)+", C: "+fmt.format(checking)+")");
				System.out.println("Bank options:");
				System.out.println("1) Deposit money");
				System.out.println("2) Withdraw money");
				System.out.println("3) Transfer money");
				System.out.println("4) Quit");
				System.out.println("Your choice: ");
				//Get user selection for main menu
				choice=scan.nextInt();
				while(choice<1 || choice>4)
				{
					System.out.println("Invalid choice (not an option).");
					System.out.println("Your choice: ");
					choice = scan.nextInt();
				}
				//Switch statement created. Takes in the user's choice from main menu
			switch(choice)
			{
			//Deposit money options
			case 1: 
				int cDeposit;
				//Create do loop for menu
				do
				{
					System.out.println("Deposit money options: ");
					System.out.println("1) Deposit to savings");
					System.out.println("2) Deposit to checking");
					System.out.println("3) Cancel");
					System.out.print("Your choice: ");
					cDeposit=scan.nextInt();
					//Get user input and then ask the right question based on input
					//Check to see if input is valid
					while(cDeposit<1 || cDeposit>3)
					{
						System.out.println("Invalid choice (not an option).");
						System.out.println("Your choice: ");
						cDeposit = scan.nextInt();
						
					}
					if(cDeposit==1)
					{
						
						System.out.println("Amount to deposit to savings: ");
						amount=scan.nextDouble();
						//input validation
						while (amount<=0)
						{
							System.out.println("Invalid choice (number must be positive).");
							System.out.print("Amount to deposit to savings: ");
							amount=scan.nextDouble();
						}
						savings=savings+amount;
						System.out.println("You deposited "+(fmt.format(amount))+" to savings.");
					}
					else if(cDeposit==2)
					{
						System.out.print("Amount to deposit to checking:");
						amount=scan.nextDouble();
						//Input validation
						while (amount<=0)
						{
							System.out.println("Invalid choice (number must be positive).");
							System.out.print("Amount to deposit to checking: ");
							amount=scan.nextDouble();
						}
						checking=checking+amount;
						System.out.println("You deposited "+(fmt.format(amount))+" to checking.");
					}
				}while(cDeposit!=3);
				break;
				//This case is used if the user enters 2 from the main menu
			case 2:
				int cWithdraw;
				//Do loop to display menu
				do
				{
					System.out.println("Withdrawl money options: ");
					System.out.println("1) Withdraw from savings");
					System.out.println("2) Withdraw from checking");
					System.out.println("3) Cancel");
					System.out.println("Your choice: ");
					cWithdraw=scan.nextInt();
					//Validate user selection
					while(cWithdraw<1 || cWithdraw>3)
					{
						System.out.println("Invalid choice (not an option).");
						System.out.print("Your choice: ");
						cWithdraw = scan.nextInt();
					}
					//Runs this if statement is the user wants to withdraw from savings
					if(cWithdraw==1)
					{
						System.out.println("Amount to withdraw from savings: ");
						amount=scan.nextDouble();
						//Checks to see if they have enough money in their savings to withdraw and if negative
						while(amount<=0 || amount>savings)
						{
							if(amount<=0)
							{
								System.out.println("Invalid choice (number must be positive).");
								System.out.println("Amount to withdraw from savings: ");
								amount=scan.nextDouble();
							}	
							else if(amount>savings)
							{
								System.out.println("Invalid choice (you don't have that much in your savings).");
								System.out.println("Amount to withraw from savings: ");
								amount=scan.nextDouble();
							}
							savings=savings-amount;
							System.out.println("You withrew "+(fmt.format(amount))+" from savings.");
						}
					}
					//Runs if the user wants to withdraw from their checking account
					else if(cWithdraw==2)
					{
						System.out.println("Amount to withdraw from checking: ");
						amount=scan.nextDouble();
						//Checks to see if they have enough money in their savings to withdraw and if negative
						while(amount<=0 || amount>checking)
						{
							if(amount<=0)
							{
							System.out.println("Invalid choice (number must be positive).");
							System.out.println("Amount to withdraw from checking: ");
							amount=scan.nextDouble();
							}
							else if(amount>checking)
							{
								System.out.println("Invalid choice (you don't have that much in your savings).");
								System.out.println("Amount to withraw from checking: ");
								amount=scan.nextDouble();
							}
								savings=savings-amount;
								System.out.println("You withrew "+(fmt.format(amount))+" from checking.");
						}
					}
				}while(cWithdraw!=3);
				break;
				//Runs if the user wants to transfer money
			case 3:
				int cTransfer;
				//Do loop to repeat menu
				do
				{
					System.out.println("Transfer money options: ");
					System.out.println("1) Transfer from checking to savings");
					System.out.println("2) Transfer from savings to checking");
					System.out.println("3) Cancel");
					System.out.println("Your choice: ");
					cTransfer=scan.nextInt();
					//Validate user selection
					while(cTransfer<1 || cTransfer>3)
					{
						System.out.println("Invalid choice (not an option).");
						System.out.println("Your choice: ");
						cTransfer=scan.nextInt();
					}
					//Runs if the user wants to transfer from checking to savings
					if(cTransfer==1)
					{
						System.out.println("Amount to transfer from checking to savings: ");
						amount=scan.nextDouble();
						//Makes sure the user has enough money in their account to transfer
						while (amount>checking ||amount<=0)
						{
							if(amount>checking)
							{
							System.out.println("Invalid choice (you don't have that much in you checking).");
							System.out.println("Amount to transfer from checking to savings: ");
							amount=scan.nextDouble();
							}
							//Makes sure the user enters a positive number
							else if (amount<=0)
							{
								System.out.println("Invalid choice (number must be positive).");
								System.out.println("Amount to transfer from checking to savings: ");
								amount=scan.nextDouble();
							}
							checking=checking-amount;
							savings=savings+amount;
							System.out.println("You transferred "+(fmt.format(amount))+" from checking to savings.");
						}
					}
					//Runs if the user wants to transfer from savings to checking
					else if(cTransfer==2)
					{
						System.out.println("Amount to transfer from savings to checking: ");
						amount=scan.nextDouble();
						//Checks to make sure that the user has enough in their account to transfer
						while (amount>savings || amount<=0)
						{
							if(amount>savings)
							{
								System.out.println("Invalid choice (you don't have that much in you savings).");
								System.out.println("Amount to transfer from savings to checking: ");
								amount=scan.nextDouble();
							}
						//Makes sure that the user enter a positive number
							else if(amount<=0)
							{
								System.out.println("Invalid choice (number must be positive).");
								System.out.println("Amount to transfer from savings to checking: ");
								amount=scan.nextDouble();
							}
							checking=checking+amount;
							savings=savings-amount;
							System.out.println("You transferred "+(fmt.format(amount))+" from savings to checking.");
						}
					}
					else if(cTransfer==3)
					{
						System.out.println("Cancel Transfer.");
					}
				}while(cTransfer!=3);
				break;
				//If the user inters an ivalid option for the main menu
			case 4:
				break;
				default:
				{
					System.out.println("Invalid choice (not an option).");
					break;
				}
			}
		}while(choice!=4);
		//Final balance calculated and displayed
		totalBalance = checking+savings;
		System.out.println("Thank you for using CSE 100 BANK. Goodbye.");
		System.out.println("After this transaction your account balance is: "+fmt.format(totalBalance)+"(S: "+fmt.format(savings)+", C: "+fmt.format(checking)+")");
		totalBalance = (checking+savings);
		//Calculate interest to be given
		double interest;
		if(totalBalance>0&&totalBalance<1000)
		{
			interest=0.025;
		}
		else if(totalBalance>=1000&&totalBalance<=5000)
		{
			interest=0.035;
		}
		else
		{
			interest=0.045;
		}
		System.out.println("We have added interest to your account!");
		//Adds interest and displays new values
		System.out.println(name+"'s "+accountType+" Account balance is: "+fmt.format(totalBalance*(1+interest))+"(S: "+fmt.format(savings*(1+interest))+", C: "+fmt.format(checking*(1+interest))+")");
	}
}
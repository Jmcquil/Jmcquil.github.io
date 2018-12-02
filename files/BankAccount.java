
/*************************************************************************
 * File Name: BankAccount.java
 * 
 * Due Date:  <4/21/2017>
 * 
 * Author:  <Justin McQuillen>
 * 
 * Program Description:   <A module or function is suitable when you have a series of highly cohesive statements that can be used in more
than one place in a program. In a menu with several items, a module or function can be useful for the lines of
code to display the menu and get the user’s choice.>  
 * 
 * Input:       <5-digit code, menu choice>  
 *              
 * Processing:  <Process selection (Deposit, Withdraw, Balance, Exit)>  
 * 
 * Output:      <Information based on selection>  
 * 
 * ***********************************************************************/
import java.util.Scanner;

public class BankAccount {

	public static Scanner input = new Scanner(System.in);

	// Main Function
	public static void main(String[] args) {

		// Declare and initialize a variable for balance to $5000.
		double balance = 5000;

		// Declare other variables as needed
		char menuChoice;

		// Display the welcome message - (HINT: This method does NOT require a
		// value returned!)
		// Call the welecomeMessage() function
		welcomeMessage();

		// Prompt the user to enter the account number
		// HINT: The account number must be returned to main()! In main(), dont
		// forget to assign the call statement to a variable.
		// Call the accountInfo() function AND assign it to a variable
		int accountNumber = accountInfo();

		// Process menu using a Do-While loop and Switch statement
		// This will Display the menu and Call the Function(s) based on the
		// user's choice until the user enters X

		do {
			// Call the function to display the menu and prompt the user for
			// their choice
			// HINT: The displayMenu() function must return the choice back to
			// main()! In main(), dont forget to assign the call statement to a
			// variable.
			// Call the displayMenu() function AND assign it to a variable
			menuChoice = displayMenu();

			// Start the switch() statement to determine which function is
			// called based on the users choice
			// HINT: Each case calls or invokes a function to perform some
			// specific task

			switch (menuChoice) {

			// Case (If the menu choice is D)
			// Call the depositFunds(balance) function AND assign it to a
			// variable
			case 'D':
				balance = depositFunds(balance);
				break;

			// Case (If the menu choice is W)
			// Call the withdrawFunds(balance) function AND assign it to a
			// variable
			case 'W':
				balance = withdrawFunds(balance);
				break;

			// Case (If the menu choice is B)
			// Call the checkBalance(account number, balance) function
			case 'B':
				checkBalance(accountNumber, balance);
				break;

			// Case (If the menu choice is X)
			case 'X':

				break;

			// Default for user error handling
			default:
				System.out.println("ERROR: Please enter a D, W, B, or X: ");
				break;

			}// end of switch

		} while (menuChoice != 'X');

		// Display final message

	}// end of main

	/****************************************************
	 * FUNCTION DEFINITIONS
	 *****************************************************/

	// Display welcome message
	public static void welcomeMessage() {

		System.out.println("************************************************************");
		System.out.println("                  Welcome to Seminole Bank!                 ");
		System.out.println("************************************************************\n");

	}// end of welcomeMessage

	// Prompt and Read users account number. RETURN the account number to
	// main().
	public static int accountInfo() {

		System.out.print("Please enter your 5-digit Seminole Account Number: ");

		int accountNumber = input.nextInt();

		System.out.println("\nThank you!\n");

		return accountNumber;

	}// end of accountInfo

	// Display menu choices to the user and Read the users banking choice.
	// RETURN the users menu choice to main().
	public static char displayMenu() {

		System.out.print("Enter D for deposit, W for withdrawal, B for balance, X to exit the menu: ");

		char menuChoice = input.next().charAt(0);
		menuChoice = Character.toUpperCase(menuChoice);

		return menuChoice;

	}// end of displayMenu

	// Prompt the user for the amount to deposit and Read deposit amount. Update
	// the balance and RETURN the balance to main().
	public static double depositFunds(double balance) {
		System.out.println("Enter the amount of the deposit: ");
		double deposit = input.nextDouble();
		balance = balance + deposit;
		return balance;

	}// end of depositFunds

	// Prompt the user for the amount to withdraw and Read withdrawal amount.
	// Update the balance and RETURN the balance to main().
	public static double withdrawFunds(double balance) {
		System.out.println("Enter the amount of the withdrawl: ");
		double withdrawl = input.nextDouble();
		balance = balance - withdrawl;
		return balance;

	}// end of withdrawFunds

	// Display the balance and DO NOT RETURN anything to main().
	public static void checkBalance(int accountNumber, double balance) {
		System.out.printf("Account Number: %d has a current balance of: %f\n", accountNumber, balance);

	}// end of checkBalance

	/**************************************************
	 * END OF FUNCTION DEFINITIONS
	 **************************************************/

}// end of BankAccount Class
import java.util.Scanner;

public class Banking 
{
	int balance=1000;
	int previousTransaction;
	String customerName;
	String customerID;
	
	public Banking(String cname, String cid) 
	{
		this.customerName = cname;
		this.customerID = cid;
	}
	
	//Deposit Function
	public void deposit(int amount) 
	{
		if (amount != 0) 
		{
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	
	//Withdraw Function
	public void withdraw(int amount) 
	{
		if (amount != 0) 
		{
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}
	
	//Transaction Status Function
	public void getPreviousTransaction() 
	{
		if (previousTransaction > 0) 
		{
			System.out.println("Deposited: " + previousTransaction);
		} 
		else if (previousTransaction < 0) 
		{
			System.out.println("Withdrawn: " + Math.abs(previousTransaction));
		} 
		else 
		{
			System.out.println("No transaction occurred");
		}
	}
	
	//Function shows the menu
	public void showMenu() 
	{
		char option = '\0';
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME " + customerName);
		System.out.println("Your Customer_ID is: " + customerID);
		System.out.println();
		System.out.println("Your can choose the following options");
		System.out.println();
		System.out.println("A. Check your balance");
		System.out.println("B. Deposit Money");
		System.out.println("C. Withdraw Money");
		System.out.println("D. View Transaction history");
		System.out.println("E. Exit");
		
		do {
			System.out.println();
			System.out.println("Enter an option: ");
			char option1 = sc.next().charAt(0);
			option = Character.toUpperCase(option1);
			System.out.println();
			
			switch(option) 
			{
			case 'A':
				System.out.println("====================================");
				System.out.println("Balance = " + balance);
				System.out.println("====================================");
				System.out.println();
				break;
			
			case 'B':
				System.out.println("Enter the amount to deposit: ");
				int amount = sc.nextInt();
				deposit(amount);
				System.out.println();
				break;
			
			case 'C':
				System.out.println("Enter the amount to withdraw: ");
				int amount2 = sc.nextInt();
				withdraw(amount2);
				System.out.println();
				break;
			
			case 'D':
				System.out.println("====================================");
				getPreviousTransaction();
				System.out.println("====================================");
				System.out.println();
				break;
			
			case 'E':
				System.out.println("====================================");
				break;
			
			default:
				System.out.println("Error: invalid option. Please enter A, B, C, or D or access services.");
				break;
			}
		} while(option != 'E');
		System.out.println("THANK YOU FOR  BANKING WITH US");
	}
	
}

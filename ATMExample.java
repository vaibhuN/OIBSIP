package vaishnaviProject;
import java.util.Scanner;

public class ATMExample {
	public static void main(String[]args) {
		//declare & initialize variable
		int balance=20000, withdraw, deposit;
		System.out.println("ATM Machine");
		Scanner scan = new Scanner(System.in);
		
		//initializing flag with true
		boolean flag=true;
		while(flag) {
			System.out.println("Choose 1 for Withdraw");
			System.out.println("Choose 2 for Deposit");
			System.out.println("Choose 3 for Balance");
			System.out.println("Choose 4 for Exit");
			System.out.println("Choose any option from above:");
			
			//user choice
			int choice = scan.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("enter money to be withdraw: ");
				withdraw=scan.nextInt();
				
				//check whether balance is greater than or equal to withdraw money
				if(balance>=withdraw) {
					balance-=withdraw;
					System.out.println("Please collect your money..");
				}
				else {
					System.out.println("Insufficient Balance");
				}
				System.out.println("");
				break;
				
			case 2:
				System.out.println("Enter money to be deposited: ");
				deposit=scan.nextInt();	
				//add deposit amount with balance
				balance+=deposit;
				System.out.println("Your money has been deposited successfully!");
				System.out.println();
				break;
				
			case 3:
				//checking balance case
				System.out.println("Balance : "+balance);
				System.out.println();
				break;
				
			case 4:
				//exit the operation
				flag=false;
				System.out.print("Thank you for visiting");
			}
		}
		
		scan.close();
	}

}

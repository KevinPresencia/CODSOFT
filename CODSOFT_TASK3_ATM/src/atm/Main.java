package atm;
import java.util.*;
class Bank 
{
    private double balance;  
    public Bank(double initialBalance)
    {
        this.balance = initialBalance;
    }
    public double getBalance() 
    {
        return balance;
    }
    public void deposit(double amount) 
    {
        if (amount > 0)
        {
            balance=balance+amount;
            System.out.println("DEPOSIT SUCCESSFUL!CURRENT BALANCE:Rs." + balance);
        } 
        else
        {
            System.out.println("INVALID,ENTER A VALID AMOUNT TO DEPOSIT.");
        }
    }
    public boolean withdraw(double amount)
    {
        if (amount > 0)
        {
            if (amount <= balance) 
            {
                balance=balance-amount;
                System.out.println("WITHDRAWAL SUCCESSFULL!CURRENT BALANCE:Rs." + balance);
                return true;
            }
            else 
            {
                System.out.println("INSUFFICIENT FUND!CURRENT BALANCE:Rs." + balance);
            }
        }
        else
        {
            System.out.println("INVALID,ENTER A VALID AMOUNT TO WITHDRAW.");
        }
        return false;
    }
}

class ATM {
    private Bank bankAccount;

    public ATM(Bank bankAccount) 
    {
        this.bankAccount = bankAccount;
    }

    public void atminterface() 
    {
        Scanner sc = new Scanner(System.in);

        while (true)
        {
        	System.out.println("ATM SERVICES:");
            System.out.println("1. CHECK BALANCE");
            System.out.println("2. DEPOSIT AMOUNT");
            System.out.println("3. WITHDRAW AMOUNT");
            System.out.println("4. EXIT");
            System.out.print("ENTER YOUR CHOICE: ");
            int choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("CURRENT BALANCE: Rs." + bankAccount.getBalance());
                    break;
                case 2:
                    System.out.print("ENTER THE AMOUNT TO DEPOSITED: Rs.");
                    double depositAmount = sc.nextDouble();
                    bankAccount.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("ENTER THE AMOUNT TO BE WITHDRAWN: Rs.");
                    double withdrawalAmount = sc.nextDouble();
                    bankAccount.withdraw(withdrawalAmount);
                    break;
                case 4:
                    System.out.println("THANK YOU FOR USING ATM.");
                    return;
                default:
                    System.out.println("INVALID CHOICE,TRY AGAIN!");
            }
        }
    }
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Bank userAccount = new Bank(1000.0);
	        ATM atm = new ATM(userAccount);
	        atm.atminterface();
	}

}

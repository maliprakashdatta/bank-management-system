package bankmanagementsystemsServices;

import java.util.Scanner;

public class MoneyWithdraw
{

    public void withdrawal()
    {
        long amt,balance = 0;

        System.out.println("Enter the amount you want to withdraw: ");
        Scanner scanner=new Scanner(System.in);
        amt = scanner.nextLong();
        if (balance >= amt) {
            balance = balance - amt;
            System.out.println("Balance after withdrawal: " + balance);
        }
        else
        {
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );
        }
    }
}

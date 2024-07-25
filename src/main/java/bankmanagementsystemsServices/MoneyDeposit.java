package bankmanagementsystemsServices;

import bankmanagementsystemsModel.Bank;

import java.util.Scanner;

public abstract class MoneyDeposit extends BankMain implements Bank {
    //method to deposit money
    public void deposit()
    {
        long amt;
        long balance = 0;
        System.out.println("Enter the amount you want to deposit: ");
        Scanner scanner = new Scanner(System.in);
        amt = scanner.nextLong();
        balance = balance + amt;
        System.out.println("Deposit is Successfully "+amt+"/-"+" Rupay");

    }
}

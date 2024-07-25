package bankmanagementsystemsServices;

import bankmanagementsystemsModel.Bank;

import java.util.Scanner;

public abstract class EnterAccountDetails extends BankMain implements Bank {

    private String name;
    private String accno;
    private String acc_type;
    private long balance;


    Scanner sc = new Scanner(System.in);
    //method to open new account
    public BankMain openAccount() {
        System.out.println("--------Enter The Acount Details---------------");
        System.out.print("Enter Name of account holder: ");
        name = sc.next();
        System.out.print("Enter Account No: ");
        accno = sc.next();
        System.out.print("Enter Account type: ");
        acc_type = sc.next();
        System.out.print("Enter Account  Balance: ");
        balance = sc.nextLong();
        return null;
    }
    //method to display account details

    public BankMain showAccount() {
        System.out.println("------Account Details------------");
        System.out.println("Name of account holder: " + name);
        System.out.println("Account no.: " + accno);
        System.out.println("Account type: " + acc_type);
        System.out.println("Balance: " + balance);
        return null;
    }
    public boolean search(String ac_no) {
        if (accno.equals(ac_no)) {
            showAccount();
            return (true);
        }
        return (false);
    }

}




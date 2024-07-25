package bankmanagementsystemsServices;

import java.util.Scanner;

public class TransactionAccount extends BankMain
{

    //id, Account, amount, type, date-time


    int transactio_id;
    int Account_No;
    int Amount;
    long transaction_date_time;

    public int getTransactio_id() {
        return transactio_id;
    }

    public void setTransactio_id(int transactio_id) {
        this.transactio_id = transactio_id;
    }

    public int getAccount_No() {
        return Account_No;
    }

    public void setAccount_No(int account_No) {
        Account_No = account_No;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }

    public long getTransaction_date_time() {
        return transaction_date_time;
    }

    public void setTransaction_date_time(long transaction_date_time)
    {
        this.transaction_date_time = transaction_date_time;
    }

}

package bankmanagementsystemsServices;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args)
    {

        System.out.println("----------Customer Registration Form-------------");
        System.out.println("Please enter ID:-");
        Scanner id1= new Scanner(System.in);
        int id = id1.nextInt();
        //System.out.println("Customer Id is:-"+id);

        System.out.println(" Enter the Firstname:-");
        Scanner fn= new Scanner(System.in);
        String Firstname= fn.nextLine();
       // System.out.println("Customer Firstname is:-"+Firstname);

        System.out.println(" Enter the   Lastname:-");
        Scanner ln= new Scanner(System.in);
        String Lastname= ln.nextLine();
        //System.out.println("Customer Lastname is:-"+Lastname);

        System.out.println(" Enter the   Gender:-");
        Scanner gender= new Scanner(System.in);
        String Gender= gender.nextLine();
        //System.out.println("Customer Gender is:-"+Gender);

        System.out.println(" Enter the   DOB:-");
        Scanner dob= new Scanner(System.in);
        long DOB= dob.nextLong();
        //System.out.println("Customer Gender is:-"+DOB);

        System.out.println(" Enter the   Address:-");
        Scanner address= new Scanner(System.in);
        String Address= address.nextLine();
        //System.out.println("Customer Address is:-"+Address);

        System.out.println(" Enter the   emaild:-");
        Scanner email= new Scanner(System.in);
        String emaild= email.nextLine();
        //System.out.println("Customer Address is:-"+emaild);

        System.out.println(" Enter the   idcard:-");
        Scanner idc= new Scanner(System.in);
        int  idcard= idc.nextInt();
        //System.out.println("Customer Address is:-"+idcard);
        System.out.println("----Customer Details-------------");
        System.out.println("Customer Id is:-"+id);
         System.out.println("Customer Firstname is:-"+Firstname);
        System.out.println("Customer Lastname is:-"+Lastname);
        System.out.println("Customer Gender is:-"+Gender);
        System.out.println("Customer DOB is:-"+DOB);
        System.out.println("Customer Address is:-"+Address);
        System.out.println("Customer EmailID is:-"+emaild);
        System.out.println("Customer IdCard is:-"+idcard);

        System.out.println("["+"Customer Id "+id+" Customer Firstname "+Firstname+" Customer Lastname "+Lastname+" Customer Gender "+Gender+" Customer Address "+Address+" Customer emaild "+ emaild+" Customer idcard "+idcard+"]");


        System.out.println("----------Enter The Card Details-------------");
        System.out.println("Please enter card ID:-");
        Scanner cardid= new Scanner(System.in);
        int cid= cardid.nextInt();

        System.out.println("Please enter card No:-");
        Scanner CNo= new Scanner(System.in);
        int cardNo= CNo.nextInt();

        System.out.println("Please enter AccountNo:-");
        Scanner AccNo= new Scanner(System.in);
        int AccountNo=AccNo .nextInt();

        System.out.println("Please enter Customer_Name:-");
        Scanner Cust_Name= new Scanner(System.in);
        String Customer_Name=Cust_Name.nextLine();

        System.out.println("Please enter cvv:-");
        Scanner Cust_cvv= new Scanner(System.in);
        int cvv=Cust_cvv.nextInt();

        System.out.println("Please enter Cardtype:-");
        Scanner card_type= new Scanner(System.in);
        String Cardtype=card_type.nextLine();

        System.out.println("-------------Card Details-----------------");
        System.out.println("card ID Is:-"+cid);
        System.out.println("card No Is:-"+cardNo);
        System.out.println("Account No  Is"+AccountNo);
        System.out.println("Customer Name Is:-"+Customer_Name);
        System.out.println("Customer cvv Is:-"+cvv);
        System.out.println("Customer Cardtype:-"+Cardtype);

//        int id;
//        int cardNo;
//        int AccountNo;
//        String Customer_Name;
//        int cvv;
//        String Cardtype;


        //to,cc,subject, body


        System.out.println("-------Enter Email Detals--------------");
        System.out.println("send to:-");
        Scanner send_to= new Scanner(System.in);
        String to= send_to.nextLine();

        System.out.println("send cc:-");
        Scanner send_cc= new Scanner(System.in);
        String cc= send_cc.nextLine();

        System.out.println("Subject:-");
        Scanner subject= new Scanner(System.in);
        String Subject= subject.nextLine();

        System.out.println("Write message:-");
        Scanner Body= new Scanner(System.in);
        String body= Body.nextLine();

        System.out.println("-----------Email Details----------------");
        System.out.println("Reciver email"+to);
        System.out.println("Copyes of email:-"+cc);
        System.out.println("Subjetc:-"+Subject);
        System.out.println("write message"+body);


        System.out.println("----------Transaction Account Details-----------------");
        System.out.println("Transaction id:-");
        Scanner Tid= new Scanner(System.in);
        int  transactio_id= Tid.nextInt();

        System.out.println("Account_No is:-");
        Scanner A_no= new Scanner(System.in);
        int  Account_No= A_no.nextInt();

        System.out.println("Amount is:-");
        Scanner Amt= new Scanner(System.in);
        int  Amount= Amt.nextInt();

        System.out.println("transaction_date_time is:-");
        Scanner tran= new Scanner(System.in);
        int  transaction_date_time= tran.nextInt();

        System.out.println("transactio_id:- "+transactio_id);
        System.out.println("Account_No:-"+Account_No);
        System.out.println("Amount:-"+Amount);
        System.out.println("transaction_date_time:- "+transaction_date_time);




//        int transactio_id;
//        int Account_No;
//        int Amount;
//        long transaction_date_time;



        //RegisterCustomer registerCustomer=new RegisterCustomer();
//        OpeningBankAccount openingBankAccountRC=new OpeningBankAccount();
//        openingBankAccountRC.getId();
//        System.out.println(openingBankAccountRC);
//        OpeningBankAccount
//        openingBankAccountRC.getFirstname();
//        openingBankAccountRC.getLastname();
//        openingBankAccountRC.getGender();
//        openingBankAccountRC.getDOB();
//        openingBankAccountRC.getAddress();
//        openingBankAccountRC.getEmaild();
//        openingBankAccountRC.getIdcard();

//
        EnterAccountDetails enterAccountDetails=new EnterAccountDetails() {
            @Override
            public Void Money() {
                return null;
            }
        };
        enterAccountDetails.openAccount();
        enterAccountDetails.showAccount();

        MoneyDeposit moneyDeposit=new MoneyDeposit() {
            @Override
            public Void Money() {
                return null;
            }
        };
        moneyDeposit.deposit();

        MoneyWithdraw moneyWithdraw=new MoneyWithdraw();
        moneyWithdraw.withdrawal();




    }

}

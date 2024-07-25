package bankmanagementsystemsServices;

import bankmanagementsystemsModel.Bank;

public abstract class Email extends BankMain implements Bank {
   //private  String to,cc,subject, body;
    String email_id;
    String email_to;
    String email_subject;
    String email_contents;

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getEmail_to() {
        return email_to;
    }

    public void setEmail_to(String email_to) {
        this.email_to = email_to;
    }

    public String getEmail_subject() {
        return email_subject;
    }

    public void setEmail_subject(String email_subject) {
        this.email_subject = email_subject;
    }

    public String getEmail_contents() {
        return email_contents;
    }

    public void setEmail_contents(String email_contents) {
        this.email_contents = email_contents;
    }




}

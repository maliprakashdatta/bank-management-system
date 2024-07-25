package bankmanagementsystemsServices;

public class CustomerRegisterForm
{
    int customer_register_id;
    private String first_name;
    private String last_name;
    private String gender;
    private long DOB;
    private String address;
    String emai_id;
    int card_id;


    public int getCustomer_register_id() {
        return customer_register_id;
    }

    public void setCustomer_register_id(int customer_register_id) {
        this.customer_register_id = customer_register_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getDOB() {
        return DOB;
    }

    public void setDOB(long DOB) {
        this.DOB = DOB;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmai_id() {
        return emai_id;
    }

    public void setEmai_id(String emai_id) {
        this.emai_id = emai_id;
    }

    public int getCard_id() {
        return card_id;
    }

    public void setCard_id(int card_id) {
        this.card_id = card_id;
    }






}

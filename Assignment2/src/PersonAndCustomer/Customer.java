package PersonAndCustomer;

public class Customer extends Person{
    /**
     * The Customer class extend the Person class. It has two more field. cutomeNumber is an int atht store the customer identification number and the bolean mailingList indicated whenever or not the customer is on the mailling list.
     * */
    //field
    /**
     * The variable customerNumber is an int that store the specific number corresponding to a customer.
     * */
    private int customerNumber;
    /**
     * The variable mailingList is a boolean that indicated if the customer is on the mailing list.
     * */
    private boolean mailingList;
    //constructor
    /**
     * This the default constructor. It also called the superior class'default custructor.
     * */
    public Customer() {
        super();
    }
    /**
     *This is constuctor with an argument corresponding to each field to let the user choose their value.
     * @param name : name is a String corresponding to the name of a person.
     * @param address : address is a String corresponding to the person's address.
     * @param telephoneNumber : telephoneNumber is a String corresponding to the person's phone number.
     * @param customerNumber : customerNumber is an int that store the specific number corresponding to a customer.
     * @param mailingList : mailingList is a boolean that indicated if the customer is on the mailing list.
     * */
    public Customer(int customerNumber, boolean mailingList, String name, String address, String telephoneNumber) {
        super(name, address, telephoneNumber);
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }
    //accessor
    /**
     * This is the accessor of the fied customerNumber.
     * @return customerNumber : customerNumber is an int that store the specific number corresponding to a customer.
     * */
    public int getCustomerNumber() {
        return this.customerNumber;
    }
    /**
     * This is the accessor of the field mailingList.
     * @return mailingList : mailinigList is a boolean that indicated if the customer is on the mailing list.
     * */
    public boolean getmailingList() {
        return this.mailingList;
    }

    //mutator
    /**
     * This is the mutator of the customerNumber field.
     * @param customerNumber : This is the new int that will be stored inside the field customNumber.
     * */
    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }
    /**
     * This is the mutator the mailingList field.
     * @param mailingList : This the new boolean that will be stored inside the field mailingList.
     * */
    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }
    /**
     * toString() is a method that return all the field in a string and the value stored inside of them. The method also call the toString function of the suuperior class.
     * @return : a String contianing a word for each field and their value.
     * */
    @Override
    public String toString() {
        return super.toString() + "\ncustomer number: " + this.customerNumber + "\nmailing list: " + this.mailingList;
    }
}

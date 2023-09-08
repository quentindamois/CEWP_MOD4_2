package PersonAndCustomer;

public class PreferredCustomer extends Customer {
    /**
     * This is the PreferredCustomer class, it is an extension of the Customer class.
     * */
    //constructor
    /**
     * This is the default constructor of the class.
     * */
    public PreferredCustomer() {
        super();
    }
    /**
     * This Constructor as a parametere for every field to choose what is stored inside
     * @param name : name is a String corresponding to the name of a person.
     * @param address : address is a String corresponding to the person's address.
     * @param telephoneNumber : telephoneNumber is a String corresponding to the person's phone number.
     * @param customerNumber : customerNumber is an int that store the specific number corresponding to a customer.
     * @param mailingList : mailingList is a boolean that indicated if the customer is on the mailing list.
     * @param amountPurchase : amountPurchase is the total amount of purchase made by the customer.
     * */
    public PreferredCustomer(int amountPurchase, int customerNumber, boolean mailingList, String name, String address, String telephoneNumber) {
        super(customerNumber, mailingList, name,address, telephoneNumber);
        this.amountPurchase = amountPurchase;
    }
    //field
    /**
     * This is the field amount Purchase. This is a int storing the total amount of purchase of a preferred customer.
     * */
    private int amountPurchase;
    //accessor
    /**
     * This the accessor of amountPurchase
     * @return amountPurchase :This is te amount of purchase made by a preferred customer.
     * */
    public int getAmountPurchase() {
        return this.amountPurchase;
    }
    /**
     * This focntion give the discount the customer earned.
     * @return : the discount a customer as eanred.
     * */
    public double getDiscount() {
        double res;
        if (this.amountPurchase > 2000) {
            res = 0.1;
        } else if (this.amountPurchase > 1500) {
            res = 0.7;
        } else if (this.amountPurchase > 1000) {
            res = 0.6;
        } else if (this.amountPurchase > 500) {
            res = 0.5;
        } else {
            res = 0.0;
        }
        return res;
    }
    //Mutator
    /**
     * This is the mutator of amountPurchase.
     * @param amountPurchase : This int will be stored in the field amountPruchase.
     * */
    public void setAmountPurchase(int amountPurchase) {
        this.amountPurchase = amountPurchase;
    }
    /**
     * toString() give the information stored in the object as a String.
     * @return  a name and the value for each field.
     * */
    @Override
    public String toString() {
        return super.toString() + "\namount purchased : " + this.amountPurchase +"\ndiscount : " + (this.getDiscount() * 100) +"%";
    }
}

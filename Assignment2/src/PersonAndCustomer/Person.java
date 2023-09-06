package PersonAndCustomer;

public class Person {
    /**
     * This the Pesorn. It stores the name, address and telephone number of a person in string variable.
     * */
    //field
    /**
     * The name variable is a String corresponding to the name of a person.
     * */
    private String name;
    /**
     * The address variable is a String corresponding to the person's address.
     * */
    private String address;
    /**
     * The telephoneNumber variable is a String corresponding to the person's phone number.
     * */
    private String telephoneNumber;
    /**
     * This is the default construtor of the person class. It initializes every String varaible and stores a empty string in them.
     * */
    public Person() {
        this.name = "";
        this.address = "";
        this.telephoneNumber = "";
    }
    /**
     * This is a construtur with three argument that let the user chose the value of every parameter.
     * @param name : name is a String corresponding to the name of a person.
     * @param address : address is a String corresponding to the person's address.
     * @param telephoneNumber : telephoneNumber is a String corresponding to the person's phone number.
     * */
    public Person(String name, String address, String telephoneNumber) {
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
    }
    //accessor
    /**
     * getName() is the accessor of the field name.
     * @return name : name is a String corresponding to the name of a person.
     * */
    public String getName() {
        return this.name;
    }
    /**
     * getAddress is the accessor of the field address.
     * @return address : address is a String corresponding to the person's address.
     * */
    public String getAddress() {
        return this.address;
    }
    /**
     * getTelephoneNumber is the accessor of the field telephoneNumber.
     * @return telephoneNumber : telephoneNumber is a String corresponding to the person's phone number.
     * */
    public String getTelephoneNumber() {
        return this.telephoneNumber;
    }
    //mutator
    /**
     * setName is the mutator of the field name;
     * @param name : This is the String that will be stored in the field name.
     * */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * setAddress is the mutator of the field address.
     * @param address : This is the new String that will be stored in the field address.
     * */
    public void setAddress(String address) {
        this.address = address;
    }
    /**
     * setTelephoneNumber is the mutator of the field telephoneNumber.
     * @param telephoneNumber : This is the new Stirn that will be stored in the field telephoneNumber.
     * */
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
    /**
     * toString transform the information in the object in a Qtring.
     * @return : A word corresponidng to each field and what is stored inside of them.
     * */
    @Override
    public String toString() {
        return "Name: " + this.name + "\nAddress  :" + this.address + "\ntelephone number: " + this.telephoneNumber;
    }
}

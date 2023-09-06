package PasswordVerifier;

public class Password {
    /**
     * This class store a Password in the field Password.
     */
    //Password is a field containing the Password.
    private String Password;

    /**
     * This is the default constructor.
     */
    public Password (){

    }

    /**
     * A constructor with one String parameter.
     * @param Password corresponding to the field Password.
     */
    public Password (String Password){
        setPassword(Password);
    }

    /**
     * This method change the Password field by another String.
     * @param Password is the new Password.
     */
    public void setPassword (String Password){
        this.Password = Password;
    }

    /**
     * this method return the field Password as a String.
     * @return Password a String.
     */
    public String getPassword (){
        return this.Password;
    }

    /**
     * This method return if the Password is valid (Min length : 6, at least 1 Lower case character, at least 1 Upper case character, at least 1 digit).
     * @return true if the Password is valid, false otherwise.
     */
    public boolean isValid (){
        if(this.Password.length() < 6){return false;}
        int CountLowerCase = 0, CountUpperCase = 0, CountDigit = 0;
        char[] Str = this.Password.toCharArray();
        for(int i=0;i<this.Password.length();i++){
            if(Character.isLowerCase(Str[i])){
                CountLowerCase++;
            }
            if(Character.isUpperCase(Str[i])){
                CountUpperCase++;
            }
            if(Character.isDigit(Str[i])){
                CountDigit++;
            }
        }
        if(CountLowerCase == 0 || CountUpperCase == 0 || CountDigit == 0){
            return false;
        }
        return true;
    }
}

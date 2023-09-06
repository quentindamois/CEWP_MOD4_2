package PasswordVerifier;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Password Pswd = new Password();
        do {
            System.out.println("Enter a Password: ");
            Pswd.setPassword(input.nextLine());
            if (!Pswd.isValid()) {
                System.out.println("Password invalid !");
            }
        }while(!Pswd.isValid());
        System.out.println("Password valid !\nYour Password is : " + Pswd.getPassword());
    }
}

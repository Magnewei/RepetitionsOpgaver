package Passwords;

public class Main {


    public static void main(String[] args) {
        PasswordValidater passwordValidater = new PasswordValidater(8, 3, true);
        PasswordValidater passwordValidaterCaps = new PasswordValidater(8, 3, true, true);
        String password = "easyM0de";

        if(passwordValidater.isValid(password)) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is not valid");
        }

        if( passwordValidaterCaps.isValidCaps(password)) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is not valid");
        }
    }
}

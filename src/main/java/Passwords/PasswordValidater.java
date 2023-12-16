package Passwords;

public class PasswordValidater {
    private int maxLength;
    private int minLength;
    private boolean numbersRequired;
    private boolean capsLockRequired;
    public PasswordValidater(int maxLength, int minLength, boolean numbersRequired) {
        this.maxLength = maxLength;
        this.minLength = minLength;
        this.numbersRequired = numbersRequired;

    }

    public PasswordValidater(int maxLength, int minLength, boolean numbersRequired, boolean capsLockRequired) {
        this.maxLength = maxLength;
        this.minLength = minLength;
        this.numbersRequired = numbersRequired;
        this.capsLockRequired = capsLockRequired;

    }

    public boolean isValid(String password) {
        if (password != null) {  // checks if password is not null.
            // Confirms that password min and max length requirements are fulfilled.
            if (password.length() <= maxLength && password.length() >= minLength && numbersRequired) {

                // If numbersRequired = true, then parse password in for loop and check if it contains a digit.
                for (char c : password.toCharArray()) {
                    if (Character.isDigit(c)) {
                        return true;
                    }
                }

                // if numbersRequired = false, then only check min and max length requirements of password.
            } else if (password.length() <= maxLength && password.length() >= minLength && !numbersRequired) {
                return true;
            }
        }
        // If password is null or above requirements are not met, return false.
        return false;
    }

    public boolean isValidCaps(String password) {
        if (password != null) {  // checks if password is not null.

            // Confirms that password min and max length requirements are fulfilled.
            if (password.length() <= maxLength && password.length() >= minLength && numbersRequired && capsLockRequired) {
                boolean containsUpperCase = false;
                boolean containsDigit = false;
                // If numbersRequired = true, then parse password in for loop and check if it contains a digit.
                for (char c : password.toCharArray()) {
                    if (Character.isDigit(c)) {
                        containsDigit = true;
                    }
                    if (Character.isUpperCase(c)) {
                        containsUpperCase = true;
                    }
                }

                // If all of above requirements are true, return true, else return false.
                return (containsDigit && containsUpperCase) == true ? true : false;

                // if numbersRequired = false, then only check min and max length requirements of password.
            } else if (password.length() <= maxLength && password.length() >= minLength && !numbersRequired) {
                return true;

                // if capsLockRequired = false, then only check min and max length requirements of password.
            } else if (password.length() <= maxLength && password.length() >= minLength && !capsLockRequired) {
                return true;
            }
        }
        // If password is null or above requirements are not met, return false.
        return false;
    }


}

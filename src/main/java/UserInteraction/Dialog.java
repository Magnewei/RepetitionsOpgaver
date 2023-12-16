package UserInteraction;

import java.util.Scanner;

public class Dialog {
    private final Scanner scanner = new Scanner(System.in);
    private int currentYear;
    public Dialog(int currentYear) {
        this.currentYear = currentYear;
    }

    public void getYearOfBirth() {
        System.out.println("Please type your birth year in the format of [0000]: \n");
        int yearOfBirth = Integer.parseInt(scanner.nextLine());
        if (yearOfBirth > 1800 && !(yearOfBirth > currentYear)) {
            System.out.println("You can retire in " + getYearsToRetirement(yearOfBirth) + " years.");
        } else {
            System.out.println("Input is invalid. Please type a valid year of birth.");
            getYearOfBirth();
        }
        scanner.close();
    }

    private int getYearsToRetirement(int i) {
        int retirementAge = 67;
        int retired = (i + retirementAge) - currentYear;
        return retired;
    }


}

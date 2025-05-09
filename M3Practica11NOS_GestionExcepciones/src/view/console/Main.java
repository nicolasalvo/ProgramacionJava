package view.console;

import exceptions.InvalidDniException;
import exceptions.InvalidPostalCodeException;
import java.util.Scanner;
import model.validations.UserDataValidations;

public class Main {

    static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {
        lector.useDelimiter("\n");
        String option;
        do {
            System.out.println("TESTER FUNCIONES UserDataValidations");
            System.out.println("1.- testCheckId");
            System.out.println("2.- testCheckFormatDate");
            System.out.println("3.- testCalculateAge");
            System.out.println("4.- testCheckPostalCode");
            System.out.println("5.- testIsNumeric");
            System.out.println("6.- testIsAlphabetic");
            System.out.println("7.- testCheckEmail");
            System.out.println("8.- testCheckName");
            System.out.println("9.- Exit");

            System.out.print("Option: ");
            option = lector.next();

            switch (option) {
                case "1":
                    testCheckId();
                    break;
                case "2":
                    testCheckFormatDate();
                    break;
                case "3":
                    testCalculateAge();
                    break;
                case "4":
                    testCheckPostalCode();
                    break;
                case "5":
                    testIsNumeric();
                    break;
                case "6":
                    testIsAlphabetic();
                    break;
                case "7":
                    testCheckEmail();
                    break;
                case "8":
                    testCheckName();
                    break;
                case "9":
                    System.out.println("Leaving the program...");
                    break;
                default:
                    System.out.println("Incorrect option");
            }
        } while (!option.equals("9"));
    }

    static void testCheckId() {
        System.out.print("Enter your ID: ");
        String id = lector.next();
        try {
            UserDataValidations.checkId(1, id);
            System.out.println("The ID is correct");
        } catch (InvalidDniException e) {
            System.out.println("The ID is incorrect: " + e.getMessage());
        }
    }

    static void testCheckFormatDate() {
        System.out.print("Enter your date in format dd/mm/yyyy: ");
        String date = lector.next();
        boolean isValid = UserDataValidations.checkFormatDate(date);
        System.out.println(isValid ? "The format date is correct" : "The format date is incorrect");
    }

    static void testCalculateAge() {
        System.out.print("Enter your birth date in format dd/mm/yyyy: ");
        String birthDate = lector.next();
        if (UserDataValidations.checkFormatDate(birthDate)) {
            int age = UserDataValidations.calculateAge(birthDate);
            System.out.println("Your age is: " + age + " years");
        } else {
            System.out.println("The date format is incorrect. Please use dd/mm/yyyy.");
        }
    }

    static void testCheckPostalCode() {
        System.out.print("Enter your postal code: ");
        String postalCode = lector.next();
        try {
            UserDataValidations.checkPostalCode(postalCode);
            System.out.println("The postal code is correct");
        } catch (InvalidPostalCodeException e) {
            System.out.println("The postal code is incorrect: " + e.getMessage());
        }
    }

    static void testIsNumeric() {
        System.out.print("Enter a string to check if it is numeric: ");
        String input = lector.next();
        boolean isNumeric = UserDataValidations.isNumeric(input);
        System.out.println(isNumeric ? "The string is numeric." : "The string is not numeric.");
    }

    static void testIsAlphabetic() {
        System.out.print("Enter a string to check if it is alphabetic: ");
        String input = lector.next();
        boolean isAlphabetic = UserDataValidations.isAlphabetic(input);
        System.out.println(isAlphabetic ? "The string is alphabetic." : "The string is not alphabetic.");
    }

    static void testCheckEmail() {
        System.out.print("Enter an email to validate: ");
        String email = lector.next();
        boolean isValid = UserDataValidations.checkEmail(email);
        System.out.println(isValid ? "The email is correct." : "The email is incorrect.");
    }

    static void testCheckName() {
        System.out.print("Enter a name to validate: ");
        String name = lector.next();
        boolean isValid = UserDataValidations.checkName(name);
        System.out.println(isValid ? "The name is correct." : "The name is incorrect.");
    }
}

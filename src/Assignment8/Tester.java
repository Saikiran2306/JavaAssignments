/*
Create three new types of exceptions. Write a class with a method that throws all three.
In main( ), call the method but only use a single catch clause that will catch all three types of exceptions.
Add a finally clause and verify that your finally clause is executed, even if a NullPointerException is thrown.
 */
package Assignment8;

import java.util.Scanner;

public class Tester {

    static void verifyException(String name, int age, String mobileNo, String address) throws InvalidNameException, InvalidNumberException, NegativeValueException {

        // verifying name
        String numbers = "0123456789";
        for (int i = 0; i < name.length(); i++) {
            if (numbers.contains("" + name.charAt(i))) {
                throw new InvalidNameException("InvalidNameException");
            }
        }
        if (age < 0) {
            throw new NegativeValueException("NegativeValueException");
        }
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < mobileNo.length(); i++) {
            mobileNo = mobileNo.toLowerCase();
            if (alphabets.contains("" + mobileNo.charAt(i))) {
                throw new InvalidNumberException("InvalidNumberException");
            }
        }
        if (address.equals("sai")) {
            new NullPointerException("Null value");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the following details for verification");
        String address = null;
        System.out.println("Enter the name");
        String name = sc.nextLine();
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Enter mobile number");
        String mobileNo = sc.next();
        try {
            verifyException(name, age, mobileNo, address);
        } catch (InvalidNameException | InvalidNumberException | NegativeValueException | NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally block");
        }
    }
}


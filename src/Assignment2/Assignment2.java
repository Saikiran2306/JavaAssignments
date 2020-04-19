/*
Write a java function that checks if the input text contains all the letters of the alphabet a-z (case-insensitive).
Write time and space complexity of your solution as comments in the source file.
*/
package Assignment2;

import java.util.Scanner;

public class Assignment2 {

    /**
     * @param text takes input as String
     *
     * This method prints contains or not contains of all the letters of the alphabet a-z (case-insensitive) in an input string.
     */

    public static void checkAllLetters(String text) {
        int charSum = 0, index = -1;
        char ch = ' ';
        text = text.toLowerCase();
        int charCount[] = new int[26];
        for (int i = 0; i < text.length(); i++) {
            ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                // Getting the Ascii value of the character
                index = ch - 97;
                if (charCount[index] == 0) {
                    charCount[index]++;
                }
            }
        }
        for (int i : charCount) {
            charSum += i;
        }
        if (charSum == 26) {
            System.out.println("String \"" + text + "\"contains all letters of the alphabet a-z (case-insensitive)" + "\n");

        } else {
            System.out.println("String \"" + text + "\" does not contains all letters of the alphabet a-z (case-insensitive)" + "\n");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Select an option from the following");
            System.out.println("1. Check all the alphabets in a string" + "\n" + "2. Exit");
            System.out.println("Enter your choice:");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Enter the string: ");
                    sc.nextLine();
                    String input = sc.nextLine();
                    checkAllLetters(input);
                    break;
                case 2:
                    System.out.println("Exited...");
                    return;
            }
        }
    }
}

/* Time Complexity
O(n) -> For iterating over text, where 'n' is length of String
O(26) -> For array sum
Hence total time complexity is O(n)+O(26) = O(n)

Space Complexity
For variable 'charSum' O(1)
For varaible 'i' O(1)
For array 'charCount' 26*4 bytes == O(108)
For variable 'ch' O(1)
Hence total space complexity is O(1)

*/
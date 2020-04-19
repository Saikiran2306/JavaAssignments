/*
Using the documentation for java.util.regex.Pattern as a resource,
write and test a regular expression that checks a sentence to see that it begins with a capital letter and ends with a period.
 */
package Assignment9;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Assignment9 {

    /**
     *
     * @param sentence takes an input as string
     *
     * This method prints sentence or not sentence by matching the input string with regex
     */
    public static void checkSentence(String sentence)
    {
        if(Pattern.matches("^[A-Z].*[.]",sentence))
        {
            System.out.println("Entered string is a sentence");
        }
        else
        {
            System.out.println("Entered String is not a sentence");
        }
    }


    public  static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String sentence=sc.nextLine();
        checkSentence(sentence);
    }
}

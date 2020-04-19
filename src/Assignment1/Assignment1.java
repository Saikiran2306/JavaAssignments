/*
Create a java program to search through the home directory and look for files that match a regular expression.
The program should be able to take inputs repeatedly and should print out the full absolute path of the matching files found.
Provide appropriate documentation and comments on your code.
*/

package Assignment1;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Assignment1 {

    /**
     * @param path takes file or directory path as String
     * @param matchPattern takes regex as String
     *
     * This method prints all absolute path of files or directories that matches with the regex
     */

    public static void listMatchingFilesInHomeDirectory(String path, String matchPattern) {

        //Creating file object and pointing it to current directory
        File currentDirectory = new File(path);

        // Getting all files from  directory and storing it in array of type file
        File[] files = currentDirectory.listFiles();

        // If there are no directories or files
        if (files == null) {
            return;
        }
        // If there exists any files or directories
        else {

            for (File file : files) {

                String fileName = file.getName();
                // If it is file and that matches with a matchPattern print it
                if (file.isFile() && Pattern.matches(matchPattern, fileName)) {

                    System.out.println(file.getAbsolutePath());
                }
                // If it is directory
                else {

                    listMatchingFilesInHomeDirectory(file.getAbsolutePath(), matchPattern);
                }
            }
        }
    }

    // main method
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Select an option from the following");
            System.out.println("1. listMatchingFilesInHomedirectory" + "\n" + "2. Exit");
            System.out.println("Enter your choice:");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Enter the pattern(eg: .*.txt) to list all matching files");
                    String expression = sc.next();
                    listMatchingFilesInHomeDirectory("/home", expression);
                    break;
                case 2:
                    System.out.println("Exited...");
                    return;
            }
        }
    }
}

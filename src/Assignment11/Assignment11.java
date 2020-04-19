/*
I/O
Using TextFile and a Map<Character,Integer>, create a program that takes the file name as a command line argument and counts the occurrence of all the different characters.
Save the results in a text file.
*/
package Assignment11;

import java.io.*;
import java.util.HashMap;

class Assignment11 {

    static private HashMap<Character, Integer> map;

    public Assignment11() {
        map = new HashMap<>();
    }

    /**
     *
     * @param text takes input as string
     *
     *  This method count the each character and its count and stores it in the map
     */
    public void countCharacters(String text) {
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            if (map.containsKey(text.charAt(i))) {
                int count = map.get(text.charAt(i));
                map.put(text.charAt(i), count + 1);
            } else {
                map.put(text.charAt(i), 1);
            }
        }
    }

    public static void main(String args[]) {

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            // Reading data from the file which is read from command line
            String sourceFilename = args[0];
            bufferedReader = new BufferedReader(new FileReader("/home/kiran/Zemoso/Java/Programs/JavaAssignments/src/Assignment11/" + sourceFilename));
            StringBuilder sb = new StringBuilder();
            String line = bufferedReader.readLine();
            while (line != null) {
                sb.append(line);
                line = bufferedReader.readLine();
            }
            System.out.println("Input file read");
            Assignment11 assignment11 = new Assignment11();
            assignment11.countCharacters(sb.toString());
            // Writing data onto the file
            bufferedWriter = new BufferedWriter(new FileWriter("/home/kiran/Zemoso/Java/Programs/JavaAssignments/src/Assignment11/Output.txt"));
            for (char key : map.keySet()) {
                bufferedWriter.write("Character " + key + " count is " + map.get(key));
                bufferedWriter.newLine();
            }
            System.out.println("Data saved in the output file");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedWriter != null)
                    bufferedWriter.close();
            } catch (Exception ex) {
                System.out.println("Error in closing the BufferedWriter" + ex);
            }
        }
    }
}
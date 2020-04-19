/*
Write a java function that will ping any host ( given as input ) and computes the median of the time taken to ping.
Use the system ping utility, do not use any deprecated methods.
*/
package Assignment3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Assignment3 {
    /**
     * @param command takes url as input string
     * @param numberoftimes takes an integer number for pinging
     *
     * This method compute and prints the median of time taken to ping
     */

    public static void runCommand(String command, int numberoftimes) {
        BufferedReader bufferedReader = null;
        try {
            // Executes the specified string command in a separate process.
            Process process = Runtime.getRuntime().exec(command);
            bufferedReader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));
            ArrayList<Float> pings = new ArrayList<>();
            String response = "";
            String pingtime = "";
            int len = numberoftimes;
            boolean unreachable = false;
            while ((response = bufferedReader.readLine()) != null) {
                if (Pattern.matches(".*time=.*", response)) {
                    String s[] = response.split(" ");
                    pingtime = s[7].substring(5);
                    System.out.println(pingtime + " ms");
                    pings.add(Float.parseFloat(pingtime));
                    unreachable = true;
                }
            }
            Collections.sort(pings);
            if (!unreachable)
                System.out.println("Network issue wrong url");
            else {
                float medainTime = 0;
                if (len % 2 == 0) {
                    medainTime = (pings.get(len / 2) + pings.get(len / 2 - 1)) / 2;
                } else {
                    medainTime = (float) pings.get(len / 2);
                }
                System.out.println("Median of time taken to ping is " + medainTime + " ms");
            }
        } catch (Exception e) {
            System.out.println(" error while executing ping command");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the url to ping:");
        String url = sc.next();
        System.out.println("Enter the number of times to ping:");
        int numberOfTimes = sc.nextInt();
        runCommand("ping -c" + numberOfTimes + " " + url, numberOfTimes);
    }

}

/*
Gruber Healthcare has different types of forms for their customer, one of which is a know your customer form ( KYC ) which has to be filled annually. Each form has a date which signifies the date the form was filled called the form date.
Due to government regulations the KYC form can only be filled within + or - 30 days of the signup anniversary of a customer. When filling it up, you have to provide the form date. If you are past the +-30 day anniversary then you can back-date it so that it falls in the +-30-day window. When filling it up you cannot use a future date for the form date.
For Example, assuming today is 4 Apr 2017 and I had signed up on 1st Mar 2014, my window for KYC submission this year would be 30 Jan 2017 to 31 Mar 2017. Since it is already 4th Apr - I would have to back-date the KYC to a date in this range.
Note: The KYC form can be filled only for the closest anniversary in the past or within 30 days range in future.
Anniversary refers to same day and month every year. If your birthday is 01-02-1992 -then your first anniversary will be 01-02-1993, the 2nd will be 01-02-1994 and so on. 01-02-1992 is not an anniversary.
Given the signup date and the current date, provide the allowable date range for the form date.

Input - First line is an integer n as the number of inputs to be passed. Next, n lines are n input for the program in the format dd-mm-yyyy dd-mm-yyyy Each line has two dates separated by space where the first date in signup date and the second date is the current date.

Output - Range of dates for KYC form in format dd-mm-yyyy dd-mm-yyyy

Test Input:
5
16-07-1998 27-06-2017
04-02-2016 04-04-2017
04-05-2017 04-04-2017
04-04-2015 04-04-2016
04-04-2015 15-03-2016

Test output:
16-06-2017 27-06-2017
05-01-2017 06-03-2017
No range
05-03-2016 04-04-2016
05-03-2016 15-03-2016
*/

package Assignment4;

import java.text.SimpleDateFormat;
import java.util.*;

public class Assignment4 {

    private static List<String> list;

    public Assignment4() {
        list = new ArrayList<>();
    }

    /**
     * This method prints all allowable dates from given date range
     */
    public static void printAllAllowableDateRange() throws Exception {

        for (int i = 1; i < list.size(); i++) {
            String dates[] = list.get(i).split(" ");
            // Formating the input to "dd-MM-yyy" format
            SimpleDateFormat sdfo = new SimpleDateFormat("dd-MM-yyyy");

            // Signup date
            Date startDate = sdfo.parse(dates[0]);
            // Current day date
            Date presentDate = sdfo.parse(dates[1]);

            // If Signup date is greater than current day date
            if (startDate.compareTo(presentDate) > 0) {
                System.out.println("No range");
            }
            // Print the allowable date
            else {
                Date tempDate = sdfo.parse(dates[0].substring(0, 6) + dates[1].substring(6));
                Calendar cal = Calendar.getInstance();
                cal.setTime(tempDate);
                // Calculating  date of 30 days before of tempDate
                cal.add(Calendar.DATE, -30);
                Date currentYearStartDate = sdfo.parse(sdfo.format(cal.getTime()));
                cal.setTime(tempDate);
                // Calculating  date of 30 days after of tempDate
                cal.add(Calendar.DATE, 30);
                Date currentYearEndtDate = sdfo.parse(sdfo.format(cal.getTime()));
                if (presentDate.compareTo(currentYearStartDate) > 0 && presentDate.compareTo(currentYearEndtDate) < 0) {
                    System.out.println(sdfo.format(currentYearStartDate) + " " + dates[1]);
                } else {
                    System.out.println(sdfo.format(currentYearStartDate) + " " + sdfo.format(currentYearEndtDate));
                }
            }
        }
    }

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        Assignment4 assignment4 = new Assignment4();
        System.out.println("Enter the dates in the format dd-mm-yyyy dd-mm-yyyy");
        for (int i = 0; i < n + 1; i++) {
            String s = sc.nextLine();
            assignment4.list.add(s);
        }
        assignment4.printAllAllowableDateRange();
    }
}

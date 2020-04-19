/*
A vampire number v is a number with an even number of digits n,
that can be factored into two numbers x and y each with n/2 digits and not both with trailing zeroes,
where v contains precisely all the digits from x and from y, in any order.
Write a java program to print first 100 vampire numbers.
 */
package Assignment6;

import java.util.Arrays;

public class VampireClass {

    /**
     * @param num takes number as input
     *
     * This method computes weather the is odd length or not
     *
     * @return boolean
     */
    public static boolean isOddLength(int num) {
        String st = String.valueOf(num);
        if (st.length() % 2 != 0)
            return true;
        return false;
    }

    /**
     *
     * @param num takes number as input
     * @param k is an integer value
     * @param j is an integer value
     *
     * This method computes weather number is vampire or not
     *
     * @return boolean
     */
    public static boolean isVampire(int num, int k, int j) {

        String str = String.valueOf(num);
        int len = str.length();

        String s1 = String.valueOf(k);
        String s2 = String.valueOf(j);
        int i = 0;
        // If any of divided strings are odd length
        if (s1.length() != len / 2 || s2.length() != len / 2)
            return false;

        // If both of the strings contains trailing zeros
        if (s1.charAt(s1.length() - 1) == '0' && s2.charAt(s2.length() - 1) == '0')
            return false;

        char[] org = str.toCharArray();
        char[] mix = (s1 + s2).toCharArray();
        Arrays.sort(org);
        Arrays.sort(mix);
        return Arrays.equals(org, mix);
    }

    public static void main(String... args) {
        int firstVampireNum = 1260, counts = 1, j = 0, k = 0;
        while (counts <= 100) {
            if (isOddLength(firstVampireNum)) {
                firstVampireNum++;
                continue;
            }
            for (int i = 1; i < Math.sqrt(firstVampireNum); i++) {

                j = firstVampireNum / i;
                if (firstVampireNum % i == 0) {
                    if (isVampire(firstVampireNum, i, j)) {
                        System.out.println(counts + "  " + firstVampireNum);
                        counts++;
                        break;
                    }
                }

            }
            firstVampireNum++;
        }
    }
}

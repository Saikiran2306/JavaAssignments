
package Assignment7.exampleCycleInterface;

import java.util.Scanner;

public class Tester {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the type of cycle:");
        String cycleType = sc.next();
        GetCycleInfo getCycle = new GetCycleInfo();
        getCycle.getCycle(cycleType).NumberOfWheels();
    }

}

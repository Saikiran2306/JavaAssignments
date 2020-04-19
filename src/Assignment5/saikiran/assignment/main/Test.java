/*
Create main class in package yourname.assignment.main, create object of first class and call both the methods to print
the values. Create object of second class using static method and then call the other method to print the String.
*/
package Assignment5.saikiran.assignment.main;

import Assignment5.saikiran.assignment.data.Data;
import Assignment5.saikiran.assignment.singleton.Singleton;

public class Test {
    public static void main(String args[]) {

        Data data = new Data();
        data.printInstanceVariables();
        data.printLocalVariables();

        Singleton singleton = Singleton.initialize("Hello");
        singleton.print();

    }
}
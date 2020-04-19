/*
Create a class in a package yourname.assignment.data containing an int and a char member variables that are not initialized,
add a method to print these variables. Add another method in the same class with two local variables and
print their values without initializing them
 */
package Assignment5.saikiran.assignment.data;

public class Data {
    private int data;
    private char character;

    /**
     *  This method prints the values of class varaibles
     */
    public void printInstanceVariables() {
        System.out.println("Value of data varaiable is " + data);
        System.out.println("Value of character varaiable is " + character);
    }

    /**
     *  This method prints the values of local variables
     */
    public void printLocalVariables() {
//        int localData ;
//        char localCharacter ;
//
//        System.out.println("Value of localData varaiable is " + localData);
//        System.out.println("Value of localCharacter varaiable is " + localCharacter);

    }
}

// Errors description
/*
The error is in the method printLocalVariables, due to two local varaiableslocalData and localCharacter because,
In Java local variables need to be initialized before to access it.
It does not have any default value, so it is mandatory to initialize it before access.
 */


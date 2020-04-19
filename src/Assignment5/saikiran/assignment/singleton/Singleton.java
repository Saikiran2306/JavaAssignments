/*
Create another class in package yourname.assignment.singleton containing a non static String member variable.
Add a static method that takes String as parameter and initialize the member variable and then return object of that class.
Add a non static method to print the String.
 */
package Assignment5.saikiran.assignment.singleton;

public class Singleton {

    private String message;
    private static Singleton singleton;

    /**
     *
     * @param text takes an input as string
     *
     *  This method initializes the class variables
     *
     * @return It returns the class type of Singleton
     */
    static public Singleton initialize(String text) {
        if (singleton == null) {
            singleton = new Singleton();
        }
        singleton.message = text;
        return singleton;
    }

    public void print() {
        System.out.println("Value of message variable is " + message);
    }
}

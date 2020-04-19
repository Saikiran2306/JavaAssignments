/*
Create a class with a constructor that takes a String argument.
During construction, print the argument. Create an array of object references to this class,
but don’t actually create objects to assign into the array. When you run the program, notice whether the initialization messages from the constructor calls are printed.
*/
package Assignment6;

public class ObjectsWithoutReferences {
    private String text;

    public ObjectsWithoutReferences(String text) {
        this.text = text;
        System.out.println("Value of variable text is " + text);
    }

    public static void main(String args[]) {
        for (int i = 0; i < 5; i++) {
            new ObjectsWithoutReferences("Hello");
        }
    }
}

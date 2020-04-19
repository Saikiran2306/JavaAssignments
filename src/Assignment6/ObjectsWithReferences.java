/*
Create a class with a constructor that takes a String argument.During construction, print the argument.
Create an array of object references to this class,and attach to the array of references. When you run the program, notice whether the initialization messages from the constructor calls are printed.
*/

package Assignment6;

public class ObjectsWithReferences {
    private String text;

    public ObjectsWithReferences(String text) {
        this.text = text;
        System.out.println("Value of variable text is " + text);
    }

    public static void main(String args[]) {
        ObjectsWithReferences[] objectsWithReferences = new ObjectsWithReferences[5];
        for (int i = 0; i < 5; i++) {
            objectsWithReferences[i] = new ObjectsWithReferences("Hello");
        }
    }
}

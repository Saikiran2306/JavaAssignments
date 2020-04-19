/*
Create a class with an inner class that has a non-default constructor (one that takes arguments).
Create a second class with an inner class that inherits from the first inner class.
 */
package Assignment7.innerClass;

public class Tester {
    public static void main(String args[]) {
      ClassTwo classTwo = new ClassTwo();
        classTwo.new InnerClassTwo(10);
    }
}
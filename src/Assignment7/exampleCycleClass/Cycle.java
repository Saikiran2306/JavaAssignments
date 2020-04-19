/*
Create a Cycle class
*/
package Assignment7.exampleCycleClass;

public class Cycle {

    private int wheels;

    public Cycle(int wheels) {

        this.wheels = wheels;
        System.out.println("This is a Cycle" + "\n" + "I am base class" + "\n" + "My sub class is " + "\n");
    }

    public int getNumberOfWheels() {
        return wheels;
    }


}

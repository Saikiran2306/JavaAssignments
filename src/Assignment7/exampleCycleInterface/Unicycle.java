/*
Create Unicycle class which implementing Cycle interface
*/
package Assignment7.exampleCycleInterface;

public class Unicycle implements Cycle {
    private int wheels;

    public Unicycle(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public void NumberOfWheels() {
        System.out.println("Unicycle has " + wheels + " wheel");
    }
}

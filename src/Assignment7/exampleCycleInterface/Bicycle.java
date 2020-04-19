/*
Create Bicycle class which implementing Cycle interface
*/
package Assignment7.exampleCycleInterface;

public  class Bicycle implements Cycle {
    private int wheels;

    public Bicycle(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public void NumberOfWheels() {
        System.out.println("Bicycle has " + wheels + " wheels");
    }
}

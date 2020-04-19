/*
Create Tricycle class which implementing Cycle interface
*/

package Assignment7.exampleCycleInterface;

public  class Tricycle implements Cycle {

    private int wheels;

    public Tricycle(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public void NumberOfWheels() {
        System.out.println("Tricycle has " + wheels + " wheels");
    }
}

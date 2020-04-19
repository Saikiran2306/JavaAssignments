/*
Create subclasses Tricycle.
*/
package Assignment7.exampleCycleClass;

public class Tricycle extends Cycle {
    public Tricycle(int wheels) {
        super(wheels);
        System.out.println("Tricycle" + "\n");
    }

    public int getTricycleWheels() {
        System.out.println("The number of wheels in the Tricycle ");
        return getNumberOfWheels();
    }
}
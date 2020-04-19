/*
Create subclasses Bicycle. Add a balance( ) method to Unicycle
*/

package Assignment7.exampleCycleClass;

public class Bicycle extends Cycle {
    public Bicycle(int wheels) {
        super(wheels);
        System.out.println("Bicycle" + "\n");
    }

    public int getBicycleWheels() {
        System.out.println("The number of wheels in the Bicycle ");
        return getNumberOfWheels();

    }

    public void balance() {
        System.out.println("Bicycle balance method" + "\n");
    }

}

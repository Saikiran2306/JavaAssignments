/*
Create subclasses Unicycle. Add a balance( ) method to Unicycle
*/

package Assignment7.exampleCycleClass;

public class Unicycle extends Cycle {

    public Unicycle(int wheels) {
        super(wheels);
        System.out.println("Unicycle" + "\n");
    }

    public int getUnicycleWheels() {
        System.out.println("The number of wheels in the Unicycle ");
        return getNumberOfWheels();
    }

    public void balance() {
        System.out.println("Unicycle balance method" + "\n");
    }

}


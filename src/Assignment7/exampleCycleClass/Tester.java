/*
Create instances of all three types and upcast them to an array of Cycle.
Try to call balance( ) on each element of the array and observe the results.
Downcast and call balance( ) and observe what happens.package Assignment7;
*/

package Assignment7.exampleCycleClass;

public class Tester {

    public static void main(String args[]) {
        Cycle cycle[] = new Cycle[3];
        Unicycle unicycle=new Unicycle(1);
        Bicycle bicycle=new Bicycle(2);
        Tricycle tricycle=new Tricycle(3);

        // Upcasting
        cycle[0] = unicycle;
        cycle[1] = bicycle;
        cycle[2] = tricycle;

        /* The following lines results in compilation error because
         - The parent class reference cycle does not have a balance method
         */

       /*cycle[0].balance();
        cycle[1].balance();
        cycle[2].balance();
        */

        try {
            unicycle = (Unicycle) (cycle[0]);
            System.out.print(unicycle.getUnicycleWheels() + "\n");
            unicycle.balance();

            bicycle = (Bicycle) (cycle[1]);
            System.out.print(bicycle.getBicycleWheels() + "\n");
            bicycle.balance();

            tricycle = (Tricycle) (cycle[2]);
            System.out.print(tricycle.getTricycleWheels() + "\n");

            /*
              The following line result in compilation error because
             - balance() method is not present in neither Cycle class nor Tricycle class
             */
          //  tricycle.balance();

        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }
}


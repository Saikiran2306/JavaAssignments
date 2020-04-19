/*
Create factories for each type of Cycle, and code that uses these factories.
 */
package Assignment7.exampleCycleInterface;

public class GetCycleInfo implements CycleFactory {

    @Override
    public Cycle getCycle(String name) {
        if (name.equals("Unicycle")) {
            return new Unicycle(1);
        } else if (name.equals("Bicycle")) {
            return new Bicycle(2);
        } else if (name.equals("Tricycle")) {
            return new Tricycle(3);
        }
        return null;
    }
}

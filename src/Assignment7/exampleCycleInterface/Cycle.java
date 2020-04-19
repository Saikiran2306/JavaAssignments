/*
Create a Cycle interface
 */
package Assignment7.exampleCycleInterface;

interface Cycle {
    void NumberOfWheels();
}

interface CycleFactory {
    Cycle getCycle(String name);
}


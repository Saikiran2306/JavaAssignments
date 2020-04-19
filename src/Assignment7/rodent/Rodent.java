package Assignment7.rodent;

public abstract class Rodent {
    public Rodent() {
        System.out.println("This is a rodent " + " \n" + "I am base class" + "\n" + "My child class is");
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void run();
}
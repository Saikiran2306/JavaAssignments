/*
Create a class with two (overloaded) constructors. Using this, call the second constructor inside the first one.
*/

package Assignment6;

public class ConstructorOverloading {
    private int num;

    public ConstructorOverloading() {
        this(23);
    }

    public ConstructorOverloading(int num) {
        this.num = num;
        System.out.println("Value of variable num is " + num);
    }
}


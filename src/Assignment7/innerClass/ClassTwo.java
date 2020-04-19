package Assignment7.innerClass;

public class ClassTwo {
    public ClassTwo() {
        System.out.println("ClassTwo Constructor");
    }

    class InnerClassTwo extends ClassOne.InnerClassOne {
        public InnerClassTwo(int num) {

            new ClassOne().super(num);
            System.out.println("InnerClassTwo Constructor");
        }

    }
}

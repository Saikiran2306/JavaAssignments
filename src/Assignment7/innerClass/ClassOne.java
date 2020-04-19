package Assignment7.innerClass;

public class ClassOne {
    public ClassOne() {
        System.out.println("ClassOne Constructor");
    }

    class InnerClassOne {

        private int num;

        public InnerClassOne(int num) {
            this.num = num;
            System.out.println("InnerClassOne Constructor");
        }
    }
}

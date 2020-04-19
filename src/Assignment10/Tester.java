package Assignment10;

public class Tester {

    public static void main(String args[]) {
        SList<Integer> sList = new SList<Integer>();
        SListIterator<Integer> sListIterator = sList.getIterator();
        sListIterator.addAtLast(10);
        sListIterator.addAtLast(20);
        sListIterator.addAtLast(30);
        sListIterator.addAtLast(40);
        sListIterator.addAtLast(50);
        sListIterator.displayList();
        System.out.println("Size of list is " + sListIterator.getSize());
        sListIterator.deleteNode(10);
        sListIterator.deleteNode(50);
        sListIterator.displayList();
        System.out.println("Size of list is " + sListIterator.getSize());

    }
}

package Assignment10;

public class SListIterator<T> {

    Node<T> head, prev;
    private int count;

    public void addAtLast(T num) {
        count++;
        Node<T> curr = new Node<>(num);
        if (head == null) {
            head = curr;
            prev = head;
        } else {
            prev.next = curr;
            prev = curr;
        }
    }

    public void deleteNode(T num) {
        Node<T> curr = head, prev = null;
        if (curr == null) {
            System.out.println("List is empty");
            return;
        }
        if (curr != null && String.valueOf(curr.data).equals(String.valueOf(num))) {
            System.out.println("Node " + num + " deleted");
            count--;
            head = curr.next;
            return;
        }
        while (curr != null && !String.valueOf(curr.data).equals(String.valueOf(num))) {
            prev = curr;
            curr = curr.next;
        }
        if (curr == null) {
            System.out.println("Node " + num + " not found in the list");
            return;
        } else {
            prev.next = curr.next;
            System.out.println("Node " + num + " deleted");
            count--;
        }

    }

    public void displayList() {
        Node<T> curr = head;
        if (curr == null) {
            System.out.println("List is empty");
        } else {
            System.out.println("The elements in the list are");
            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
            System.out.println();
        }
    }

    public int getSize() {
        return count;
    }

}

package linkedlist;

import org.w3c.dom.Node;

public class Main {
    public static void main(String[] args) {
    LinkedList ll = new LinkedList();

        ll.add(5);
        ll.add(14);
        ll.add(110);
        ll.add(8);
        ll.add(6);
        ll.add(4);

        ll.print(ll.sort(ll.head));


    }
}
package linkedlist;

public class CircularLinkedList {
    static class Node {
        int data;
        Node next;

        Node() {

        }
    }

    Node head;

    // Display elements
    void display(Node head) {
        Node p = head;
        do {
            System.out.println(p.data);
            p = p.next;
        } while (p != head);
    }

    //    Inserting elements
    void insert(int position, int data) {
        if (position != 0) {
            Node t = new Node();
            Node p = head;
            for (int i = 0; i < position - 1; i++) {
                p = p.next;
            }
            t.data = data;
            t.next = head;
            p.next = t;
        } else {

            Node t = new Node();
            if (head == null) {
                head = t;
                head.next = head;
            } else {
                Node p = head;
                t.data = data;
                t.next = head;
                while (p.next != head) {
                    p = p.next;
                }
                p.next = t;
                head = t;
            }
        }

    }
}
package queue;

public class QueueLinkedList {
    class Node {
        int data;
        Node next;

        Node() {}
    }
    Node front=null, rear=null;

    Node head;

    void enqueque(int x) {
        Node t=new Node();
        t.data = x;
        t.next = null;
        if(front==null) {
            front = rear = t;
        }else {
            rear.next = t;
            rear = t;
        }
    }

    int dequeue() {
        int x = -1;
        if(front==null) {
            System.out.println("Queue is Empty");
        }else {
            Node p = front;
            front = front.next;
            x = p.data;
        }
        return x;
    }

    void display() {
        Node p = front;
        while(p!=null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
    }
}

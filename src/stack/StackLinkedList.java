package stack;

public class StackLinkedList<E> {
    class Node {
        E data;
        Node next;
    }
    Node top;
    void Node () {

    }

    void push(E data) {
        Node t = new Node();
        t.data = data;
        t.next = top;
        top = t;
    }

    void print() {
        Node t = top;

        while (t != null) {
            System.out.println(t.data);
            t = t.next;
        }
    }

    void pop() {
        Node t = top;
        top = top.next;
        t = null;
    }

    E peek(int pos) {
        E x = null;
        if(top==null) {
            System.out.println("Stack UnderFlow!");
        }else {
            Node p = top;
            for(int i=0;p!=null && i<pos-1; i++) {
                p = p.next;
            }
            if(p!=null)
                x = p.data;
        }
        return x;
    }

    boolean isEmpty(StackLinkedList<E> st) {
        return st.top == null;
    }



}


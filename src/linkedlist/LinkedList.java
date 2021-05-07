package linkedlist;

public class LinkedList {
    //    Defining Node
    static class Node {
        int data;
        Node next;

        Node() {

        }
    }

    Node head;
    Node last;

    // Inserting at any Position
    void insert(int value, int position) {
        if (position == 0) {
            Node t = new Node();
            t.data = value;
            t.next = head;
            head = t;
        } else {
            Node t = new Node();
            t.data = value;
            Node p = head;
            for (int i = 0; i < position - 1 && p != null; i++) {
                p = p.next;
            }
            t.next = p.next;
            p.next = t;
        }
    }

    // Printing Elements in a Linked List
    void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // Maximum in a Linked List
    int max(Node head) {
        Node p = head;
        int m = -32768;
        while (p != null) {
            if (p.data > m)
                m = p.data;
            p = p.next;
        }
        return m;
    }

    //    Searching in a Linked List
    String search(int key) {
        Node p = head;
        int count = 1;
        while (p != null) {
            if (p.data == key) {
                return "Element found at " + count;
            }
            p = p.next;
            count++;
        }
        return key + " is not present in Linked List";
    }

    //    Sum of all elements
    String sum(Node head) {
        int sum = 0;
        Node p = head;
        while (p != null) {
            sum += p.data;
            p = p.next;
        }
        return "Sum of Elements is " + sum;
    }

    void add(int data) {
        Node first = head;
        Node t = new Node();
        t.data = data;
        t.next = null;
        if (first == null) {
            head = last = t;
        } else {
            last.next = t;
        }
        last = t;
    }

    //    Inserting at sorted position in LinkedList (Linked List should be sorted)
    void insertSorted(int x) {
        Node t = new Node();
        Node p = head;
        Node q = null;
        t.data = x;
        while (p != null && p.data < x) {
            q = p;
            p = p.next;
        }
        t.next = q.next;
        q.next = t;
    }

    //    Deleting a Node
    void delete(int pos) {
        if (pos == 1) {
            Node p = head;
            head = head.next;
            int x = p.data;
            p = null;
        } else {
            Node p = head;
            Node q = null;
            for (int i = 0; i < pos - 1 && p != null; i++) {
                q = p;
                p = p.next;
            }
            if (p != null) {
                q.next = p.next;
                int x = p.data;
                p = null;
            }
        }
    }

    //    Check whether linked list is sorted
    String isSorted() {
        int x = -32768;
        Node p = head;
        while (p != null) {
            if (p.data < x)
                return "Not Sorted !";
            x = p.data;
            p = p.next;
        }
        return "Sorted !";
    }

    //    Removing Duplicates from the Linked List
    void removeDuplicates() {
        Node p = head;
        Node q = head.next;

        while (q != null) {
            if (p.data != q.data) {
                p = q;
                q = q.next;
            } else {
                p.next = q.next;
                q = null;
                q = p.next;
            }
        }
    }

    int count() {
        Node p = head;
        int count = 0;
        while(p!=null) {
            count++;
            p=p.next;
        }
        return count;
    }

    boolean isIdentical(Node head1, Node head2) {
        Node p = head1;
        Node q = head2;

        while(p!=null || q!=null) {
            if(p.data != q.data) {
                return false;
            }
            p = p.next;
            q = q.next;
        }
        return true;
    }

    Node sort(Node head) {
        Node p = head.next;
        Node q = head;
        int x=0;
        while(p!=null) {
            if(p.data < q.data) {
                x = p.data;
                p.data = q.data;
                q.data = x;
            }
            q = p;
            p=p.next;
        }
        return head;
    }
}

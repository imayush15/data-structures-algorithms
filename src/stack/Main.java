package stack;

public class Main {
    public static void main(String[] args) {
        StackLinkedList<Integer> st = new StackLinkedList<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st.peek(10));


    }
}

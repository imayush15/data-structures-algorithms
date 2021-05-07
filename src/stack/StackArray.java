package stack;

import org.jetbrains.annotations.NotNull;

public class StackArray {
    int top;
    int size;
    int[] arr;

    StackArray(int size) {
        this.size = size;
        top = -1;
        arr = new int[size];
    }

    void push(@NotNull StackArray st, int data) {

//        Checking Whether Stack is full or not
        if(st.top==st.size-1) {
            System.out.println("Stack Overflow !");
        }else {
            st.top++;
            st.arr[st.top] = data;
        }
    }
    int pop(StackArray st) {
        int x = -1;

//        Checking if stack is empty
        if(st.top==-1) {
            System.out.println("Stack Underflow !");
        }
        else {
            x = st.arr[st.top];
            st.top--;
        }
        return x;
    }
}




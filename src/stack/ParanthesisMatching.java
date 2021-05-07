package stack;

public class ParanthesisMatching {
    static class charStack {
        int top;
        int size;
        char[] arr;

        charStack(int size) {
            this.size = size;
            top = -1;
            arr = new char[size];
        }

        void push(charStack st,char c) {
            top++;
            st.arr[st.top] = c;
        }

        void pop() {
            if(top == -1) {
                System.out.println("Stack Underflow !");
            }else {
                top--;
            }
        }
    }

   static boolean isBalanced(String str) {
        charStack st = new charStack(str.length());

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)=='(') {
                st.push(st, str.charAt(i));
            }else if(str.charAt(i)==')') {
                if(st.top==-1) {
                    return false;
                }st.pop();
            }
        }

        return st.top==-1?true:false;
    }


    public static void main(String[] args) {
        String str = "((a+b)*(c-d)))";
        charStack st = new charStack(str.length());

        System.out.println(isBalanced(str));

    }

}

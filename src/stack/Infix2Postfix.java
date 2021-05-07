package stack;
import java.util.Stack;
public class Infix2Postfix {
    static boolean isOperand(char x) {
        return x != '+' && x != '-' && x != '*' && x != '/';
    }
    static int pre(char x) {
        if(x=='+' || x=='-') {
            return 1;
        }else if(x=='*' || x=='/'){
            return 2;
        }
        return 0;
    }


    static String convert(String infix) {
        Stack<Character> st = new Stack<>();
        String postfix = "";
        int i=0, j=0;
        while(i<infix.length()) {
            if(isOperand(infix.charAt(i))) {
                postfix += infix.charAt(i++);
            }else {
                char s_top = st.pop();
                if(pre(infix.charAt(i)) >pre(s_top)) {
                    st.push(infix.charAt(i++));
                }else {
                    postfix += st.pop();
                }
            }
        }
        while(!st.empty()) {
            postfix += st.pop();
        }
        return postfix;
    }
    public static void main(String[] args) {
        String infix = "a+b*c";
        System.out.println(convert(infix));
    }
}

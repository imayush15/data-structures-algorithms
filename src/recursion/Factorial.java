package recursion;

public class Factorial {
    static int fact(int n) {
        if(n>0) {
            return fact(n-1)*n;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}

package recursion;

public class Exponent {
    static int exp(int m, int n) {
        if(n>0) {
            return exp(m, n-1)*m;
        }
        return 1;
    }

    static int pow(int m, int n) {
        if(n==0) return 1;
        if(n%2==0) {
            return pow(m*m, n/2);
        }
        else {
            return m*pow(m*m, (n-1)/2);
        }

    }

    public static void main(String[] args) {
        System.out.println(exp(4, 2));
        System.out.println(pow(4, 2));
    }
}

package Algorithms;

public class BubbleSort {

    static int[] bubble(int a[]) {
        int n = a.length;
        int flag;
        for(int i=0; i<n-1; i++) {
            flag=0;
            for(int j=0; j<n-i-1; j++) {
                if(a[j]>a[j+1]) {
                    int t;
                    t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                    flag=1;
                }
            }
            if (flag==0) break;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {5,4,3,2,1};
        int[] b = bubble(a);

        for(int x : b) {
            System.out.print(x + " ");
        }
    }
}
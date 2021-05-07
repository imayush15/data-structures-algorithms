package Algorithms;

public class CountSort {

    static int max(int[] arr, int n) {
        int x = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            if(arr[i]>x) {
                x = arr[i];
            }
        }
        return x;
    }


    static void sort(int[] arr, int n) {
    int max = max(arr, n);
    int[] c = new int[max+1];

        for(int i=0; i<max; i++){
        c[i]=0;
    }
        for(int i=0; i<n; i++) {
        c[arr[i]]++;
    }

    int i=0, j=0;
        while(i<max+1){
        if(c[i]>0) {
            arr[j++] = i;
            c[i]--;
        }else {
            i++;
        }
    }

    }
}

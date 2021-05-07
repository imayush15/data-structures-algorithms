package Algorithms;

public class InsertionSort {
    static void InSort(int[] arr, int size) {
        int j, temp;
        for(int i=1; i<size; i++) {
            temp = arr[i];
            j = i-1;
            while(j>=0 && arr[j] > temp) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};

        System.out.print("Input Array : ");
        for(int x : arr) {
            System.out.print(x + " ");
        }
        InSort(arr, arr.length);
        System.out.print("\nOutput Array : ");
        for(int x : arr) {
            System.out.print(x + " ");
        }
    }

}

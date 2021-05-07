package Algorithms;

public class SelectionSort {
    static void SelectSort(int[] arr, int size) {
        int j, k;
        for(int i=0; i<size; i++) {
            for(j=k=i; j<size; j++) {
                if(arr[j] < arr[i]) {
                    k=j;
                }
                int temp=arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};

        System.out.print("Input Array : ");
        for(int x : arr) {
            System.out.print(x + " ");
        }
        SelectSort(arr, arr.length);
        System.out.print("\nOutput Array : ");
        for(int x : arr) {
            System.out.print(x + " ");
        }
    }
}

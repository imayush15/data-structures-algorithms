package Algorithms;

public class MergeSort {
    static int[] MergeList(int[] arr, int l, int mid, int h) {
        int i=l, j=mid+1, k=h;
        int[] a2 = new int[h+1];

        while(i<=mid && j<=h) {
            if (arr[i]<arr[j]) {
                a2[k++] = arr[i++];
            }
            else {
                a2[k++] = arr[j++];
            }
        }
        for( ; i<=mid; i++) {
            a2[k++] = arr[i];
        }
        for( ; j<=h; j++) {
            a2[k++] = arr[j];
        }
        return a2;
    }

    static int[] SortMerge(int arr[], int l, int h) {
        int arr2[] = new int[h+1];
        if(l<h) {
            int mid = (l+h)/2;
            SortMerge(arr, l, mid+1);
            SortMerge(arr, mid+1, h);
            arr2 = MergeList(arr, l, mid, h);
        }
        return arr2;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int l = 0;
        int h = arr.length;

        int[] arr2 = SortMerge(arr,l, h);

        for(int x: arr2) {
            System.out.print(x + " ");
        }
    }


}
package test;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while( t-- > 0 ) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for( int i=0; i<n; i++ ) {
                arr[i] = sc.nextInt();
            }

            for( int i=0; i<(n/2); i++ ) {
                if( arr[i+1] > arr[i] ) {
                    System.out.println("0");
                    break;
                }
            }

            for( int i=(n/2)+1; i<n-1; i++ ) {
                if( arr[i+1] < arr[i] ) {
                    System.out.println("0");
                    break;
                }
            }

            System.out.println("1");
        }

    }
}
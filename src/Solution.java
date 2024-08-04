//{ Driver Code Starts

import java.util.*;
import java.io.*;
import java.lang.*;


public class Solution {
    public static void swapElements(int[] arr, int n)

    {
        if (n>2){
            int i = 0, j = 2, e = 0, o = 0;
            for (int k = 0; k < n; k++) {
                if (k % 2 == 0) {
                    o++;
                } else {
                    e++;
                }
            }

            System.out.println(e);
            System.out.println(o);

            int c = o - 1;


            int temp;
            while (c-- > 0) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i += 2;
                j += 2;
            }
            c = e - 1;
            i = 1;
            j = 3;


            while (c-- > 0) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i += 2;
                j += 2;
            }
        }



//            System.out.println(j);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        swapElements(arr, n);
    }
}
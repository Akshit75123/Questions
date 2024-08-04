package Recursion;

import java.util.Arrays;

//Merge Sort Code from Kunal Kushwaha
public class MS {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        int []ans=mergeSort(arr);
        System.out.println(Arrays.toString(ans));
//        mergerSortInPlace(arr,0, arr.length);

    }

    static int[] mergeSort(int[] arr) {
        //base condition
        if (arr.length == 1) return arr;

        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] last) {
        int[] mix = new int[first.length + last.length];

        int i = 0, j = 0, k = 0;
        while (i < first.length && j < last.length) {
            if (first[i] < last[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = last[j];
                j++;
            }
            k++;
        }
        //it may be possible that one of the array might not be complete.
        //copy the remaining elements
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < last.length) {
            mix[k] = last[j];
            j++;
            k++;
        }
        return mix;
    }

    static void mergerSortInPlace(int[] arr, int s,int e){
        if (e-s==1) return;

        int mid=(s+e)/2;

        mergerSortInPlace(arr,s,mid);
        mergerSortInPlace(arr,mid,e);

        mergeInPlace(arr,s,mid,e);
    }
    private static void mergeInPlace(int[]arr,int s,int m,int e){
        int[] mix=new int[e-s];

        int i=s,j=m,k=0;
        while(i<m&&j<e){
            if (arr[i]<arr[j]) {
                mix[k]=arr[i];
                i++;
            } else {
                mix[k]=arr[j];
                j++;
            }
            k++;


        }
        while(i<m) {
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l]=mix[l];
        }
    }
}
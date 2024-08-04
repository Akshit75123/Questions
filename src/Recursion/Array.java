package Recursion;

import java.sql.SQLOutput;
import java.util.ArrayList;

//recursion 2 video -- arrays
public class Array {
    public static void main(String[] args) {
        //check whether array is sorted or not
//        int[] arr={7,2,3,4,5,6};
//        System.out.println(sorted(arr,0));

        //linear search
//        int[] arr = {3, 12, 8, 18};
//        int target = 8;
//
//        System.out.println(func(arr, target, 0));

        //linear Search for more than one value in the array
        int target = 5;
        int[] arr = {1,2,3,4,5,5,6};

        System.out.println(findAllIndexes2(target, arr, 0));

        //binary search in a mountain array
//        int[] arr = {5, 6, 7, 8, 9, 1, 2};
//        int key = 2;
//        System.out.println(search(arr,key,0,arr.length-1));
    }

    static boolean sorted(int[] arr, int index) {
        //base condition
        if (index == arr.length - 1) return true;

        //recursive calls
        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }

    public static int func(int[] arr, int target, int ind) {
        //base condition
        if (ind >= arr.length) return -1;
        else if (target == arr[ind]) return ind;


        //recursive calls
        return func(arr, target, ind + 1);
    }

    static ArrayList<Integer> findAllIndexes(int target, int[] arr, int ind, ArrayList<Integer> index) {
        //base condition
        if (ind == arr.length) {
            if (index.size() == 0) {
                index.add(-1);
                return index;
            }
            return index;
        } else if (arr[ind] == target) index.add(ind + 1);

        //recursive calls
        return findAllIndexes(target, arr, ind + 1, index);
    }

    static ArrayList<Integer> findAllIndexes2(int target, int[] arr, int ind) {
        //base condition
        ArrayList<Integer> index = new ArrayList<>();
        if (ind == arr.length-1) {
            return index;

        }
        if (arr[ind] == target) index.add(ind);

        //recursive calls
        ArrayList<Integer> ansFromBelowCalls = findAllIndexes2(target, arr, ind + 1);
        index.addAll(ansFromBelowCalls);
        return index;
    }

    //binary search in an unsorted array
    static int search(int[] arr, int key, int s, int e) {
        if (arr[s]>arr[e]) return -1;
        int m=s+(e-s)/2;
        if (arr[m]==key) return m;

        if (arr[s]<=arr[m]) {
            if (key<=arr[m]&&key>=arr[s]) return search(arr,key,s,m-1);
            else return search(arr,key,s+1,e);
        }
        if (key>=arr[m]&&key<=arr[e]) {
            return search(arr,key,m+1,e);
        }
        return search(arr,key,s,m-1);
    }
}

package Recursion;
//BS using recursion
public class BS {
    public static void main(String[] args) {
        int [] arr={2,4,5,6,7,15,36,39,78};
        int target=36;
        System.out.println(search(arr,target,0,9));
    }

    public static int search(int[] arr, int target, int s, int e) {
        if (s > e) return -1;
        int m = s + (e - s) / 2;
        if (arr[m]==target) return m;
        if (target<arr[m]) return search(arr,target,s,m-1);
        else return search(arr,target,m+1,e);

    }
}
package BinarySearch;

public class OrderAgnosticBS {

    static int orderAgnosticBS(int[] arr, int target){
        int start=0;
        int end= arr.length-1;

//        find whether the array is sorted in ascending or descending order
        boolean isAsc = arr[start] < arr[end];


        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target == arr[middle]){return middle;}

            if (isAsc==true){
                if (target < arr[middle]) {end = middle - 1;}
                else {start = middle + 1;}
            } else {
                if (target < arr[middle]) {start = middle + 1;}
                else {end = middle - 1;}
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={18,14,12,10,3,2,1};
        int target=2;
        int ans=orderAgnosticBS(arr, target);
        System.out.println(ans);
    }
}

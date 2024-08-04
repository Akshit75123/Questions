package LeetCodeProbs.BinarySearchProbs;

// Ceiling of a number means the smallest element greater or equal to the target element.
public class Ceiling {
    public static int ceiling(int[] arr, int target) {
        //but what if the target is the greater number in the array.
        if(target > arr[arr.length-1]){return -1;}
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // Find the middle element
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid];
            }
        }
        return arr[start]; //main difference from binary search
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,5,9,14,16,18};
        int target = 15;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }
}

package BinarySearch;

public class BinarySearch {
    // Return the index
    // Return -1 if it does not exist
    public static int binarySearch(int[] arr, int target) {
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
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int target = 12;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
}

//binary search if we do not the size of the array...

package LeetCodeProbs.BinarySearchProbs;

public class InfinteArrayBS {

    static int ans(int[] arr, int target){
        // first find the range
        // first start the size of box 2
        int start=0;
        int end=1;

        //condition for the target to lie in the range
        while(target>arr[end]){
            int newStart=end+1;
            //double the box value
            //end=previous end+sizeofbox*2
            end=end+(end-start+1)*2;
            start=newStart;
        }
        return binarySearch(arr, target, start, end);


    }
    public static int binarySearch(int[] arr, int target, int start, int end) {


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
        int[] arr={10,23,24,34,45,67,89,90,1009,1555};
        int target=24;
        System.out.println(ans(arr, target));
    }

}

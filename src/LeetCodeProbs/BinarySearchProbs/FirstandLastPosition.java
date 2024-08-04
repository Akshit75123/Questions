//Facebook Interview

package LeetCodeProbs.BinarySearchProbs;

public class FirstandLastPosition {
    public static int[] searchRange(int[] nums, int target) {

        int[] ans={-1, -1};

        //check for the first occurence of the target first
        ans[0]=search(nums, target, true);
        if (ans[0]!=-1){ans[1]=search(nums, target, false);}


        return ans;
    }

    public static int search(int[] arr, int target, boolean findStartIndex){

        int ans=-1;
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
                //potential answer is found
                ans=mid;
                if (findStartIndex){end=mid-1;}
                else {start=mid+1;}
            }
        }
        return ans;
    }

}

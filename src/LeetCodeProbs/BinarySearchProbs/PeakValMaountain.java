//852 and 162. Peak Value in Mountain Array
// array = {2,3,4,5,7,4,3,1}
//             7
//
//        5
//      4           4
//    3               3
//  2                    
//1                       1


package LeetCodeProbs.BinarySearchProbs;

public class PeakValMaountain {
    public int peakIndexInMountainArray(int[] arr) {

        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;
            if (arr[mid]>arr[mid+1]){
                // you are in decreasing part of the array
                // this may be the peak value but look at the left
                // this is why end!=mid-1
                end=mid;
            } else {
                // you are in the increasing part of the array.
                start=mid+1;
                // because we know that mid+1 element>mid element
            }


        }
        //in the end, start=end will point the largest number.
        return end;
}
    public static void main(String[] args) {

    }
}

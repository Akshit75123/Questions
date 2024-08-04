import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

public class GFG {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int[] brr={5,4,3,2,1};
        System.out.println(Sol.maxTip(5,3,3,arr,brr));
    }
}

class Sol {
    public static long maxTip(int n, int x, int y, int[] arr, int[] brr) {
        // code here
        int[] diff1=new int[n];
        int[] diff2=new int[n];
        int i;
        for (i=0;i<n;i++) {
            diff1[i]=arr[i]-brr[i];
            diff2[i]=brr[i]-arr[i];
        }

        Arrays.sort(diff1);
        Arrays.sort(diff2);

        int ans=0;
        for (i=x-1;i>=0;i--) {
            ans+=diff1[(n-1)-i];
        }
        for (i=y-1;i>=0;i--) {
            ans+=diff2[(n-1)-i];
        }
        return ans;

    }
}




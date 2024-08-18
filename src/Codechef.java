import java.util.*;
import java.lang.*;
class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int[] arr = {1,1,1,1,1,1,1};

         int v = 0, mx = 0;
        for (int i = 0; i < 7; i++) {
            if (arr[i] == 1) v ++;
            mx = Math.max(mx,arr[i]);
        }
        System.out.println(mx);

    }
}


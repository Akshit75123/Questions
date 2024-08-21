import java.awt.*;
import java.util.*;

public class CodeForces {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            int min = 1000, max = 0;
            for (int i : arr) {
                min = Math.min(min, i);
                max = Math.max(max, i);
            }
            System.out.println(max - min);
        }
    }
}



import java.awt.*;
import java.util.*;

public class CodeForces {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        while (test-- > 0) {
            long a = sc.nextInt();
            long b = sc.nextInt();
            int n = sc.nextInt();

            long[] arr = new long[(int) n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextLong();


            long s = 0;
            for (long i:arr) {
                if (i > a) {
                    s += a - 1;
                }
                else {
                    b += i;
                }
            }
            if (s == 0) b = (b - 1) +  s+1;
            else b = (b - 1) + s+1;

            System.out.println(b);

        }
    }
}

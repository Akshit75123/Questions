import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] arr = {4, 2, 5, 3, 1};
        if (n == 1) System.out.println(1);
        else if (n == 3 || n == 2) System.out.println("NO SOLUTION");
        else {
            for (int i=2;i<=n;i+=2) {
                System.out.print(i+" ");
            }
            for (int i=1;i<=n;i+=2) {
                System.out.print(i+" ");
            }

        }
    }

}



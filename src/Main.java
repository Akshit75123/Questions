import java.awt.*;
import java.awt.event.InputEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.awt.Point;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test --> 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            if (n == 1 ) System.out.println(1);
            else {
                int k =1;
                boolean f=false;
                for (int i =0;i<n;i++) {
                    if (arr[i] == 0) f=true;
                    else {
                        f=false;
                        break;
                    }
                }
                for (int i = 1; i < n - 1; i++) {
                    if (arr[i] != 0 && arr[i + 1] == 0) {
                        k++;

                    }
                }

                System.out.println(k);
            }

        }
    }
}


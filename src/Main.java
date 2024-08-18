import java.awt.*;
import java.awt.event.InputEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.awt.Point;

public class Main {

    public static int maxOfFour(int a, int b, int c,int d){
        int m1 = Math.max(a,b);
        int m2 = Math.max(m1,c);
        return Math.max(m2,d);
    }
    public static void main(String args[] ) throws Exception {
        Scanner sc= new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-->0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[][] mat = new int[n][m];

            for (int i = 0; i < n ; i++) {
                for (int j = 0; j < m ; j++) {
                    mat[i][j] = sc.nextInt();
                }
            }

            int[][] ans = new int[n + 2][m + 2];
            int p = 0;
            for (int i = 1; i < n + 1;i ++){
                int q = 0;
                for (int j = 1; j < m + 1; j++) {
                    ans[i][j] = mat[p][q];
                    q++;
                }
                p++;
            }

            for (int i = 1; i < n + 1;i ++){
                for (int j = 1; j < m + 1; j++) {
                    if (ans[i][j] > maxOfFour(ans[i - 1][j],ans[i][j - 1],ans[i + 1][j],ans[i][j + 1])) {
                        ans[i][j] = maxOfFour(ans[i - 1][j],ans[i][j - 1],ans[i + 1][j],ans[i][j + 1]);
                    }
                }

            }

            int b = 1;
            for (int i = 0; i < n; i++) {
                int c = 1;
                for (int j = 0; j < m; j++) {
                    mat[i][j] = ans[b][c];
                    c ++;
                }
                b ++;
            }
            for (int i = 0; i < n ; i++) {
                for (int j = 0; j < m ; j++) {
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println();
            }

        }

    }
}

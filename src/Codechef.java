import java.util.*;
import java.lang.*;
class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test --> 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int a1 = 0, b1 =0;
            boolean flag = false;
            int t =0, d=0 ;

            for (int i = 0; i < n; i++) {

                if(s.charAt(i) == 'R') a1++;
                else if(s.charAt(i) == 'L') a1--;
                else if(s.charAt(i) == 'D') b1--;
                else if(s.charAt(i) == 'U') b1++;

               t = (i+1) - (Math.abs((x-a1)) +Math.abs((y-b1)));
               if (t >= 0 && t%2==0) flag = true;
            }
            if (flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}


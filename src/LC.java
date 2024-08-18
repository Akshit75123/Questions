import java.util.*;

public class LC {
    public static void main(String[] args) {
        Sol sol=new Sol();

//        System.out.println(sol.isSubsequence("","abcdef"));
//        System.out.println(sol.compress(cha));
    }
}
class Solu {
    public int[] plusOne(int[] digits) {



        StringBuilder s = new StringBuilder();

        int flag = 0;
        int si = digits.length;

        for (int i = 0; i < si; i++) {

            if (digits[i] != 0) {
                flag = i;
                break;
            }
        }

        for (int i = flag; i < si; i++) {
            s.append(digits[i]);
        }

        long n = Long.parseLong(s.toString());
        n++;

        ArrayList<Integer> l = new ArrayList<>();


        while(n > 0) {
            int rem = (int) n % 10;
            l.add(rem);
            n /= 10;

        }
        Collections.reverse(l);

        int[] arr = new int[l.size()];

        for (int i = 0; i < l.size(); i++) {

            arr[i] = l.get(i);
        }

        return arr;

    }
}
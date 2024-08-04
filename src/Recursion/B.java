package Recursion;

public class B {
    public static void main(String[] args) {
//        int ans=fibbo(7);
//        System.out.println(ans);

    }

    static int fibbo(int n) {
        if (n==1) return 1;
        else if (n==0) return 0;
        return fibbo(n - 1) + fibbo(n - 2);
    }



}
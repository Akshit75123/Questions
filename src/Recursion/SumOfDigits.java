package Recursion;
//recursion video - 1 (basic questions)

public class SumOfDigits {

    static int countZeroes(int n, int count) {
        //base condition
        if (n==0) return count;

        //recursive calls
        if (n % 10 == 0) return countZeroes(n / 10, count + 1);
        return countZeroes(n / 10, count);

    }

    static int rev = 0;

    public static int reverse(int n, int len) {
        //base condition
        if (n == 0) return rev + n;
        //recursive calls
        rev = rev + (n % 10) * (int) Math.pow(10, len - 1);
        return reverse(n / 10, len - 1);
    }

    public static long prodOfDigits(long n, long prod) {
        //base condition
        if (n == 0) return prod * n;

        //recursive calls
        prod *= n % 10;
        return prodOfDigits(n / 10, prod);
    }

    public static long sumOfDigits(long n, long sum) {
        //base condition
        if (n == 0) return sum + n;

        //recursive call
        sum += n % 10;
        return sumOfDigits(n / 10, sum);
    }

    public static void main(String[] args) {
//        long n = 564;
//        long sum=0;
//        long prod =1;
//        System.out.println(sumOfDigits(n,0));
//        System.out.println(prodOfDigits(n, prod));
        //reverse a number
        int n = 1824;
        int len = (String.valueOf(n)).length();
        System.out.println(reverse(n, len));

        //counting the no. of zeroes in a number
//        int n = 2022010201;
//        int countOfZero = 0;
//        System.out.println(countZeroes(n, countOfZero));

    }
}

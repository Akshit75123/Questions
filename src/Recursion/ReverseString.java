package Recursion;

// reverse string by recursion by me on 4 July 2024
public class ReverseString {
    public static void main(String[] args) {
        String str = "abcdgsagigsigfo";
        int l = str.length();
        System.out.println(reverse(str,l));

    }

    static String s = "";

    static String reverse(String str, int l) {
        if (l == 0) return s;

        //recursive calls
        s += str.charAt(l - 1);
        return reverse(str, l - 1);
    }
}

package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        String str = "bacaaeattreefad";

//        System.out.println(removeA(str,0,""));
//        skip("", "baccdah");
//        System.out.println(skip("baccacdsah"));
//        System.out.println(skipApple("badapplekl"));
//        System.out.println(skipAppNotApple("badapplekapp"));
//        subseq("","abc");
//        System.out.println(subSeq("","abc"));
//        subSeqAscii("","ab");
//        System.out.println(subSeqAsciiList("","ab"));
        int[] arr = {1, 2, 3};
        List<List<Integer>> ans = subset(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }


    static String removeA(String str, int ind, String s) {
        //base condition
        if (ind == str.length()) return s;


        if (str.charAt(ind) != 'a') s += str.charAt(ind);
        return removeA(str, ind + 1, s);
    }

    //kunal's function
    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if (ch == 'a') skip(p, up.substring(1));
        else skip(p + ch, up.substring(1));
    }

    //another approach of kunal
    static String skip(String up) {
        if (up.isEmpty()) return "";

        char ch = up.charAt(0);
        if (ch == 'a') return skip(up.substring(1));
        else return ch + skip(up.substring(1));
    }

    //skipping "apple" from the up string
    static String skipApple(String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("apple")) return skipApple(up.substring(5));
        else return up.charAt(0) + skipApple(up.substring(1));
    }

    //skipping "app" but not "apple";
    static String skipAppNotApple(String up) {
        if (up.isEmpty()) return "";

        if (up.startsWith("app") && !up.startsWith("apple")) return skipAppNotApple(up.substring(3));
        else return up.charAt(0) + skipAppNotApple(up.substring(1));
    }

    //subsets of the string "abc"
    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);

        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }
    //adding these subsets/subsequence into the arraylist -- passing the list into the arguments list

    //adding these subsets into an arraylist -- without passing the list into the arguments
    static ArrayList<String> subSeq(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        char ch = up.charAt(0);

        ArrayList<String> left = subSeq(p + ch, up.substring(1));
        ArrayList<String> right = subSeq(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    //subsets of strings + ascii value of the characters
    static void subSeqAscii(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);

        subSeqAscii(p + ch, up.substring(1));
        subSeqAscii(p, up.substring(1));
        subSeqAscii(p + (ch + 0), up.substring(1));
    }

    //now printing the arrayList
    static ArrayList<String> subSeqAsciiList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        char ch = up.charAt(0);

        ArrayList<String> first = subSeqAsciiList(p + ch, up.substring(1));
        ArrayList<String> second = subSeqAsciiList(p, up.substring(1));
        ArrayList<String> third = subSeqAsciiList(p + (ch + 0), up.substring(1));

        first.addAll(second);
        third.addAll(first);
        return third;
    }

    //subsets of [1,2,3] using iteration *** important

    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    //    subset of duplicate elements arrays
//     when you find a duplicate elements, only add it to the newly created subset of previous step.
//    because of above point, duplicates have to be together
//    sort the array
    static List<List<Integer>> subsetDuplictaes(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        int start=0;
        int end=0;
        for (int i=0;i<arr.length;i++) {
            int n = outer.size();

        }
        return outer;
    }
}


package LeetcodeProblems;
//1768. Merge Strings Alternately
public class Alter {
    //best solution
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
            i++;
        }
        return result.toString();
    }

    //my solution

    //    public static String mergeAlternately(String word1, String word2) {
    //        String ans="";
    //        int minSize=Math.min(word1.length(),word2.length());
    //        int j=0,k=0,o=0;
    //        for (int i=0;i<minSize;i++){
    //            ans+=word1.charAt(j);
    //            ans+=word2.charAt(k);
    //            j++;
    //            k++;
    //        }
    ////        System.out.println(j);
    ////        System.out.println(k);
    //
    //        if (j-1<word1.length()-1){
    //            ans+=word1.substring(j);
    //        }
    //        if (k-1<word2.length()-1){
    //
    //            ans+=word2.substring(k);
    //        }
    ////        System.out.println(s);
    //        return ans;
    //    }


}

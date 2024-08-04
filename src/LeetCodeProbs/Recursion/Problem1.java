package LeetCodeProbs.Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Problem1{
    public static void main(String[] args){
        Solution s=new Solution();
        System.out.println(s.oddEven("abbbcc"));
    }
}
class Solution {
    public static String oddEven(String str) {
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i=0;i<str.length();i++) {
            if (map.containsKey(str.charAt(i))) map.put(str.charAt(i),map.get(str.charAt(i))+1);
            else map.put(str.charAt(i),1);
        }
        ArrayList<Integer> ind=new ArrayList<>();
        for (Map.Entry<Character,Integer> set:map.entrySet()){
            ind.add(str.indexOf(set.getKey())+1);
        }
//        System.out.println(map);
//        System.out.println(ind);
        int k=0;
        int count=0;
        for (Map.Entry<Character,Integer> set:map.entrySet()){
            if (set.getValue()%2==0 && ind.get(k)%2==0) count++;
            else if (set.getValue()%2!=0 && ind.get(k)%2!=0) count++;
            k++;
        }

        if (count%2==0) return "EVEN";
        return "ODD";
    }
}

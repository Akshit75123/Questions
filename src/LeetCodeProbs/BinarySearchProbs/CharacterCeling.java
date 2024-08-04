import java.lang.String;

//package LeetCodeProbs.BinarySearchProbs;

public class CharacterCeling {
    public static char charCeiling(char[] str, char target){
        // using binary search algorithm
        int start=0;
        int end=str.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if (target<str[mid]){end=mid-1;}
            else if (target>str[mid]){start=mid+1;}

        }
        return (str[start%str.length]);
    }
    public static void main(String[] args) {
        char[] chr={'c','f','j'}; //in java '' --> char and "" --> String
        char target='j';
        char ans=charCeiling(chr, target);
        System.out.println(ans);
    }
}

import java.util.*;

public class CD {

    public static void main(String[] args) {
        int[] arr=new int[]{2,4,2,6,4,2,5,5};
        boolean []visited=new boolean[arr.length];

        Arrays.fill(visited,false);
        int n=arr.length;
        for (int i=0;i<n;i++){

            if(visited[i] == false)
                continue;
            int count=1;

            for (int j=i+1;j<n;j++){

                visited[j]=true;
                count++;
            }
            if(visited[i]){
                System.out.println(i+" occurs "+count+" times");

            }
        }
    }
}
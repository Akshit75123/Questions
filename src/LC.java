public class LC {
    public static void main(String[] args) {
        Solu sol=new Solu();
        int[] arr={1,0,0,0,1};
        System.out.println(Solu.canPlaceFlowers(arr,2));
    }
}
class Solu {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        for (int i=1;i< flowerbed.length-1;i++){
            if (flowerbed[i-1]==0 && flowerbed[i]==0 && flowerbed[i+1]==0) count++;
        }
        System.out.println(count); 
        if (count>=n) return true;
        else return false;
    }
}
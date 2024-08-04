package PatternQ;

public class P1 {
    public static void main(String[] args) {
        pattern4(5);
    }
    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            //for every row, run the cols
            for (int cols = 1; cols <= row; cols++) {
                System.out.print("* ");
            }
            // add a new line
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            //for every row, run the cols
            for (int cols = 5; cols >= row; cols--) {
                System.out.print("* ");
            }
            // add a new line
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int row = 1; row <= n; row++) {
            //for every row, run the cols
            for (int cols = 1; cols <= row; cols++) {
                System.out.print(cols+" ");
            }
            // add a new line
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int row = 0; row < 2*n; row++) {
            if(row<n){
                for (int cols = 0; cols <= row; cols++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else {
                for (int cols = 4; cols >= n-row+1; cols--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}

public class Pattern {
    //hollow rectangle
    static void P1(int n, int m){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i==1 || i==n || j==0 || j==m)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    // right angled traingle
    static void P2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //hollow right angled traingle
    static void P3(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i==1||i==n||j==1||j==i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    //inverted right angled triangle
    static void P4(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //hollow inverted right angled triangle
    static void P5(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                if (i==1||i==n||j==1||j==n-i){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }

    //pyramind
    static void P6(int n){
        //for rows
        for (int i = 1; i <= n; i++) {
            //for spaces
            for (int j = n-i; j >= 1; j--) {
                System.out.print(" ");
            }
            //for printing stars
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // inverted pyramind
    static void P7(int n){
        //for rows
        for (int i = 1; i <= n; i++) {
            //for spaces
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            //for printing stars
            for (int j = n-i; j >=1 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        P7(6);

    }
}

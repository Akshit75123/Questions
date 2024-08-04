package Recursion;

public class Pattern {
    public static void main(String[] args) {
//        upperTrianglePattern(4,0);
//        trianglePattern(4, 0);
        int[] arr = {4,3,2,1};
        bubble(arr, arr.length-1, 0);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void upperTrianglePattern(int row, int col) {
        //base condition
        if (row == 0) return;
        //recursive calls

        if (col < row) {
            System.out.print("* ");
            upperTrianglePattern(row, col + 1);
        } else {
            System.out.println();
            upperTrianglePattern(row - 1, 0);
        }

    }

    static void trianglePattern(int row, int col) {
        //base condition
        if (row == 0) return;
        //recursive calls

        if (col < row) {

            trianglePattern(row, col + 1);
            System.out.print("* ");
        } else {

            trianglePattern(row - 1, 0);
            System.out.println();
        }

    }

    static void bubble(int[] arr, int row, int col) {
        //base condition
        if (row == 0) return;
        //recursive calls

        if (col < row) {
            if (arr[col] > arr[col + 1]) {
                int temp = arr[col];
                arr[col + 1] = arr[col];
                arr[col + 1] = temp;
            }
            bubble(arr, row, col + 1);
        } else {

            bubble(arr, row - 1, 0);
        }

    }

}
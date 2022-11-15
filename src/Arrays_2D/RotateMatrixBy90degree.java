package Arrays_2D;

import java.util.Scanner;

public class RotateMatrixBy90degree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        controller.transpose(arr, m, n);
        controller.rotateby90degree(arr, m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j<n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
//        System.out.println();
//        for (int i = 0; i < m; i++) {
//            for (int j = n-1; j >=0; j--) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }


    }
}
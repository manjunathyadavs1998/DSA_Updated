package Arrays.slidingWindow;

import Arrays.arrays;

import java.util.Scanner;

public class maxSumSubArrayOfK {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Maximum number of ones in Binary Array");
//        System.out.println(arrays.maxSumSubArrayOfK(arr, n, k));

    }
}



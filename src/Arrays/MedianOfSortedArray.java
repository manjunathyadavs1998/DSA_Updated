package Arrays;

import java.util.Scanner;

public class MedianOfSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr1 = new int[m];
        for (int i = 0; i < m; i++)
            arr1[i] = sc.nextInt();
        int n=sc.nextInt();
        int[] arr2=new int[n];
        for (int i = 0; i < n; i++)
            arr2[i] = sc.nextInt();
        System.out.println("Print Median of the Two Sorted Array");
        System.out.println(arrays.findMedianOfSortedArrays1(arr1, arr2));

    }
}

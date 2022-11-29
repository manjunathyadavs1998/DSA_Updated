package BinarySearch;

import Arrays.arrays;

import java.util.Scanner;

public class searchInSortedArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();


        System.out.println(BinarySearch_Impl.searchInSortedArray(arr, n, k));

        //Input: nums = [4,5,6,7,0,1,2], target = 0
        //Output: 4
        //[4,5,6,7,0,1,2], target = 3
        // nums = [1], target = 0
    }
}

package BinarySearch;

import java.util.Scanner;

public class SearchIndex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        System.out.println("Find the Index and return the value");
        System.out.println(BinarySearch_Impl.searchInsertPosition(arr, n, k));

    }


}

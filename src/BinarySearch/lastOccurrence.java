package BinarySearch;

import java.util.Scanner;

public class lastOccurrence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();

        System.out.println("Find the Last Occurrence of the Element");
        System.out.println(BinarySearch_Impl.findLastOccurrence(arr, n, k));
    }
}

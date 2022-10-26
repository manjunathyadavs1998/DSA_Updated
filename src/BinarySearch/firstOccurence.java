package BinarySearch;

import java.util.Scanner;

public class firstOccurence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();

        System.out.println("Find the First Occurrence of the Element");
        System.out.println(BinarySearch_Impl.findFirstOccurrence(arr, n, k));

    }


}

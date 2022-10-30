package Arrays;

import java.util.Scanner;

public class MaxDiff {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
       // int k = sc.nextInt();
        System.out.println("Program to find the Max difference such that j>i ");
        System.out.println(arrays.findMaxDiff(arr, n));

    }
}

package Hashing;

import Arrays.arrays;

import java.util.Scanner;

public class pairswithsumk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int sum=sc.nextInt();
        System.out.println("Check whether pairs exist in unsorted array with given sum");
        System.out.println(hashing.pairexistwithsumk(arr,n, sum));
    }
}

package BinarySearch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++)
            arr[i]=sc.nextInt();
        int k=sc.nextInt();

        System.out.println("Binary Search Program");
        System.out.println(BinarySearch_Impl.binarySearch(arr,n, k));

        System.out.println("Binary Search using Recursion");
        int low=0, high=n-1;
        System.out.println(BinarySearch_Impl.recursiveBinarySearch(arr, n, low, high, k));


    }
}

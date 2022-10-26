package Arrays;

import java.util.Scanner;

public class maxSubArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Print Maximum sum of the  subarray");
        System.out.println(arrays.maxSubArray(arr,n));


    }
    }

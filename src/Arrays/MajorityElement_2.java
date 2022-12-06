package Arrays;

import java.util.Scanner;

public class MajorityElement_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Program to Find the Majority Element Which is N/3 times ");
        System.out.println(arrays.majorityElement2(arr, n));
    }
}

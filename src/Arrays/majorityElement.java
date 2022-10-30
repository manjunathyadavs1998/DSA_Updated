package Arrays;

import java.util.Scanner;

public class majorityElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Program to Find the Majority Element ");
        System.out.println(arrays.majorityElement(arr, n));
    }
}

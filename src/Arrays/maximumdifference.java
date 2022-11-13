package Arrays;

import java.util.Scanner;

public class maximumdifference {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Program to find the Maximmum difference in array");
        System.out.println(arrays.maximumdistance(arr, n));
    }

}

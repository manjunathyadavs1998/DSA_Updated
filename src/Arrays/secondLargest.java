package Arrays;

import java.util.Scanner;

public class secondLargest {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("To find the Second Largest Element in the Array");
        System.out.println(arrays.secondLargest(arr, n));




    }
}

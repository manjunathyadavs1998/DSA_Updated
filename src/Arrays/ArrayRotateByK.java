package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotateByK {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int k=sc.nextInt();

        //Reversal Algorithm
        arrays.leftRotateArrayByK(arr,n, k);



        for(int i=0; i<n; i++)
            System.out.print(arr[i]+" ");

    }
}

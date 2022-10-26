package Arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++)
            arr[i]=sc.nextInt();

        System.out.println();
        System.out.println("Remove Duplicates in Sorted Array");
        System.out.println(arrays.removeDuplicates(arr, n));


        System.out.println();
        System.out.println("Move all Zeros to End");
        arrays.moveZerosToEnd(arr,n);

        for(int i=0; i<n; i++)
            System.out.print(arr[i]+" ");





    }
}
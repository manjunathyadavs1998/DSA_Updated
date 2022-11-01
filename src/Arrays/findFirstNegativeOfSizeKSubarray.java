package Arrays;

import java.util.List;
import java.util.Scanner;

public class findFirstNegativeOfSizeKSubarray {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        List<Integer>  integerList=arrays.findFirstNegativeOfSizeKSubarray(arr, n, k);


            for (Integer integer : integerList) {
                System.out.print(integer+" ");
            }



    }
}

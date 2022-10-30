package Arrays;

import java.util.Scanner;

public class trappingRainWater {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();


        System.out.println("Trapping the Rain Water");
        System.out.println(arrays.trappingRainWater(arr, n));
    }
}

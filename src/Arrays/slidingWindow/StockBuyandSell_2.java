package Arrays.slidingWindow;

import Arrays.arrays;

import java.util.Scanner;

public class StockBuyandSell_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Buy and sell Stock at only once for Max_profit");
        System.out.println(arrays.StockBuyandSell_2(arr, n));
    }

}

package Arrays;

import java.util.List;
import java.util.Scanner;

public class Leaders {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        //Problem to find leaders

        List<Integer> a=arrays.leaders(arr, n);

        for(Integer aa:a)
            System.out.print(aa+" ");




    }
}

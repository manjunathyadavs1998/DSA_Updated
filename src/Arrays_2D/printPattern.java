package Arrays_2D;

import java.util.Scanner;

public class printPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Print Star Pattern");
        controller.printPattern(n, arr);
        //ferrero rocher
    }
}

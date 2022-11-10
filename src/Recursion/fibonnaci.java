package Recursion;

import java.util.Scanner;

public class fibonnaci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nth Fibonnaci using Recursion ");
        int n= sc.nextInt();
        System.out.println(Recursion.fibonacci(n));
    }
}

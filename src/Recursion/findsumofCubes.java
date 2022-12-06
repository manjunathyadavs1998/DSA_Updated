package Recursion;

import java.util.Scanner;

public class findsumofCubes {

    public static void main(String[] args) {
        System.out.println("sumOfSeries using Recursion");
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long sum=0;
        System.out.println(Recursion.sumOfSeries(n));


    }
}

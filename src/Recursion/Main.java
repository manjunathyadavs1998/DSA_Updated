package Recursion;

public class Main {
    public static void main(String[] args) {
        System.out.println("Recursion Basics");
        System.out.println();

        System.out.println("Print Numbers from 1 to N using Recursion");
        Recursion.printnum(5);
        System.out.println();

        System.out.println("Print Numbers from N to 1 using Recursion");
        Recursion.printnumreverse(5);

        System.out.println("Tail Recursion");
        System.out.println();

        System.out.println("Sum of N numbers using Recursion");
        System.out.println(Recursion.sum(10));

        System.out.println("String Palindrome check using Recursion");
        System.out.println(Recursion.isPalindrome("MADAM", 0, 4));


        System.out.println("Sum of digits of a number using Recursion");
        System.out.println(Recursion.sumOfDigits(5000));

        System.out.println("Rope Cutting Problem using Recursion");
        System.out.println(Recursion.ropeCutting(23, 11, 9, 12));

        System.out.println("Generate all Subsets of String using Recursion");
        Recursion.subSets("ABCD", "", 0);

    }
}

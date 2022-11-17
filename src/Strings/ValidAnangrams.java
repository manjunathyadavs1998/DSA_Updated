package Strings;

import java.util.Scanner;

public class ValidAnangrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println("Program to check whether strings are valid Anargram or not");
        System.out.println(strings.isValidAnagram(str1, str2));
    }
}

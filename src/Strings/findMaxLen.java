package Strings;

import java.util.Scanner;

public class findMaxLen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //String str2 = sc.next();
        System.out.println("Program to Find Maximum length of Valid Parenthesis");
        System.out.println(strings.findMaxLen(str));
        System.out.println(strings.findMaxLen(str, str.length()));
    }
}

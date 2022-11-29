package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class findSubSequences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        findallSubsequences(str, "", 0);
    }
    public static void  findallSubsequences(String s, String res, int len)

    {

        if(s.length()==0)
        {

            System.out.println(res+" "+len);
            return;
        }
        findallSubsequences(s.substring(1), res+s.charAt(0), len+2);
        findallSubsequences(s.substring(1), res, len-1);




    }

}

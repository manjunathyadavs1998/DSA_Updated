package Basics_of_DSA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Print Pascals Triangle");
        printpascaltriangle(n);

    }

    public static void printpascaltriangle(int n)
    {

        List<List<Integer>>main_ls=new ArrayList<>();



        for(int i=0; i<n; i++)
        {   List<Integer>ls=new ArrayList<>();
            int d=(int)Math.pow((int)11, (int)i);
            while(d>0)
            {
                int rem=d%10;
                ls.add(rem);
                //System.out.print(rem+" ");
                d=d/10;
            }
            main_ls.add(ls);
            //System.out.println();
            //[[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1],[1,5,10,10,5,1]]
            //1771561
            //161051


        }
        System.out.println(main_ls);

        System.out.println((0+Integer.MAX_VALUE)+1);
        System.out.println(Integer.MAX_VALUE);

    }
}

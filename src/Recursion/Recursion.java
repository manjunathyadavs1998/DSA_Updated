package Recursion;

public class Recursion {

    public static  void printnum(int n)
    {
        if(n==0)
            return;
        printnum(n-1);
        System.out.print(n+" ");
    }
    public  static  void printnumreverse(int n)
    {
        if(n==0)
            return;
        System.out.print(n+" ");
        printnum(n-1);

    }
    public static  int sum(int n)
    {
        if(n==0)
            return 0;
        return n+sum(n-1);
    }

    public static boolean isPalindrome(String str, int i, int n)
    {


       if(i>=n)
           return true;
       return (str.charAt(i)==str.charAt(n)&&isPalindrome(str, i+1, n-1));
    }

    public  static int sumOfDigits(int n)
    {
        if(n<=0)
            return 0;
        return (n%10)+sumOfDigits(n/10);
    }

    public static  int ropeCutting(int n, int a, int b, int c)
    {
        if(n==0) return 0;
        if(n<0) return -1;
        int res=Math.max(ropeCutting(n-a, a, b,c),Math.max(ropeCutting(n-b, a,b, c), ropeCutting(n-c,a,b,c)));
        if(res==-1)
            return -1;
        return res+1;
    }

    public  static  void subSets(String str, String curr, int i)
    {   int n=str.length();
        if(i==n)
        {
            System.out.print(curr+" ");
            return;
        }
        subSets(str, curr+str.charAt(i), i+1);
        subSets(str, curr, i+1);




    }
}

package Strings;


import java.util.HashSet;
import java.util.Stack;

public class strings {

    public static boolean isValidAnagram(String str1, String str2)
    {
        char[] arr=new char[26];
        for(int i=0; i<str1.length(); i++)
        {
            arr[(int)(str1.charAt(i)-'a')]++;
        }
        for(int i=0; i<str2.length(); i++)
        {
            arr[(int)(str2.charAt(i)-'a')]--;
        }
        for(int k=0; k<arr.length; k++)
        {
            if(arr[k]!=0)
                return false;
        }
        return true;

    }

    public static  int findMaxLen(String str)
    {
        Stack<Character>st=new Stack<Character>();
        int n=str.length();
        int len=0;
        int max_length=0;
        for(int i=0; i<n; i++)
        {
            if(str.charAt(i)=='(')
                st.push(str.charAt(i));
            else
            {
                if(st.size()>0) {
                    len++;
                    max_length=Math.max(len, max_length);
                    st.pop();
                }
                else {

                    len = 0;
                }
            }
        }
//        System.out.println("Stack size was "+st.size());
//        System.out.println(max_length+" ");
        int k=st.size();
        while(k-->0) {
            max_length= max_length-1;
        }
        return max_length*2;

    }

    public static int findMaxLen(String s, int n)
    {


        int left = 0, right = 0;
        int maxlength = 0;


        for (int i = 0; i < n; i++) {


            if (s.charAt(i) == '(')
                left++;
            else
                right++;


            if (left == right)
                maxlength = Math.max(maxlength,
                        2 * right);


            else if (right > left)
                left = right = 0;
        }

        left = right = 0;


        for (int i = n - 1; i >= 0; i--) {


            if (s.charAt(i) == '(')
                left++;
            else
                right++;


            if (left == right)
                maxlength = Math.max(maxlength,
                        2 * left);


            else if (left > right)
                left = right = 0;
        }
        return maxlength;
    }

    public static  String sortString(String str)
    {
        char[] arr=new char[26];
        String temp="";
        for(int i=0; i<str.length(); i++)
        {
            arr[(int)(str.charAt(i)-'a')]++;
        }
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>0)
            {
                int k=arr[i];
                while(k-->0)
                {
                    temp+=(char)(i+'a');
                }
            }
        }
        return temp;
    }

    public static int longestSubstring(String str)
    {
        HashSet<Character>hashSet=new HashSet<>();
        int count=0, max_count=0;
        for(int i=0; i<str.length(); i++)
        {
            if(hashSet.contains(str.charAt(i)))
            {
                hashSet.clear();
                count=0;
                hashSet.add(str.charAt(i));
                count++;
            }
            else
            {
                hashSet.add(str.charAt(i));
                count++;
                max_count=Math.max(max_count, count);
            }
        }
        return max_count;
    }


}

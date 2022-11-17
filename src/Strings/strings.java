package Strings;

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
    //https://practice.geeksforgeeks.org/problems/valid-substring0624/1

}

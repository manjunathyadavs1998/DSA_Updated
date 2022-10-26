package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arrays {


    public static int removeDuplicates(int[] arr, int n)
    {   if(n==0)
            return 0;

        int size=1;
        for(int i=1; i<n; i++)
        {
            if(arr[i]!=arr[i-1])
                size=size+1;
        }
        return size;

    }
    public static void moveZerosToEnd(int[] arr, int n)
    {
        if(n==0||n==1)
            return;
        int count=0;
        for(int i=0; i<n; i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }
        }
    }

    public static  void leftRotateArrayByK(int[] arr, int n, int k)
    {
       reverse(arr,0, k-1);
       reverse(arr,k, n-1);
       reverse(arr, 0, n-1);

    }
    public static  void reverse(int[] arr, int low, int high)
    {
        while(low<high)
        {
            int temp=arr[high];
            arr[high]=arr[low];
            arr[low]=temp;
            low++;
            high--;
        }
    }
     public static List<Integer> leaders(int[] arr, int n)
     {
        List<Integer>a=new ArrayList<>();
        a.add(arr[n-1]);
        int curr=arr[n-1];
        for(int i=n-2; i>=0; i--)
        {
            if(arr[i]>curr)
            {
                a.add(arr[i]);
                curr=arr[i];
            }
        }
         Collections.reverse(a);
        return a;
     }

     public static  int Max1sinArray(int[] arr, int n)
     {
         int count=0;
         int maxi=Integer.MIN_VALUE;
         for(int i=0; i<n; i++)
         {
             if(arr[i]==1)
                 count++;
             maxi=Math.max(count, maxi);
             if(arr[i]==0)
                 count=0;
         }
         return maxi;
     }

    public static  int maxSubArray(int[] arr, int n)
    {
//        int maxEnd=arr[0];
//        int res=arr[0];
//        for(int i=1; i<n; i++)
//        {
//            maxEnd=Math.max(maxEnd+arr[i-1], maxEnd);
//            res=Math.max(res, maxEnd);
//        }
//        return res;


        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i = 0; i < arr.length; i++) {

            currSum = currSum + arr[i];

            maxSum = Math.max(currSum, maxSum);

            if(currSum < 0) {

                currSum = 0;
            }
        }

        return maxSum;
    }

    public static int maxProduct(int[] nums, int n) {

        int max = nums[0], min = nums[0], ans = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int temp = max;  // store the max because before updating min your max will already be updated

            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
            min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]);

            if (max > ans) {
                ans = max;
            }
        }

        return ans;

    }
}

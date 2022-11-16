package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class arrays {


    public static int removeDuplicates(int[] arr, int n) {
        if (n == 0)
            return 0;

        int size = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1])
                size = size + 1;
        }
        return size;

    }

    public static void moveZerosToEnd(int[] arr, int n) {
        if (n == 0 || n == 1)
            return;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }

    public static void leftRotateArrayByK(int[] arr, int n, int k) {
        k = k % n;
        if (k < 0) {
            k += n;
        }
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);

    }

    public static void rightRotateArrayByK(int[] arr, int n, int k) {
        k = k % n;
        if (k < 0) {
            k += n;
        }
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - k - 1);
        reverse(arr, 0, n - 1);

    }


    public static void reverse(int[] arr, int low, int high) {
        while (low < high) {
            int temp = arr[high];
            arr[high] = arr[low];
            arr[low] = temp;
            low++;
            high--;
        }
    }

    public static List<Integer> leaders(int[] arr, int n) {
        List<Integer> a = new ArrayList<>();
        a.add(arr[n - 1]);
        int curr = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > curr) {
                a.add(arr[i]);
                curr = arr[i];
            }
        }
        Collections.reverse(a);
        return a;
    }

    public static int Max1sinArray(int[] arr, int n) {
        int count = 0;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1)
                count++;
            maxi = Math.max(count, maxi);
            if (arr[i] == 0)
                count = 0;
        }
        return maxi;
    }

    public static int maxSubArray(int[] arr, int n) {
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

        for (int i = 0; i < arr.length; i++) {

            currSum = currSum + arr[i];

            maxSum = Math.max(currSum, maxSum);

            if (currSum < 0) {

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


    public static int secondLargest(int[] arr, int n) {
        int first = 0, second = 0;
        if (arr[0] > arr[1]) {
            first = arr[0];
            second = arr[1];
        } else {
            first = arr[1];
            second = arr[0];
        }
        for (int i = 2; i < n; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                second = arr[i];
            }
        }
        return second;

        //return 0;
    }


    public static int thirdLargest(int[] arr, int n) {
        int first = 0, second = 0, third = 0;
        if (arr[0] > arr[1]) {
            first = arr[0];
            second = arr[1];
        } else {
            first = arr[1];
            second = arr[0];
        }
        if (arr[2] > first) {
            third = second;
            second = first;
            first = arr[2];
        } else if (arr[2] > second) {
            third = second;
            second = arr[2];
        }

        for (int i = 3; i < n; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third)
                third = arr[i];
        }
        return third;

    }


    public static int findMaxDiff(int[] arr, int n) {
        int min=arr[0];
        int max_diff= Integer.MIN_VALUE;

        for(int i=1; i<n; i++)
        {

            max_diff=Math.max(arr[i]-min, max_diff);
            if(arr[i]<min)
                min=arr[i];

        }
    if(max_diff<=0)
        return -1;
    return max_diff;
    }

    public static int maxStockPrice(int[] arr, int n)
    {
        int max_profit=0;
        for(int i=1; i<n; i++)
        {
            if(arr[i]>arr[i-1])
            {
                max_profit=max_profit+arr[i]-arr[i-1];
            }
        }
        return  max_profit;
    }

    public static  int trappingRainWater(int[] arr, int n)
    {
        int left_max=arr[0];
        int right_max=arr[n-1];
        int i=0, j=n-1;
        int res=0;
        while(i<j)
        {
            left_max=Math.max(left_max, arr[i]);
            right_max=Math.max(right_max, arr[j]);
            if(left_max>right_max)
            {
                res+=right_max-arr[j];
                j--;
            }
            else
            {
                res+=left_max-arr[i];
                i++;
            }
        }
        return  res;
    }


    public static  int countMaxOnes(int[] arr, int n)
    {
       int res= Integer.MIN_VALUE;
       int count=0;
       for(int i=0; i<n; i++)
       {
           if(arr[i]==0)
               count=0;
           else
           {
               count++;
               res=Math.max(res, count);
           }
       }

        return res;
    }


    public static int majorityElement(int[] arr, int n)
    {
        if(n==1)
            return arr[0];
        HashMap<Integer, Integer>hm=new HashMap<>();
        for(int x:arr)
        {
            if(!hm.containsKey(x))
                hm.put(x,1);
            else{
                hm.put(x, hm.get(x)+1);
                if(hm.get(x)>n/2)
                    return x;
            }
        }
        return -1;
    }

    public static int maximumdistance(int[] arr, int n)
    {
        HashMap<Integer, Integer>hm=new HashMap<>();
        int res=0;
        for(int i=0; i<n; i++)
        {
            if(!hm.containsKey(arr[i]))
                hm.put(arr[i], i);
            else
            {
                int curr=i-hm.get(arr[i])+1;
                res=Math.max(curr, res);
            }

        }
        return res;
    }

    public static  int StockBuyandSell_2(int[] arr, int n)
    {
       if(n<=1)
           return 0;
        int max_profit=0;
        int buy=arr[0];
        for(int i=1; i<n; i++)
        {
            if(buy>arr[i])
            {
                buy=arr[i];
            }
            else
            {
                int curr_price=arr[i]-buy;
                max_profit=Math.max(curr_price, max_profit);
            }

        }
        return max_profit;

    }

    public  static  int findsqrt(int n)
    {
        int low=0;
        int high=10;
        //int high=Integer.MAX_VALUE;
        while(low<high)
        {
            int mid=(low+high)/2;
            if(mid*mid==n)
                return mid;
            else if (mid*mid>n) {
                high=mid-1;

            }
            else
                low=low+1;
        }
        return 0;
    }




}


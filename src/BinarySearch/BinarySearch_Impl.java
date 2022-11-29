package BinarySearch;

public class BinarySearch_Impl {

    public static  int binarySearch(int[] arr, int n, int k)
    {
        int low=0, high=n-1;
        while(low<high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==k)
                return mid;
            else if(arr[mid]>k)
                high=mid-1;
            else if(arr[mid]<k)
                low=mid+1;
        }


        return  -1;

    }

    public static  int recursiveBinarySearch(int[] arr, int n, int low, int high, int k)
    {
        if(low>=high)
            return -1;
        int mid=(low+high)/2;
        if(arr[mid]==k)
            return mid;
        else if(arr[mid]>k)
            recursiveBinarySearch(arr, n, low, mid-1, k);
        else
            recursiveBinarySearch(arr, n, mid+1, high, k );
        return -1;
    }

    public static  int findFirstOccurrence(int[] arr, int n, int k)
    {
        int low=0, high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>k)
                high=mid-1;
            else if(arr[mid]<k)
                low=mid+1;
            else
            {
                if(arr[mid]==0||arr[mid-1]!=arr[mid])
                    return mid;
                else
                    high=mid-1;
            }



        }
        return -1;
    }

    public static  int findLastOccurrence(int[] arr, int n, int k)
    {
        int low=0, high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>k)
                high=mid-1;
            else if(arr[mid]<k)
                low=mid+1;
            else
            {
                if(mid!=n-1||arr[mid]!=arr[mid+1])
                    return mid;
                else
                    low=mid+1;
            }



        }
        return -1;


    }

    public static int searchInSortedArray(int[] arr, int n, int k)
    {
        int low =0, high=n-1;
        while(low<high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==k)
                return mid;
            else if(arr[mid]>k)
            {
                if(arr[mid+1]==k)
                    return mid+1;
                else if(arr[mid+1]<k)
                    low=mid+1;
                else
                    high=mid-1;

            }
            else if(arr[mid]<k) {
                if (mid == 0) {
                    if (arr[mid] == k)
                        return mid;
                    else
                        return -1;

                } else {
                    if (arr[mid - 1] == k)
                        return mid - 1;
                    else if (arr[mid - 1] > k)
                        high = mid - 1;
                    else
                        low = mid + 1;
                }
            }
        }
        return -1;
    }

    public static int searchInsertPosition(int[] arr, int n, int k)
    {
        int low=0;
        int high=n-1;
        while(low<high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==k)
                return mid;
            else if(arr[mid]>k)
            {
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return low+1;
    }
}

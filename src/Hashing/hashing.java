package Hashing;

import java.util.HashSet;

public class hashing {
    public static boolean pairexistwithsumk(int[] arr, int n, int sum)
    {
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0; i<n; i++)
        {
            if(hs.contains(sum-arr[i]))
                return true;
                hs.add(arr[i]);
        }
        return false;
    }
}

package Trees;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class KthLargestElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        //int k=sc.nextInt();
//        TreeSet<Integer>ts =new TreeSet<>();
//        for(Integer ii:arr)
//            ts.add(ii);
//        int m=ts.size();
//        for(Integer t:ts)
//        {
//            if(m==k)
//            {
//                System.out.println(t);
//                break;
//            }
//            m--;
//            //3,2,3,1,2,4,5,5,6
//            //4
//        }

        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for (Integer aa:arr)
            pq.add(aa);
        for(Integer pqq:pq)
            System.out.print(pqq+" ");

    }
}

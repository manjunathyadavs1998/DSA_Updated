package Arrays_2D;

public class controller {
    public static  void transpose(int[][] arr, int m, int n)
    {
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i<j)
                {
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;

                }
            }

        }
    }
    public static  void rotateby90degree(int[][] arr, int m, int n)
    {
        for(int i=0; i<m; i++)
        {
            int j=0, k=n-1;
            while(j<k)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[i][k];
                arr[i][k]=temp;
                j++;
                k--;
            }


        }

    }




}

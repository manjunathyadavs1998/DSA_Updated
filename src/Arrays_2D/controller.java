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
    {   //controller.transpose(arr, m, n);
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

    public static void printPattern(int n, int[] arr)
    {

        Character[][] temp=new Character[n][n];

        for(int i=0; i<n; i++)
        {   int j=0, k=0;
            for( j=0; j<arr[i]; j++)
            {
                temp[i][j]='*';
            }
            for(k=j; k<n; k++)
            {
                temp[i][k]='-';
            }
        }
        for(int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j) {
                    Character temp2 = temp[i][j];
                    temp[i][j] = temp[j][i];
                    temp[j][i] = temp2;
                }
            }
        }

        for(int i=0; i<n/2; i++)
        {
            for(int j=0; j<n; j++)
            {
                Character temp1=temp[i][j];
                temp[i][j]=temp[n-i-1][j];
                temp[n-i-1][j]=temp1;
            }
        }
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }



    }


}

package dslab;

import java.util.Arrays;

public class dslab3 {

    public static void main(String[] args) {
        int []ar = {1,2,3,4,5,7,8};
        System.out.println(binary(ar,5));
        System.out.println(linear(ar,3));


    }

    public static  int binary(int ar[], int element){
        int start = 0;
        int end = ar.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if(ar[mid] == element){
                return mid ;
            }
            else if(element>ar[mid]){
                start = mid+1;

            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }
    public static int linear(int ar[],int element){
        for (int i =0;i<ar.length;i++){
            if(ar[i] ==element){
                return i;
            }
        }
        return -1;
    }




    public static void spa(int[][]ar)
    {

        int size = 0;
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                if (ar[i][j] != 0)
                {
                    size++;
                }
            }
        }

        int compactMatrix[][] = new int[3][size];

        int k = 0;
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                if (ar[i][j] != 0)
                {
                    compactMatrix[0][k] = i;
                    compactMatrix[1][k] = j;
                    compactMatrix[2][k] = ar[i][j];
                    k++;
                }
            }
        }

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < size; j++)
            {
                System.out.println(compactMatrix[i][j]);
            }
            System.out.println();
        }
    }
}

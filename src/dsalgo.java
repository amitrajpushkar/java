import java.util.Arrays;

public class dsalgo {
    public static void main(String[] args) {
      //  inverse(27);
        int [] ar = {3,4,1,6,2,3};
        System.out.println(sunny(ar));
        int [] ar1 = {7,10,4,3,20,15};
        System.out.println(kth(ar1,6));



    }

    public static void inverse(int num) {
        int i =0;
        int[] ar = new int[5];
        while (num > 0) {
            int rem = num % 10;
            int temp = 9-rem;
            if(temp<rem){
                ar[i] = temp;

            }
            else {
                ar[i] = rem;
            }
            i++;
            num = num/10;
        }
        for (int j =i-1;j>=0;j--){
            System.out.println(ar[j]);
        }
    }
    public static int sunny(int []ar){
        int height = 0;
        int count = 0;
        for (int i = 0;i<=ar.length-1;i++){
            if(height<=ar[i]){
                height = ar[i];
                count+=1;
            }
        }
        return count;
    }
    public static int kth(int[]ar1,int smallest)
    {
        Arrays.sort(ar1);
      int temp = smallest;
      int store = 0;
        for (int start = 0;start<=ar1.length;start++){
        if(temp == start){
            store= ar1[start-1];
        }
    }

      return store;
  }
 }


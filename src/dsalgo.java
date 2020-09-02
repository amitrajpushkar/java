public class dsalgo {
    public static void main(String[] args) {
        inverse(27);
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
}


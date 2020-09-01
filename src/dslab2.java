import java.util.Arrays;

public class dslab2 {
    public static void main(String[] args) {
        /*
        int [] ar= {1,1,3,3,4};


        reverse(ar,0,ar.length-1);
        System.out.println(Arrays.toString(ar));
        System.out.println(repeat(ar));

        int fisrt[] = {1,2,34,5};
        int second[] = {3,4,5,6};
        merge(fisrt,second);

        int [] ar2 = {1,2,3,4,7,8};
        delete(ar2,2);
        System.out.println(Arrays.toString(ar2));
        int[]ar3 = {4,5,6,7};
        insert(ar3,2,43);
        System.out.println(Arrays.toString(ar3));
        int []ar4 = {1,2,3,4};
        traverse(ar4);
        System.out.println(Arrays.toString(ar4));

*/
    }

    public static void reverse(int []ar,int start,int end){

        while (start<end)
        {
            int temp = ar[start];
            ar[start] = ar[end];
            ar[end] = temp;

            start+=1;
            end-=1;
        }
    }
    public static int[] merge(int first[],int []second) {
        int[] mix = new int [first.length+ second.length];
        int i =0 ;
        int j =0;
        int k =0;
        while (i< first.length&& j< second.length){
            if(first[i]<second[j]){
                mix[k]= first[i];
                i++;
                k++;
            }
            else{
                mix[k]= second[j];
                j++;
                k++;

            }
        }
        while(i< first.length){
            mix[k]= first[i];
            i++;
            k++;
        }
        while (j< second.length){
            mix[k] = second [j];
            j++;
            k++;
        }
return mix;

    }
    public static int repeat(int ar[]){
        int res = 0;
        for (int i =0;i<=ar.length-1;i++){
            res = res^ar[i];

        }
        return res;

    }

    public static void delete(int[]ar2,int index) {
        for (int start = index;start<ar2.length-1;start++){
            ar2[start] = ar2[start+1];
        }
    }

    public static void insert(int []ar3,int index,int element){
        for (int start = index; start<ar3.length-1;start++){
            ar3[index] = element;
            ar3[start+1]= ar3[start];
        }
    }
    public static void traverse(int [] ar4){
        for (int i = 0;i<= ar4.length-1;i++){

        }
    }
}





package geeksforgeeks;

public class happyno {
    public static void main(String[] args) {
        System.out.println(prime(13));

    }

    public static int prime(int num){
        int flag = 0;
        int start = 2;
        while (start<num){
            if ((num%start) == 0){
                flag = 1;
                break;
            }
            start += 1;

        }
        if (flag == 1){
            System.out.println("not prime");
        }
        else {
            System.out.println("prime");
        }
        return -1;
    }
}

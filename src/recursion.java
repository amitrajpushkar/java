import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
       /* Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if(a>b&&a>c){
            if (b>c){
                System.out.println("second highest is"+b);
            }
            else{
                System.out.println("second highest is"+c);
            }
        }
        else if(b>a&&b>c){
            if(a>c){
                System.out.println("second highest"+a);
            }
            else{
                System.out.println("second highest"+c);
            }

        }
        else if(c>a&&c>b){
            if(a>b){
                System.out.println("second highest"+a);
            }
            else {
                System.out.println("second highest"+b);
            }
        }
        */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int row = 0; row<=n-1;row++){
            for (int col =0;col<=row;col++){
                if (row+col==0){
                    System.out.print("1");
                }

                else if((col==row)||(col+row)%row==0){
                    System.out.print(row);
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }


    }

    public static void dec(int n)
    {
        if(n==0){
            return;
        }
        System.out.println(n);
        dec(n-1);
    }
    public static void inc(int n)
    {
        if(n==0){
            return;
        }
        inc(n-1);
        System.out.println(n);
    }

   public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
   }
   public static int fib(int n){
        if(n<2){
            return n;
        }
        return fib(n-2)+fib(n-1);
   }



}

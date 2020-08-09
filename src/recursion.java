import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {


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

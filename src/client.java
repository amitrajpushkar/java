import java.util.Scanner;

public class client {
    public static void main(String[] args) {
        human homo=new human(23,"amit",400000);
        System.out.println(homo.age);
        homo.name="jnbh";
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int row=n;row>=1;row--){
            for (int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}

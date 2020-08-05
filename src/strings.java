
public class strings {
    public static void main(String[] args) {

        System.out.println(pow(2,3));
        String str="jai ho";
    }
    public static int pow(int base,int power)
    {
        int result=1;
        for (int i=1;i<=power;i++)
        {
             result=result*base;
        }
        return result;
    }
    String str="jai ho";

}

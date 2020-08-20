public class comp {
    public static void main(String[] args) {
        String str ="amit";
        encrypt(str);


    }

    public static void encrypt(String str)
    {
        for (int i =0;i<=str.length()-1;i++){

            char ch = str.charAt(i);
            ch+=1;
            System.out.print(ch);

        }
    }
}

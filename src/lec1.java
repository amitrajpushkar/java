public class lec1 {
    public static void main(String[] args) {
        System.out.println("enter your weight and height but height must be in m");
        System.out.println(bmi(80, (float) 1.83));
    }

    public static float bmi(int weight, float height) {
        float res=1;
         res = (weight /( height*height));
        if (res <= 18.5) {
            System.out.println("under weight");
        } else if (res >= 18.5 && res <= 24.9) {
            System.out.println("fit");
        } else {
            System.out.println("obese");
        }
        return res;
    }
}


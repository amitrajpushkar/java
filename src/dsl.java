import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class dsl {
    public static void main(String[] args) {


        int ar[] = {9, 2, 3, 4};
        System.out.println("prog. for second largest element");
        System.out.println(largestandsecondlargest(ar));

        System.out.println("prog. for symmetric matrix");

        int ar1[][] = {{1,2,3},{2,1,4},{3,4,3}};
        System.out.println(symm(ar1));

        System.out.println("prog. for duplicate or redundancy ");
        duplicate();

    }

    public static int largestandsecondlargest(int[] ar) {
        int max = 0;
        int secondmax = 0;
        for (int i = 0; i <= ar.length - 1; i++) {
            if (ar[i] > max) {
                secondmax = max;
                max = ar[i];
            }
            else if (ar[i]>secondmax) {
                secondmax = ar[i];

            }
        }
        return secondmax;
    }

    public static boolean symm(int[][]ar1) {
        for (int row = 0; row <= ar1.length-1; row++) {
            for (int col = 0; col <= ar1.length-1; col++) {

                if (ar1[row][col] != ar1[col][row]) {
                    return false;
                }
            }
        }
        return true;
    }
//  hashset is class which is implemented by set interface which avoid redundancy in your data
    public static void duplicate(){
        HashSet<Integer>set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set.add(3));
    }

}




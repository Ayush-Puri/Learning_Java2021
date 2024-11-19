package Array_lists;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReArranging_Array {

    public static Scanner S1 = new Scanner(System.in);

    public static void main(String[] args) {

        int[] Array1 = getIntegers(5);
        int[] Array2 = Arrays.copyOf(Array1,Array1.length);
        int[] result = new int[Array2.length];



       int max = Array1[0];

        for (int b = 0; b < Array2.length; b++) {

            for (int e = b + 1; e < Array2.length - 1; e++) {

                if (Array2[b] <= Array2[e]) {
                    int f = Array2[b];
                    Array2[b]=Array2[e];
                    Array2[e] = f;
                }
            }
        }
        printArray(Array2);
    }

    public static int[] getIntegers(int a) {
        System.out.println("Please Enter " + a + " values:\r");
        int[] Values = new int[a];

        for (int n = 0; n < Values.length; n++) {
            Values[n] = S1.nextInt();
        }
        return Values;
    }

    public static int arraySum(int[] d) {

        int b = 0;
        for (int c = 0; c < d.length; c++) {
            b = b + d[c];
        }
        return b;
    }
    public static int arrayleast(int[] d) {

        int b = 0;
        for (int c = 0; c < d.length; c++) {
            b = b - d[c];
        }
        return b;
    }

    public static void printArray(int[] f) {

        for (int m = 0; m < f.length; m++) {
            System.out.println("Entry No. " + m + " is ; " + f[m]);
        }

    }
}

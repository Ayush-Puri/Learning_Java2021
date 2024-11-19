package Array_lists;

import java.util.Scanner;

public class Array_Avg {

    public static Scanner S1 = new Scanner(System.in);

    public static void main(String[] args){
        int[] myints = getIntegers(5);
        for(int n = 1;n<=myints.length ; n++){
            System.out.println("Entered Number "+n+", is "+myints[n-1]);
        }

        System.out.println(arraySum(myints)/myints.length);
    }
    public static int[] getIntegers(int a){
        System.out.println("Please Enter "+a+" values:\r");
        int[] Values = new int[a];

        for(int n = 0;n<Values.length ;n++ ){
            Values[n] = S1.nextInt();
        }
        return Values;
    }

    public static int arraySum(int[] d){

        int b = 0;
        for(int c = 0;c<d.length;c++){
            b = b +d[c];
        }
        return b;
    }
    public static void printArray(int[] f){

        for(int m = 0;m<f.length;m++){
            System.out.println("Entry No. "+m+" is ; "+f[m]);
        }
    }
}

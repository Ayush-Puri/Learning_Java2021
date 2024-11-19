package Array_lists;

import java.util.Scanner;

public class Reverse_Array {

    private static Scanner s1 = new Scanner(System.in);
    public static void main(String[] args){
        int[] input = readIntegers();
        reverseArray2(input);

    }
    public static int[] readIntegers(){
        System.out.println("Enter the count :\r");
        int count = s1.nextInt(); 
        System.out.println("Enter "+count+" numbers:\r");
        int[] input = new int[count];
        for(int i = 0; i<count ; i++){
            input[i] = s1.nextInt();
        }
        return input;
    }
    public static int[] reverseArray(int[] input){
        int[] reverse = new int[input.length];
        for(int i = 0;i<input.length;i++){
            reverse[input.length-(1+i)] = input[i];
        }
        for(int a = 0;a<reverse.length;a++){
            System.out.println(reverse[a]);
        }
        return reverse;
    }
    public static int[] reverseArray2(int[] array){
        int temp = 0;
        for(int i = 0; i<array.length/2;i++){
            temp = array[i];
            array[i] = array[array.length-(1+i)];
            array[array.length-(1+i)] = temp;
        }
        for(int a = 0;a<array.length;a++){
            System.out.println(array[a]);
        }
        return array;
    }

}

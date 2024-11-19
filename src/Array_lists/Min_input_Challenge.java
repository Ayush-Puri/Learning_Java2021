package Array_lists;

import java.util.Scanner;

public class Min_input_Challenge {
    private static Scanner s1 = new Scanner(System.in);
    public static void main(String[] args){
        int[] input = readIntegers(5);
        findMin(input);

    }
    public static int[] readIntegers(int count){
        System.out.println("Enter "+count+" numbers:\r");
        int[] input = new int[count];
        for(int i = 0; i<count ; i++){
            input[i] = s1.nextInt();
        }
        return input;
    }
    public static int findMin(int[] array){

        int min = array[0];
        for(int j = 0; j<array.length-1; j++){
            if(array[j]<=array[j+1]){
                min = array[j];
            }
            if(min>=array[array.length-1]){
                min = array[array.length - 1];
            }
        }
        System.out.println("Minimum of inputs is : "+min);
        return min;
    }
}

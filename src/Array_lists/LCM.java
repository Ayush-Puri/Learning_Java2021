package Array_lists;

import java.util.ArrayList;
import java.util.Scanner;

public class LCM {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Please enter first no : \n");
        double num1 = s1.nextDouble();
        s1.nextLine();
        System.out.println("Please enter second no : \n");
        double num2 = s1.nextDouble();
        double num11 = num1;
        double num21 = num2;

        int[] primearray = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
                41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101,
                103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157,
                163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223,
                227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277,
                281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349,
                353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419,
                421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479,
                487, 491, 499, 503, 509, 521, 523, 541, 547, 557, 563,
                569, 571, 577, 587, 593, 599, 601, 607, 613, 617, 619,
                631, 641, 643, 647, 653, 659, 661, 673, 677, 683, 691,
                701, 709, 719, 727, 733, 739, 743, 751, 757, 761, 769,
                773, 787, 797, 809, 811, 821, 823, 827, 829, 839, 853,
                857, 859, 863, 877, 881, 883, 887, 907, 911, 919, 929,
                937, 941, 947, 953, 967, 971, 977, 983, 991, 997};

        int multiple1 = 1;
        int multiple2 = 1;
        int[] prime1 = new int[20];
        int[] prime2 = new int[20];
        for(int i = 0;i<primearray.length;i++){
               int n = 0;
                int count = 0;
                int c = primearray[i];
                while(num11 > 1){
                    num11 = num11/c;
                    count += 1;
                    prime1[n]=c;
                    n += 1;
                }
                multiple1 = multiple1*count*c;

            }

        for(int i = 0;i<primearray.length;i++){

            int m = 0;

            int count = 0;
            int d = primearray[i];
            while(num21 > 1){
                num21 = num21/d;
                count += 1;
                prime2[m]=d;
                m += 1;
            }
            multiple2 = multiple2*count*d;
        }

        //Now we can take common factors(elements) out from both arrays.
        //Then multiplying all elements of both arrays and with each other,
        //Finally dividing by common elements with their multiplicity.

        for(int i =0;i<prime1.length;i++){
            System.out.println(prime1[i]);
        }
        System.out.println("*---------*");
        for(int i =0;i<prime2.length;i++) {
            System.out.println(prime2[i]);
        }

    }

}

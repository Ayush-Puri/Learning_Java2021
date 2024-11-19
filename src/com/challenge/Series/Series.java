package com.challenge.Series;

public class Series {
    int n;

    public Series(int n) {
        this.n = n;
    }

    public static int nSum(int n) {
      int f = 0;
        for(int i =0;i<=n;i++){
            f = f + i;
        }

        return f;
    }
    public static int nFibonachi(int n){
        int i = 0;
        int j = 1;
        int k = 1;
        int f=0;

        if(n == 0){
            System.out.println(i);
            return i;
        }
        if(n == 1){
            System.out.println(j);
            return j;
        }
        if(n == 2){
            System.out.println(k);
            return k;
        }
        if(n < 0){
            System.out.println("Invalid Number!");
            return -1;
        }
        for(int m=1;m<=n;m++){
            f = j + k;
            j = k;
            k = f;
        }
        System.out.println(f);
        return f;
    }

    public static int nFactorial(int n){
        if(n == 0){
            System.out.println("1");
            return 1;
        }
        int f = 1;
        for (int i = 1;i<=n;i++){
            f = f*i;
        }
        System.out.println(f);
        return f;
    }
}

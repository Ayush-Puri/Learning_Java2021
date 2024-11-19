package Array_lists;

public class Count_Sort {
    public static void main(String[] args) {

        int[] input = {2,3,4,5,5,6,6,6,7,3,2,4};
        countSort(input,1,10);
        for(int i = 0; i<input.length; i++){
            System.out.println(input[i]);
        }

    }

    public static void countSort(int[] input, int min, int max){
            int[] count = new int[max - min +1];
            for(int i = 0; i<input.length;i++){
                int temp = input[i];
                count[temp - min] +=1;
            }
            int j = 0;

            for(int i = min; i<=max ;i++){
                while(count[i-min]>0){
                    input[j++]=i;
                    count[i-min]--;
                }
            }

    }
}

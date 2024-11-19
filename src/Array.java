public class Array {

    public static void main(String[] args){

        System.out.println("hello");

        int[] Array1 = new int[10];

        for(int a=0; a<Array1.length;a++){
            Array1[a] = a;
        }
        for(int b = 0;b<Array1.length;b++){
            System.out.println("Term No. "+b+" is "+Array1[b]);
        }


    }

}

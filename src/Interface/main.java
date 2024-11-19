package Interface;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Library_Record ayush  = new Library_Record("Ayush", 123, 456);
        System.out.println(ayush.toString());
        saveObjects(ayush);
        loadObjects(ayush);
        System.out.println(ayush);

    }
    public static ArrayList<String> readValues() {
        Scanner s2 = new Scanner(System.in);
        ArrayList<String> values1 = new ArrayList<>();
        int index = 0;
        boolean quit = false;
        System.out.println("Choose an Option :\n"
                +"0 : if Quit\n"+
                "1 : if Entre next Value");
        while(!quit){
            System.out.println("Choose an Option");
            int rep = s2.nextInt();
            s2.nextLine();
            switch(rep){
                case 0 :
                    quit = true;
                    System.out.println("Quit Successful");
                    break;
                case 1 :
                    System.out.println("Enter next Value");
                    values1.add(index, s2.nextLine());
                    index++;
                    break;
                default :
                    System.out.println("Incorrect Option.");
                    break;

            }

        }
        return values1;
    }

    public static void saveObjects(ISaveable objectsToSave){

        for(int i=0;i<objectsToSave.write().size();i++){
            System.out.println("Saving "+objectsToSave.write().get(i)+"to the device");
        }
    }

    public static void loadObjects(ISaveable objectsToLoad){
        ArrayList<String> values = readValues();
        objectsToLoad.retrieve(values);
    }
}

package Array_lists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Grocery {
    private static Scanner s1 = new Scanner(System.in);
    private static ArrayList<String> Grocery = new ArrayList<String>();

    public static ArrayList<String> getGrocery() {
        return Grocery;
    }

    public static void addItem(String item){
        Grocery.add(item);
    }
    public static boolean searchItem(String item){
        if(Grocery.contains(item)){
            System.out.println("Item No."+(Grocery.indexOf(item)+1)+" is "+item);
            return true;
        }else {
            System.out.println("This item is not added.");
            return false;
        }
    }
    public static void modifyItem(String item){
        if(searchItem(item)){
            Grocery.set(Grocery.indexOf(item),s1.nextLine());
        }else{
            System.out.println("This item is not added.");
        }
    }
    public static void removeItem(String item){
        if(searchItem(item)){
            Grocery.remove(Grocery.indexOf(item));
        }else{
            System.out.println("This item is not added.");
        }
    }
    public static void displayList(){
        String list1 = new String(Grocery.toString());
        System.out.println(list1);
    }
    public static void optionlist(){
        System.out.println("Press 1 to display Grocery List");
        System.out.println("Press 2 to add item to Grocery List");
        System.out.println("Press 3 to modify item from Grocery List");
        System.out.println("Press 4 to remove item to Grocery List");
        System.out.println("Press 5 to search item in Grocery List");
        System.out.println("Press 6 to Exit the list");

    }

    public static void main(String[] args){
        boolean condition = true;
        Grocery.add("eggs");
        Grocery.add("milk");
        Grocery.add("cheese");
        addItem("pizza");
       // ArrayList<String> copyGrocery = new ArrayList<String>(getGrocery());
       // System.out.println(copyGrocery.toString());



        while(condition){
            optionlist();

            int a = s1.nextInt();
            switch (a){
                case 1 : displayList();
                         break;
                case 2 : s1.nextLine();
                         String item = s1.nextLine();
                         addItem(item);
                         break;
                case 3 : s1.nextLine();
                         System.out.println("Enter the Item you would like to Modify : \r");
                         item =  s1.nextLine();
                         modifyItem(item);
                         break;
                case 4 : s1.nextLine();
                         item =  s1.nextLine();
                         removeItem(item);
                         break;
                case 5 : s1.nextLine();
                         item =  s1.nextLine();
                         searchItem(item);
                         break;
                case 6 : s1.nextLine();
                         condition = false;
                         break;

                default: optionlist();
                break;
            }

        }
    }


}

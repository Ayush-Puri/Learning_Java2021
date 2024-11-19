package Linked_Lists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Linked_List_1 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        LinkedList<String> linkedList1 = new LinkedList<String>();
        linkedList1.add("Asia");
        linkedList1.add("India");
        linkedList1.add("japan");
        linkedList1.add("China");

        printList(linkedList1);


    }
    private static void printList(LinkedList<String> list1){
        Iterator<String> i = list1.iterator();
        while(i.hasNext()){
            System.out.println("Now Visiting"+i.next());
        }
        System.out.println("==============");
    }

    private static void sortedAdd(String a){



    }
}

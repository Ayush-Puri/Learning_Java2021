package Array_lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Mobile_Phone_Challenge {
    //update existing contact to return index of that contact or-1 in case of not existing.

    Scanner scanner = new Scanner(System.in);
    public static ArrayList<Contact> contactList = new ArrayList<Contact>();

    public static void main(String[] args) {

        Mobile_Phone_Challenge Ayush_Phone = new Mobile_Phone_Challenge();

        Ayush_Phone.contactList.add(new Contact("Ayush", 23233));
        contactList.add(new Contact("Jai", 233));
        contactList.add(new Contact("Kakuu", 2313));

        boolean index = true;
        optionlist();
        while(index){

            Scanner input = new Scanner(System.in);
            int i1 = input.nextInt();
            input.nextLine();

            switch(i1){
                case 0 : optionlist();
                    break;
                case 1 : Ayush_Phone.displayList();
                    break;
                case 2 :
                    Ayush_Phone.addContact();
                    break;
                case 3 : Ayush_Phone.modifyContact();
                    break;
                case 4 : Ayush_Phone.deleteContact();
                    break;
                case 5 : Ayush_Phone.searchContact();
                    break;
                case 6 : index = false;
                    break;

                default: optionlist();
                    break;
            
            }

        }

    }
    public static void optionlist(){
        System.out.println("Press 1 to display Contact List");
        System.out.println("Press 2 to add Contact to Contact List");
        System.out.println("Press 3 to modify Contact from Contact List");
        System.out.println("Press 4 to remove Contact to Contact List");
        System.out.println("Press 5 to search Contact in Contact List");
        System.out.println("Press 6 to Exit the list");

    }
    public static void displayList() {
        for(int i = 0; i < contactList.size();i++){
            String S1 = new String(contactList.get(i).getName());
            System.out.println(S1);
        }
    }

    public boolean existingContact(String name) {
        //String a = new String(name.toLowerCase(Locale.ROOT));
        String namlow = name.toLowerCase();
        int flag = 1;
        for (int i = 0; i < contactList.size(); i++) {
            flag = contactList.get(i).getName().compareToIgnoreCase(namlow);
            if (flag == 0)
                return true;
        }
        return false;
    }

    public boolean existingContact(long number) {
        boolean flag = false;
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getNumber() == number) {
                flag = true;
            }
        }
        return flag;
    }

    public void addContact() {
        System.out.println("Please Enter Name: \r");
        String name = scanner.nextLine();
        System.out.println("Please Enter Phone Number: \r");
        long num = scanner.nextLong();
        scanner.nextLine();
        Contact cnew = new Contact(name, num);
        contactList.add(cnew);
        System.out.println("Contact has been successfully Saved.");

    }
    public void searchContact(){
        System.out.println("Enter the Name of contact :");
        String input = new String(scanner.nextLine());
        if(existingContact(input)){
            System.out.println("This Contact exists");
            int flag = 1;
            for (int i = 0; i < contactList.size(); i++) {
                flag = contactList.get(i).getName().compareToIgnoreCase(input);
                if (flag == 0){
                    long n = contactList.get(i).getNumber();
                    System.out.println("Contact no. : "+n);
                }
            }
            }
        else {System.out.println("Could Not find name please search by number : \r");
            long num = scanner.nextLong();
            scanner.nextLine();
            boolean search2 = existingContact(num);
            if(search2){
                System.out.println("This Contact exists");
                for(int i = 0; i<contactList.size();i++){
                    if(num == contactList.get(i).getNumber()){
                        System.out.println("This contact is registered with name : "+contactList.get(i).getName());
                    }
                }
            }
           else { System.out.println("Sorry this contact does not exists");
           }
        }
    }
    public void deleteContact(){
        System.out.println("Please Enter Name of Contact you'd like to delete : \r");
        String name = scanner.nextLine();
        boolean search = existingContact(name);
        if(search){
            int flag = 1;
            for(int i = 0; i < contactList.size();i++){
                flag = contactList.get(i).getName().compareToIgnoreCase(name);
                if (flag == 0){
                    contactList.remove(i);
                }
            }
        }else {
            System.out.println("Could Not find name please search by number : \r");
            long num = scanner.nextLong();
            scanner.nextLine();
            boolean search2 = existingContact(num);
            if(search2){
                for (int i = 0; i < contactList.size(); i++) {
                    if (contactList.get(i).getNumber() == num) {
                        contactList.remove(i);
                    }
                }
            }else {
                System.out.println("Could Not find Contact.");
            }
        }
    }
    public void modifyContact(){
        System.out.println("Please Enter Name of Contact you'd like to Modify : \r");
        String name = scanner.nextLine();
        boolean search = existingContact(name);
        if(search){
            int flag = 1;
            for(int i = 0; i < contactList.size();i++){
                flag = contactList.get(i).getName().compareToIgnoreCase(name);
                if (flag == 0){

                    System.out.println("Press 1 to update Name. \r Press 2 to update Number");
                    int sign = scanner.nextInt();
                    scanner.nextLine();
                    switch (sign){
                        case 1 :
                                 System.out.println("Enter new Name for the Contact. ");
                                 String newName = scanner.nextLine();
                                 Contact updated = new Contact(newName, contactList.get(i).getNumber());
                                 contactList.remove(i);
                                 contactList.add(updated);
                                 break;
                        case 2 :
                                 System.out.println("Enter new Number for the Contact. ");
                                 long newNumber = scanner.nextLong();
                                 scanner.nextLine();
                                 Contact updated2 = new Contact(contactList.get(i).getName(), newNumber);
                                 contactList.remove(i);
                                 contactList.add(updated2);
                                 break;

                    }
                }
            }
        }else {
            System.out.println("Could Not find name please search by number : \r");
            long num = scanner.nextLong();
            scanner.nextLine();
            boolean search2 = existingContact(num);
            if(search2){
                for (int i = 0; i < contactList.size(); i++) {
                    if (contactList.get(i).getNumber() == num) {
                        System.out.println("Press 1 to update Name. \r Press 2 to update Number");
                        int sign = scanner.nextInt();
                        scanner.nextLine();
                        switch (sign){
                            case 1 :
                                System.out.println("Enter new Name for the Contact. ");
                                String newName = scanner.nextLine();
                                Contact updated = new Contact(newName, contactList.get(i).getNumber());
                                contactList.remove(i);
                                contactList.add(updated);
                                break;
                            case 2 :
                                System.out.println("Enter new Number for the Contact. ");
                                long newNumber = scanner.nextLong();
                                scanner.nextLine();
                                Contact updated2 = new Contact(contactList.get(i).getName(), newNumber);
                                contactList.remove(i);
                                contactList.add(updated2);
                                break;

                        }
                    }
                }
            }else {
                System.out.println("Could Not find Contact.");
            }
        }

    }

}

 class Contact{
    private long Number;
    private String Name;

    public Contact(String Name, long Number){
        this.Name = Name;
        this.Number = Number;
    }

    public String getName(){
        return Name;
    }
    public long getNumber(){
        return Number;
    }

}


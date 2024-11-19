package Linked_Lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Music_Album_Challenge {

    public static class Song{
        private String Name;

        public Song(String Name) {
            this.Name = Name;
        }

        public void song(String Name){
            this.Name = Name;
        }

        public String getName(){
            return Name;
        }
    }
    public static class Album{
        public String Name;
        public ArrayList<Song> singer = new ArrayList<Song>();

        public void makeAlbum(String name, ArrayList<Song> singer) {
            Name = name;
            this.singer = singer;
        }
    }
    public static void optionlist(){
        System.out.println("Press 1 to display Contact List");
        System.out.println("Press 2 to add Song to Album");
        System.out.println("Press 3 to remove Song from album");
        System.out.println("Press 4 to add Song to Playlist");
        System.out.println("Press 5 to Exit the list");

    }
    private static void printList(ArrayList<Song> singer){
        Iterator<Song> i = singer.iterator();
        while(i.hasNext()){
            System.out.println("Now Playing "+i.next().Name);
        }
        System.out.println("==============");
    }
    private static void printPlayList(LinkedList<Song> list1){
        Iterator<Song> i = list1.iterator();
        while(i.hasNext()){
            System.out.println("Now Playing "+i.next().Name);
        }
        System.out.println("==============");
    }


    public static Scanner s1 = new Scanner(System.in);

    public static void main(String[] args) {

        Album Ayush1 = new Album();
        Ayush1.singer.add(new Song("Blues"));
        Ayush1.singer.add(new Song("Blues1"));
        Ayush1.singer.add(new Song("Blues2"));
        Ayush1.singer.add(new Song("Blues3"));

        printList(Ayush1.singer);

        LinkedList<Song> playlist = new LinkedList<Song>();

        boolean flag = true;
        while(flag){

            optionlist();

            int a1 = s1.nextInt();
            switch(a1){
                case 1 : printPlayList(playlist);
                         break;
                case 2 : System.out.println("Please Enter name of Song to add : \n");
                         s1.nextLine();
                         Ayush1.singer.add(new Song(s1.nextLine()));
                         System.out.println("Successfully Added ");
                         break;
                case 3 : System.out.println("Please Enter name of Song to be removed : \n");
                         Ayush1.singer.remove(s1.nextInt()+1);
                         break;
                case 4 : System.out.println("Please Enter name of Song to add in que : ");
                         s1.nextLine();
                         String songname = s1.nextLine();
                         Iterator<Song> b = Ayush1.singer.iterator();
                         boolean flag1 = false ;
                         while (b.hasNext()){
                             if(b.next().Name.equals(songname)){
                                 playlist.add(playlist.size(),new Song(songname));
                                 System.out.println("Successfully added.");
                                 flag1 = true;
                                 break;
                             }
                         }if(!flag1){
                            System.out.println("Could not find song");
                         }
                         break;
                case 5 : flag = false;
                         break;
                default: flag = false;
                         break;
            }

        }


    }

    }



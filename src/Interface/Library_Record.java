package Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library_Record implements ISaveable {

    public String Name;
    public int bookRef1;
    public int bookRef2;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getBookRef1() {
        return bookRef1;
    }

    public void setBookRef1(int bookRef1) {
        this.bookRef1 = bookRef1;
    }

    public int getBookRef2() {
        return bookRef2;
    }

    public void setBookRef2(int bookRef2) {
        this.bookRef2 = bookRef2;
    }

    public Library_Record(String Name, int bookRef1, int bookRef2){
        this.Name = Name;
        this.bookRef1 = bookRef1;
        this.bookRef2 = bookRef2;
    }

    @Override
    public String toString() {
        return "Library_Record{" +
                "Name='" + Name + '\'' +
                ", bookRef1=" + bookRef1 +
                ", bookRef2=" + bookRef2 +
                '}';
    }

    Scanner s1 = new Scanner(System.in);


    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0,this.Name);
        values.add(1,""+this.bookRef1);
        values.add(2,""+this.bookRef2);

        return values;
    }

    @Override
    public void retrieve(List<String> savedValues) {
        if(savedValues != null && savedValues.size() > 0){
            this.Name = savedValues.get(0);
            this.bookRef1 = Integer.parseInt(savedValues.get(1));
            this.bookRef2 = Integer.parseInt(savedValues.get(2));

        }

    }

}

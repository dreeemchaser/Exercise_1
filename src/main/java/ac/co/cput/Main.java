package ac.co.cput;

import ac.co.cput.domain.Person;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {


    public static int initialize(Person[]p, int size){
        p[0] = new Person("Alexander","Draai", "Male", 200, 95.2f);
        p[1] = new Person("Kate","Stevens", "Female", 160, 60.8f);
        p[2] = new Person("Jon","Mac", "Male", 164, 75.8f);
        p[3] = new Person("Aviewe","Pantsi", "Male", 180, 65.8f);
        p[4] = new Person("Matt","Moore", "Male", 177, 70.9f);
        p[5] = new Person("Jason","Gillespe", "Male", 187, 69.0f);
        p[6] = new Person("Andrew","Macsson", "Male", 190, 66.6f);
        p[7] = new Person("Tia","Chauhan", "Female", 185, 74.1f);

        size = 8;
        return size;
    }

    public static int initializeArrayList(ArrayList<Person> p, int size) {

        //    list.add(new MyObject (1, 2, 3)); //Create a new object and adding it to list.

        p.add( new Person("Alexander","Draai", "Male", 200, 95.2f));
        p.add(new Person("Kate","Stevens", "Female", 160, 60.8f));
        p.add(new Person("Jon","Mac", "Male", 164, 75.8f));
        p.add(new Person("Aviewe","Pantsi", "Male", 180, 65.8f));
        p.add(new Person("Matt","Moore", "Male", 177, 70.9f));
        p.add(new Person("Jason","Gillespe", "Male", 187, 69.0f));
        p.add(new Person("Andrew","Macsson", "Male", 190, 66.6f));
        p.add(new Person("Tia","Chauhan" ,"Female", 185, 74.1f));

        size = p.size();

        return size;

    }


    public static void sortArrayList(ArrayList<Person> P){
        Collections.sort(P);
    }

    public static void displayArrayList(ArrayList<Person> P){
        for (int i = 0; i < P.size(); i++){
            System.out.println(P.get(i).toString());
        }
    }

    public static void sort(Person []p, int size) {
        Arrays.sort(p);
    }

    public static void display(Person []p, int size){
        for (int i = 0; i < size; i++){
            System.out.println(p[i].toString());
        }
    }

    public static void main(String[] args) {

      int ArrayListSize = 0;
      ArrayList<Person> persons = new ArrayList<Person>();

      ArrayListSize = initializeArrayList(persons, ArrayListSize);
      sortArrayList(persons);
      displayArrayList(persons);


    }
}
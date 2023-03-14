package ac.co.cput;

import ac.co.cput.domain.Person;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainArrayList {

    public static int initializeArrayList(ArrayList<Person> p, int size) {

    // p refers to the array list that's thats sent as a parameter.

        p.add( new Person("Alexander","Draai", "Male", 200, 95.2f));
        p.add(new Person("Kate","Stevens", "Female", 160, 60.8f));
        p.add(new Person("Jon","Mac", "Male", 164, 75.8f));
        p.add(new Person("Aviewe","Pantsi", "Male", 180, 65.8f));
        p.add(new Person("Matt","Moore", "Male", 177, 70.9f));
        p.add(new Person("Jason","Gillespe", "Male", 187, 69.0f));
        p.add(new Person("Andrew","Macsson", "Male", 190, 66.6f));
        p.add(new Person("Tia","Chauhan" ,"Female", 185, 74.1f));

   // With arraylists there is a built-in method that can return the size of the list.
        size = p.size();

        return size;

    }
    public static void sortArrayList(ArrayList<Person> P){
        // We use the collections framework to sort through the arraylist.
        Collections.sort(P);
    }

    public static void displayArrayList(ArrayList<Person> P){ // For loop is used to look through the ArrayList and Display the data.
        for (int i = 0; i < P.size(); i++){
            System.out.println(P.get(i).toString());
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

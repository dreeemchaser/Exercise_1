package ac.co.cput;

import ac.co.cput.domain.Person;

import java.beans.JavaBean;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainArray {


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

    public static void sort(Person []p, int size) {
        Arrays.sort(p);
    }

    public static void display(Person []p, int size){
        for (int i = 0; i < size; i++){
            System.out.println(p[i].toString());
        }
    }

    public static void main(String[] args) {
        Person[] p = new Person[8];
        int size = 0 ;

        size = initialize(p, size);
        sort(p, size);
        display(p, size);
    }
}
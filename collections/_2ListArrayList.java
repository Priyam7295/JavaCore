package collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

// LIST = LIST interface is part of the Java Collections Framework and represents an ordered collection of elements.


// 1. Array list  is like a resizable array that can grow and shrink as needed.


public class _2ListArrayList {
    public static void main(String[] args) {
        // creating new arraylist object
        ArrayList<String> names = new ArrayList<>(); 

        System.out.println(names);
        // adding elements to the arraylist
        names.add("Alice");
        names.add("Pritu");
        names.add("Bob");
        
        // accessing elements
        System.out.println(names.get(1));

        // getting size
        System.out.println(names.size());

        // searching for an element
        System.out.println(names.contains("Pritu")); // O(N) - linear search

        // removing an element
        names.remove("Alice");
        System.out.println(names);

        // adding an element at a specific index
        names.add(0, "Charlie");
        System.out.println(names);

        // changing an element at a specific index
        names.set(0,"charlie-chaplin");
        System.out.println(names);

        // clearing the arraylist
        names.clear();
        System.out.println(names);
        System.out.println("\n\n\n");

        ArrayList<Integer> numbers = new ArrayList<>();

        // adding elements to the arraylist
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // printing the arraylist
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        // using for-each loop to print the arraylis
        // for (Integer number : numbers) {
        //     System.out.println(number);
        // }
        

        // changing an element at a specific index
        numbers.set(0, 100);
        System.out.println(numbers);

        
        numbers.set(0, -90);
        System.out.println(numbers);

        numbers.add(8);
        numbers.add(5);
        numbers.add(-100);
        numbers.add(590);
        System.out.println(numbers);

        Collections.sort(numbers); // This will not work because Collection.sort() is not a method of Collection interface

        // sorting the arraylist
        System.out.println(numbers);

        



    }
}

package collections;

import java.util.HashSet;
import java.util.Set;


// The Set interface is part of the Java Collections Framework and is used to store a collection of unique elements.

// Common classes that implement Set:

// 1.HashSet - fast and unordered
// 2.TreeSet - sorted set
// 3.LinkedHashSet - ordered by insertion

public class _5HashSet {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Alice");
        names.add("Pritu"); 
        names.add("Aiman");
        names.add("Alice");

        System.out.println("Names in HashSet: " + names);

        names.remove("Alice");

        for(String name : names) {
            System.out.println(name);
        }
        System.out.println("\n");

        // checking if an element exists
        if (names.contains("Pritu")) {
            System.out.println("Pritu is in the set.");
        } else {
            System.out.println("Pritu is not in the set.");
        }

    }
}

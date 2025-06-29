package collections;
import java.util.TreeSet;

// it stores unique elements in sorted order
// rest of the methods are same as HashSet
// it implements Set interface

public class _6TreeSet {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("Alice");
        names.add("Pritu");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("Names in TreeSet: " + names);

        // removing an element
        names.remove("Alice");
        System.out.println("After removing Alice: " + names);

        // checking if an element exists
        if (names.contains("Pritu")) {
            System.out.println("Pritu is in the set.");
        } else {
            System.out.println("Pritu is not in the set.");
        }   

        names.clear();
    }
}

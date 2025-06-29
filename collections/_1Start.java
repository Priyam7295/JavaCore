
package collections;

// Before we explore ArrayList, HashSet, HashMap, and other data structures in more detail, 
// it's important to understand that all of these are part of something bigger - the Java Collections Framework.

// The Java Collection Framework is a set of classes and interfaces for working with groups of objects.
// All of these are part of the java.util package.


// Interface	Common Classes	Description
// List     ->	ArrayList, LinkedList	 ->Ordered collection that allows duplicates
// Set	    -> HashSet, TreeSet, LinkedHashSet	->Collection of unique elements
// Map	    -> HashMap, TreeMap, LinkedHashMap	->Stores key-value pairs with unique keys


// Inteface ->class -> Description
// 1.List->	ArrayList	Resizable array that maintains order and allows duplicates
//           LinkedList	List with fast insert and remove operations

// 2.Set -> HashSet	Unordered collection of unique elements
//       TreeSet	Sorted set of unique elements (natural order)
//        LinkedHashSet	Maintains the order in which elements were inserted

//3. Map-> HashMap	Stores key/value pairs with no specific order
// TreeMap	Sorted map based on the natural order of keys
// LinkedHashMap	Maintains the order in which keys were inserted

public class _1Start {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Collections!");
    }
}

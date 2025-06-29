package collections;
import java.util.LinkedList;

// /LinkedList has same methods as ArrayList, but it is implemented using a doubly linked list.
// This means that it is more efficient for insertions and deletions, but less efficient for accessing elements by index.

public class _3ListLinkedList {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        System.out.println(names);

        names.add("Alice");
        names.add("Pritu");
        names.add("Aiman");

        System.out.println(names);

        names.addFirst("Bob");
        names.addLast("Charlie");
        System.out.println(names);

        System.out.println(names.get(1));

        names.set(0, "charlie-chaplin");
        System.out.println(names);


        // few methods are extra in LinkedList like\
        names.removeFirst(); // removes the first element
        names.removeLast(); // removes the last element 
        names.addFirst("New First Element"); // adds an element at the beginning
        names.addLast("New Last Element"); // adds an element at the end
        System.out.println(names);

        System.out.println(names.getFirst()); // gets the first element
        System.out.println(names.getLast()); // gets the last element

    }
}

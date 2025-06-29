package collections;
import java.util.*;

public class _4Sorting {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> nums = new ArrayList<>();

        
        String[] students = {"Rekha", "Pritu", "Aiman", "Sumit", "Neha" ,"Aman"};
        int[] ages = {35,21,20,23,42,1};
        for (String student : students) {
            names.add(student);
        }
        for (int age : ages) {
            nums.add(age);
        }

        
        // sorting in ascending order
        // Collections.sort(names);
        // Collections.sort(nums);
        // System.out.println("Sorted names: " + names);
        // System.out.println("Sorted numbers: " + nums);

        // sorting in descending order
        // Collections.sort(names, Collections.reverseOrder());
        // Collections.sort(nums, Collections.reverseOrder()); 
        // System.out.println("Sorted names in descending order: " + names);
        // System.out.println("Sorted numbers in descending order: " + nums);



        ArrayList<ArrayList<Object>> people = new ArrayList<>();

        

        for(int i=0;i<nums.size();i++) {
            ArrayList<Object> person = new ArrayList<>();
            String naam = names.get(i);
            int umr = nums.get(i);
            person.add(naam);
            person.add(umr);
            people.add(person);
        }

        System.out.println("Before sorting:");
        for( ArrayList<Object> person : people) {
            System.out.println("{ " + person.get(0)+"-" + person.get(1)+ "}" );
        }


        // int compare(T o1, T o2)
        // It returns:

        // negative → if o1 < o2

        // 0 → if o1 == o2

        // positive → if o1 > o2



        // sorting based on age
        Collections.sort(people, new Comparator<ArrayList<Object>>() {
            @Override
            public int compare(ArrayList<Object> p1, ArrayList<Object> p2) {
                return ((Integer)p1.get(1)) - ((Integer)p2.get(1));

            }
        });


        System.out.println("After sorting by age:");
        for( ArrayList<Object> person : people) {
            System.out.println("{ " + person.get(0)+"-" + person.get(1)+ "}" );
        }

        // sorting based on name
        Collections.sort(people, new Comparator<ArrayList<Object>>() {
            @Override
            public int compare(ArrayList<Object> p1, ArrayList<Object> p2) {
                return ((String)p1.get(0)).compareTo((String)p2.get(0));
            }
        });
        System.out.println("\n\n\n");

        for( ArrayList<Object> person : people) {
            System.out.println("{ " + person.get(0)+"-" + person.get(1)+ "}" );
        }


    }
}

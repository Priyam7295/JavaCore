package collections;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _18forEach {
    public static void main(String[] args) {
        // Your code here

        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");

        names.add("Bob");
        names.add("Charlie");
        names.add("Diana");
        // Using forEach to print each name
        names.forEach(name->{
            System.out.println(name);
        });

        // Using forEach to print each name with a custom messag
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(6);
        numbers.forEach((num)->{
            if(num%2==0){
                System.out.println(num);
            }
        });


         
        Stream<Integer> newArr = numbers.stream()
        .filter(num -> num % 2 == 0)
        .map(num -> num * 2);

        newArr.forEach((n)-> {
            System.out.println(n);
        });


    }
}

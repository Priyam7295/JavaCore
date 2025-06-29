package collections;

import java.util.HashMap;
import java.util.Map;

public class _8HashMap {
    public static void main(String[] args) {

        HashMap<String, Integer> capitalCities  = new HashMap<>();
        // Adding key-value pairs to the HashMap
        capitalCities.put("USA", 100);
        capitalCities.put("India", 200);
        capitalCities.put("China", 300);
        capitalCities.put("Japan", 400);

        int num = capitalCities.get("USA");
        System.out.println("Population of USA: " + num);

        // Checking if a key exists
        if (capitalCities.containsKey("India")) {   
            System.out.println("India is in the map.");
        } else {
            System.out.println("India is not in the map.");
        }


        System.out.println( capitalCities.size());
        


        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
          }

          
    }
}

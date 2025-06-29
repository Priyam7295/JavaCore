package collections;
import java.util.TreeMap;

public class _9TreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> capitalCities = new TreeMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo"); 
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities);


        for(String key: capitalCities.keySet()) {
            System.out.println(key +" - " + capitalCities.get(key));
        }

        if(capitalCities.containsKey("England")){
            System.out.println("Contains");
        } else {
            System.out.println("Donot");
        }

    }    
}

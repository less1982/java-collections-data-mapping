package HashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMapExample class demonstrates basic usage of HashMap
 * Stores country codes and names, loops thru entries, removes and adds value
 * This example uses generics for type safety (HashMap<String, String>)
 */
public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap to store country codes and country name
        HashMap<String, String> countryMap = new HashMap<>();

        /**
         * Add initial country to the map
         * HashMap allows fast access by key and does not maintain order
         */
        countryMap.put("US", "United States"); // add US
        countryMap.put("CAN", "Canada");       // add Canada
        countryMap.put("UK", "United Kingdom"); // add UK
        countryMap.put("FRC", "France");        // add France
        countryMap.put("IT", "Italy");          // add Italy

        // Removed unused variable and comment out code for clarity

        // Loop through map before removal
        System.out.println("Countries before removal:");
        for (Map.Entry<String, String> entry : countryMap.entrySet()) {
            // Print each key value pair
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        /**
         * Remove France from  map using its key
         */
        countryMap.remove("FRC");

        /**
         * Add Spain to map
         */
        countryMap.put("SP", "Spain");

        // Loop thru map after update
        System.out.println("Countries after update:");
        for (Map.Entry<String, String> entry : countryMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

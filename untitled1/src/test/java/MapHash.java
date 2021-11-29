import java.util.HashMap;

// Main class
public class MapHash{

    // Main driver method
    public static void main(String[] args)
    {
        // Create an empty hash map by declaring object
        // of string and integer type
        HashMap<String, Integer> map = new HashMap<>();

        // Adding elements to the Map
        // using standard add() method
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);

        // Print size and content of the Map
        System.out.println("Size of map is:- "
                + map.size());

        // Printing elements in object of Map
        System.out.println("Initial map is:" +map);

        //change the value
        map.put("vaibhav",50);
        System.out.println("Updated Map " + map);

        //Remove element
        map.remove("vishal");
        System.out.println("Mappings after removal are : " + map);

        // Checking if a key is present and if
        // present, print value by passing
        // random element
        if (map.containsKey("vishal")) {

            // Mapping
            Integer a = map.get("vishal");

            // Printing value fr the corresponding key
            System.out.println("value for key"
                    + " \"vishal\" is:- " + a);
        }
    }}
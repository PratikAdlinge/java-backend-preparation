package Collection_Framework.Map_Interface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class P02_LinkedHashMap {
    public static void main(String[] args) {
        Map<String ,String> map=new LinkedHashMap<>();

        map.put("in", "India");
        map.put("us", "United states");
        map.put("uk", "united Kingdom");
        map.put("en", "England");

        System.out.println(map);

        //get value
        System.out.println(map.get("in"));

        //remove key value
        System.out.println(map.remove("en"));

        System.out.println(map);
        //check key contains any value
        System.out.println(map.containsKey("in"));

        LinkedHashMap<String,String> country=new LinkedHashMap<>();
        country.put("aus", "Australia");
        //Before
        System.out.println("Before"+country);
        country.putAll(map);
        System.out.println("After"+country);

        country.putIfAbsent("ind","indoneshia");
        System.out.println("Afterput ifabsent:"+country);

        //value associated with key
        System.out.println(country.get("us"));

        //default value is key is not present
        System.out.println(country.getOrDefault("uks", "None"));

        //check key
        System.out.println(country.containsKey("aus"));
        //check value
        System.out.println(country.containsValue("India"));

        //change value of key
        System.out.println(country.replace("in", "Bharat"));

    System.out.println(country);
    //replace
    System.out.println(country.replace("us", "United states", "United States of America"));
    System.out.println(country);

    System.out.println(country.remove("ind"));

    System.out.println(country);

    Set<String> set=country.keySet();
    System.out.println("Keys:"+set);

    Collection<String>val=country.values();
    System.out.println("values:"+val);

    Set<Entry<String,String>>entry=country.entrySet();
    System.out.println("All Entries:"+entry);

    for (Entry<String,String> entry2 : entry) {
        System.out.println(entry2);
    }
    for(Map.Entry<String,String> entry1:country.entrySet()){
        System.out.println("Keys:"+entry1.getKey()+" values:"+ entry1.getValue());
    }

    }
}



package HashMaps;
import java.util.*;

public class basics_of_hashmaps {
    public static void main(String[] args) {
        HashMap<Integer,Integer> count = new HashMap<>();
        HashMap<Integer, String> h = new HashMap<>();
        h.put(1,"Jash");
        h.put(2,"Lakshmi");
        h.put(3,"Jaya");
        h.put(4,"Deepak");
        h.put(5,"Padhi");
        System.out.println(h);

        for(Map.Entry<Integer, String> entry : h.entrySet()){
            System.out.println("ID: " + entry.getKey() + " Name: " + entry.getValue());
        }
    }
}

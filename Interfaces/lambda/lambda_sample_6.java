package Interfaces.lambda;
import java.util.*;

public class lambda_sample_6 {
    public static void main(String[] args) {
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

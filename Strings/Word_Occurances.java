package Strings;
import java.util.*;
/*
    Word Occurrence Sorting: Given a word A and multiple texts, output the texts in ascending order
    based on the number of occurrences of word A in them.

    Inputs
    "the cat sat on the mat"
    "cat cat cat"
    "dog and mouse"
    "concatenate the strings"
    "a scatter of cats"

    Outputs
    dog and mouse=0
    the cat sat on the mat=1
    concatenate the strings=1
    a scatter of cats=2
    cat cat cat=3

 */

public class Word_Occurances {
    public static void main(String[] args) {
        String[] s = {"the cat sat on the mat", "cat cat cat","dog and mouse", "concatenate the strings", "a scatter of cats"};
        String word = "cat";

        //Maps All the Strings and the Frequencies of 'word' they got
        Map<String, Integer> map = new HashMap<>();

        for(String i:s){
            String[] c = i.split(" ");
            for(String j:c){
                if(j.contains(word)){
                    map.put(i,map.getOrDefault(i,0)+1);
                }else{
                    map.put(i,map.getOrDefault(i,0));
                }
            }
        }

        // To sort in Ascending Order
        List<Map.Entry<String,Integer>> entries = new ArrayList<>(map.entrySet());
        // Using Comparator for natural order sorting
        entries.sort(Map.Entry.comparingByValue());

        //Print Solution - Ascending
        System.out.println("Solution in Ascending Frequencies: ");
        for(Map.Entry<String, Integer> entry : entries){
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        System.out.println();

        //To Sort in Descending Order
        System.out.println("Solution in Descending Frequencies: ");
        //Using Comparator for Descending Order
        entries.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
        for(Map.Entry<String, Integer> entry : entries){
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}

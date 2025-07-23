package Strings;
import java.util.*;

//The quick brown fox jumps over the dog --> False
//The quick brown fox jumps over the lazy dog --> True

public class Panagram {
    public static void main(String[] args) {
        String s = s = "The quick brown fox jumps over the lazy dog";
        Set<Character> set = new HashSet<>();
        for(char c = 'a' ; c<='z' ; c++){
            set.add(c);
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            set.remove(c);
        }
        if(set.isEmpty()){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
package Strings;

import java.util.Arrays;

class longest{
    public static String prefix(String[] array){
        Arrays.sort(array);
        String out = "";
        for (int i = 0; i <= array[0].length()-1; i++) {
            for (int j = 0; j <= array[array.length-1].length()-1 ; j++) {
                if(array[0].toLowerCase().charAt(i) == array[array.length-1].toLowerCase().charAt(j)){
                    out+=array[0].charAt(i);
                }
            }
        }
        return out;
    }
}

public class longest_common_prefix {
    public static void main(String[] args) {
        String[] user = {"Jashveen", "Jash" , "Ashveen"};
        String result = longest.prefix(user);
        System.out.print(result);
    }
}

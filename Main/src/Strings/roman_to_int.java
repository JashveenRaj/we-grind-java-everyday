package Strings;

import java.util.*;

public class roman_to_int {
    public static void main(String[] args) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        String num = "MCMXCIV"; //1994
        int out = 0 ;
        for(int i = 0 ; i<num.length() ; i++){
            int n1 = map.get(num.charAt(i));
            if(i+1<num.length()){
                int n2 = map.get(num.charAt(i+1));
                if(n2>n1){
                    out += n2-n1;
                    i++;
                }else{
                    out+=n1;
                }
            }else{
                out+=n1;
            }
        }
        System.out.println(out);
    }
}
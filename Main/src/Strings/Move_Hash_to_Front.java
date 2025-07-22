package Strings;

import java.util.*;

public class Move_Hash_to_Front {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String s1 = "";
        String s2 = "";

        for(int i = 0 ; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='#') {
                s1 += c;
            }else if (c!='#'){
                s2+= c;
            }
        }
        System.out.println(s1+s2);
    }
}

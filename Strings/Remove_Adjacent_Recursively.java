package Strings;
import java.util.*;

// abbaca --> aaca --> ca
// azxxzy --> azzy --> ay

public class Remove_Adjacent_Recursively {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        StringBuilder sb = new StringBuilder(s1);

        while(true){
            boolean flag = false;
            for (int i = 0; i < sb.length()-1; i++) {
                if(sb.charAt(i) == sb.charAt(i+1)){
                    sb.delete(i,i+2);
                    flag = true;
                }
            }
            if(flag == false){
                System.out.println(sb);
                break;
            }
        }
    }
}

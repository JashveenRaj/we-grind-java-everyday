package Strings;
import java.util.Scanner;

class count{
    public static int chars(String str){
        int count = 0 ;
        for(int i = 0 ; i < str.length() ; i++){
            if(str.toLowerCase().charAt(i)=='e'){
                count++;
            }
        }
        return count;
    }
}

public class count_repeated_chars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int result = count.chars(s);
        System.out.println(result);
    }
}

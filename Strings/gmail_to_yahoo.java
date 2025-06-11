package Strings;

import java.util.Arrays;

public class gmail_to_yahoo {
    public static void main(String[] args) {
        String[] strings = {"alice@gmail.com" , "charlie@yahoo.com" , "summa@gmail.com", "test@yahoo.com"};
        int count = 0;
        for(int i = 0 ; i< strings.length ; i++){
            if(strings[i].contains("@gmail")){
                count++;
                strings[i] = strings[i].replace("gmail" , "yahoo");
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(strings));
    }
}

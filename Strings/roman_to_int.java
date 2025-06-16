package Strings;

class convert{
    public static int conv(char c){
        switch(c){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }
}

public class roman_to_int {
    public static void main(String[] args) {
        String input = "XIV";
        int out = 0;

        for(int i = 0 ; i< input.length() ; i++){
            char c = (char) convert.conv(input.charAt(i));
            if(i+1<input.length()){
                char c1 = (char) convert.conv(input.charAt(i+1));
                if (c1 > c) {
                    out += c1 - c;
                    i++;
                } else {
                    out += c;
                }
            }
            else{
                out+=c;
            }
        }
        System.out.println(out);
    }
}
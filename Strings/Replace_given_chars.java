package Strings;

public class Replace_given_chars {
    public static void main(String[] args) {
        String s1 = "apple";
        StringBuilder sb = new StringBuilder(s1);
        char c1 = 'a';
        char c2 = 'p';
        for(int i = 0 ; i<s1.length(); i++){
            if(s1.charAt(i)==c1){
                sb.setCharAt(i,c2);
            }else if(s1.charAt(i)==c2){
                sb.setCharAt(i,c1);
            }
        }
        System.out.println(sb);
    }
}

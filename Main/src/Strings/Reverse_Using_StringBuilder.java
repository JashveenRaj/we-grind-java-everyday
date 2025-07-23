package Strings;

public class Reverse_Using_StringBuilder {
    public static void main(String[] args) {
        String s = "Jashveen";
        StringBuilder sb = new StringBuilder(s);
        int n = s.length();

        for(int i = 0 ; i<n/2 ; i++){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(n-1-i));
            sb.setCharAt(n-1-i,temp);
        }
        System.out.println(sb);
    }
}

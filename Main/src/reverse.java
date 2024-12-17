// public class string_reverse{
//     public static String abc(String s){

//         StringBuilder sb = new StringBuilder(s);
//         String rev = sb.reverse().toString();
//         return rev;
//     }

//     public static void main(String[] args) {
        
//         String s = "Nigga";
//         System.out.println(s.length()-1);
//         System.out.println("Original String: " + s);
//         System.out.println("Reversed: " + abc(s));

//     }
// }

public class reverse{
    public static String abc(String s){

        StringBuilder sb = new StringBuilder();
        for (int i = s.length()-1 ; i>=0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "Nigga";
        System.out.println("Original: " + s);
        System.out.println("Reverse: " + abc(s));
    }
}

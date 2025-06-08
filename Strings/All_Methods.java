package Strings;

public class All_Methods {
    public static void main(String[] args) {
        String s = " Oviyan T ";
        System.out.println(s.charAt(3));
        System.out.println(s.chars());
        System.out.println(s.codePointAt(3));
        System.out.println(s.codePointBefore(3));
        System.out.println(s.codePointCount(1,5));
        System.out.println(s.codePoints());
        System.out.println(s.compareTo("Nigga"));
        System.out.println(s.compareToIgnoreCase("oViyAN t"));
        System.out.println(s.concat("Tamilarasan"));
        System.out.println(s.contains("a"));
        System.out.println(s.contentEquals("yan"));
        System.out.println(s.describeConstable());
        System.out.println(s.endsWith("yan"));
        System.out.println(s.equals("harioviyan"));
        System.out.println(s.equalsIgnoreCase("DeidEi"));
        System.out.println(s.getBytes());
    }
}

package Patterns;//_ _ _ _
//_ _ _ _
//_ _ __
//_ ___
//____

public class joining_lines {
    public static void main(String[] args) {
        int a = 4;
        for (int i = 0; i < a+1 ; i++) {
            for (int j = 0; j < a-i; j++) {
                System.out.print("_");
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("_");
            }
            System.out.println();
        }
    }
}

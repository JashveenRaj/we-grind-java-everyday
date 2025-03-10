package Patterns;

public class rhombus_slanting_right {
    public static void main(String[] args) {
        for (int i = 5; i >0; i--) {
            System.out.print(" ".repeat(i));
            for(int j = 0 ; j < 5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

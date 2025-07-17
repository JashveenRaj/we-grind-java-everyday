package Object_Oriented_Programming;

import java.util.Scanner;

class NotValid extends RuntimeException{
    NotValid(String msg){
        System.out.println(msg);
    }
}
public class custome_exception2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        if(inp<=0){
            throw new NotValid("Pichakara koodhi");
        }
    }
}

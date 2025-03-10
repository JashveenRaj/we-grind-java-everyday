package scenario_questions;
import java.util.*;

public class student_attendence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size: ");
        int length = scanner.nextInt();
        scanner.nextLine();
        String[] a = new String[length];
        for(int i = 0 ; i< length; i++){
            a[i] = scanner.nextLine();
        }

        System.out.println("Enter size: ");
        int length2 = scanner.nextInt();
        scanner.nextLine();
        String[] b = new String[length2];
        for(int i = 0 ; i< length2; i++){
            b[i] = scanner.nextLine();
        }

        System.out.println("First Array: " + Arrays.toString(a));
        System.out.println("Second Array: " + Arrays.toString(b));

        int index = 0;
        String[] c = new String[a.length+b.length];

        for(String string: a){
            c[index++] = string;

        }
        for(String string:b){
            c[index++] = string;
        }

        System.out.println(Arrays.toString(c));
    }
}

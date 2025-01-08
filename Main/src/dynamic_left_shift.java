import java.util.Scanner;

class dynamic2{
    public static int[] left_shift(int[] array , int rotation){
        for (int i = 1; i <=rotation ; i++) {
            int temp = array[0];
            for (int j = 0; j < array.length-1 ; j++) {
                array[j] = array[j+1];
            }
            array[array.length-1] = temp;
        }
        return array;
    }
}

public class dynamic_left_shift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = {1,2,3,4,5};
        System.out.print("Enter no of places you want to shift: ");
        int no_of_rotations = scanner.nextInt();
        int[] result = dynamic2.left_shift(a, no_of_rotations);

        System.out.print("Shifted array: ");
        for(int i : result){
            System.out.print(i + " ");
        }
    }
}

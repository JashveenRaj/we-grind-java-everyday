package Arrays;
import java.util.Arrays;
import java.util.Scanner;

class insert{
    public static int[] moveforward(int[] array , int index, int value){
        int[] newarr = new int[array.length+1];
        int newindex = 0;
        for (int i = 0; i <= array.length-1; i++) {
            if(i == index) {
                int temp = array[i];
                newarr[newindex] = value;
                newindex++;
                newarr[newindex] = temp;
                newindex++;
            }else{
                newarr[newindex] = array[i];
                newindex++;
            }
        }
        return newarr;
    }
}

public class insert_and_move_forward {
    public static void main(String[] args) {
        int[] a = {1,2,4,5};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an index: ");
        int user_index = scanner.nextInt();
        System.out.print("Enter an number: ");
        int user_value = scanner.nextInt();

        System.out.println("Original Array: " + Arrays.toString(a));
        int[] result = insert.moveforward(a, user_index , user_value);
        System.out.print("Modified Array: " + Arrays.toString(result));
    }
}

import java.util.Scanner;

class dynamic{
    public static int[] right_shift(int[] array , int rotation){
        for(int i=1; i<=rotation ; i++){
            int temp = array[array.length-1];
            for (int j = array.length-1; j > 0 ; j--) {
                array[j] = array[j-1];
            }
            array[0] = temp;
        }
        return array;
    }
}


public class dynamic_right_shifting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = {1,2,3,4,5};
        System.out.print("Enter No of Places You Want to Shift: ");
        int no_of_rotation = scanner.nextInt();
        int[] result = dynamic.right_shift(a,no_of_rotation);
        
        for(int i: result){
            System.out.print(i + " ");
        }
    }
}

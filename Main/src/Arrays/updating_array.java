import java.util.Scanner;

class update{
    public static int[] array(int[] array, int index , int value){
        if(index>=0 && index<=array.length-1){
            for (int i = 0; i < array.length-1 ; i++) {
                if(i==index){
                    array[i] = value;
                }
            }
        }
        return array;
    }
}


public class updating_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index where you want to update the value: ");
        int user_index = scanner.nextInt();
        System.out.print("Enter the value for element you want to update: ");
        int user_value = scanner.nextInt();

        int[] a = {1,2,3,4,5};

        if (user_index >= a.length || user_index < 0) {
            System.out.println("Enter a valid index no !!");
            return;
        }

        int[] result = update.array(a , user_index , user_value);
        for(int i : result){
            System.out.print(i + " ");
        }
    }
}

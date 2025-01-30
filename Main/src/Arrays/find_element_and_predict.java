package Arrays;
import java.util.Scanner;

/*Given a sorted array and a target find the target in the array if not found,
find where the target would be if it was in the array.*/

class find_element{
    public static int predict(int[] a, int num){
        int out = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == num){
                out = i;
            }else if(a[i]<num){
                out = i+1;
            }
        }
        return out ;
    }
}

public class find_element_and_predict {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter values: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        int result = find_element.predict(arr, target);
        System.out.println(result);
    }
}

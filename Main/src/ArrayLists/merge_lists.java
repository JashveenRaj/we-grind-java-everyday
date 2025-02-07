package ArrayLists;
import java.util.*;

public class merge_lists {
    public static void main(String[] args){
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of the ArrayList: ");
        int size = scanner.nextInt();

        System.out.println("Enter values for the first ArrayList: ");
        for(int i = 0 ; i<size ; i++){
            int num = scanner.nextInt();
            arr1.add(num);
        }
        System.out.println("ArrayList1: " + arr1);
        System.out.println();

        System.out.println("Enter size of the ArrayList: ");
        int size2 = scanner.nextInt();

        System.out.println("Enter values for the Second ArrayList: ");
        for(int i = 0 ; i<size2 ; i++){
            int num = scanner.nextInt();
            arr2.add(num);
        }
        System.out.println("ArrayList2: " + arr2);
        System.out.println();

        System.out.println("Final Merged ArrayList: ");
        for(int i = 0 ; i<arr2.size() ; i++){
            arr1.add(arr2.get(i));
        }
        System.out.println(arr1);
    }
}

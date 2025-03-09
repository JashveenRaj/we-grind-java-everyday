package ArrayLists;
import java.util.*;

public class remove_duplicates {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        for(int i = 0 ; i<5 ; i++){
            arr.add(scanner.nextInt());
        }
        int num = scanner.nextInt();
        for(int i = 0 ; i<arr.size() ; i++){
            if(arr.get(i) == num){
                arr.remove(i);
            }
        }
        System.out.println(arr);
    }
}

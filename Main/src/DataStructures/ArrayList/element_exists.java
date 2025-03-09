package ArrayLists;
import java.util.*;

public class element_exists {
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<String>(Arrays.asList("apple" , "orange" , "watermelon"));
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();
        boolean flag = false;
        int index = 0;
        for(int i = 0 ; i<arr.size() ; i++){
            if(arr.get(i).equals(s)){
                flag = true;
                index = i ;
            }
        }
        if(flag){
                System.out.println("Element exists in the index: " + index);
        }else{
                System.out.println("Element doesn't exist in the given ArrayList");
        }
    }
}

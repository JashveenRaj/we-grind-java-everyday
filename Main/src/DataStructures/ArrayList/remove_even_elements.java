package ArrayLists;
import java.util.*;

public class remove_even_elements {
     public static void main(String[] args){
         ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8));
         for(int i = 0 ; i < arr.size() ; i++){
             if((arr.get(i))%2 == 0){
                 arr.remove(i);
             }
         }
         System.out.println(arr);
     }
}

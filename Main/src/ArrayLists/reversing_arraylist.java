package ArrayLists;
import java.util.*;

public class reversing_arraylist {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(5,4,3,2,1));
        for(int i = 0 ; i<arr.size()/2 ; i++){
            int temp = arr.get(i);
            arr.set(i , arr.get(arr.size()-1-i));
            arr.set(arr.size()-1-i , temp);
        }
        System.out.println(arr);

        //We can simply use Collections.reverse to do this shit.
        //      Collections.reverse(arr);
        //      System.out.println(arr);
    }
}

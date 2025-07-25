package Arrays;
import java.util.*;

public class Search_Element {
    public static void main(String[] args) {
        int[] arr ={2,4,2,5,9,6,3};
        int n = 9;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length ; i++){
            if(!map.containsKey(arr[i]))
                map.put(arr[i],i);
        }

        if(map.containsKey(n)){
            System.out.println(map.get(n));
        }else{
            System.out.println(-1);
        }
    }
}

package ArrayLists;
import java.util.*;

public class finding_maximum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr  = new ArrayList<Integer>(Arrays.asList(5,6,9,7,4,2,3,6,8));
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i <arr.size() ; i++){
            if(arr.get(i)>max){
                max = arr.get(i);
            }
        }
        System.out.println(max);
    }
}

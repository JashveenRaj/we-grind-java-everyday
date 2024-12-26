import java.util.ArrayList;
import java.util.Arrays;

class bubble{
    public static int sort (ArrayList<Integer> a){
        int n = a.size();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1 ; j++) {
                if(a.get(j) > a.get(j+1)){
                    
                }
            }
        }return 0;
    }
}

public class bubble_sort{
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,5,6,9,8,7,6,5,4));
        int result = bubble.sort(arrayList);
        System.out.println(result);
    }
}
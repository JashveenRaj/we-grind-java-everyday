package Arrays;
import java.util.*;

/* 2, 2, 3, 3, 7, 5 -----> 2, 3, 7, 5 */

class Solution2 {
    static ArrayList<Integer> remDuplicate(int arr[]) {
        ArrayList<Integer> l = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        for(int i : arr){
            if(map.get(i)!=0){
                l.add(i);
                map.put(i,0);
            }
        }
        return l;
    }
}
public class remove_duplicates_in_an_array2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(Solution2.remDuplicate(arr));
    }
}

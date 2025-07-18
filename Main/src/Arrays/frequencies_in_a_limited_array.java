package Arrays;
import java.util.*;

/*
    Input: arr[] = [2, 3, 2, 3, 5]
    Output: [0, 2, 2, 0, 1]

*/

class Solution3 {
    public static List<Integer> frequencyCount(int[] arr) {
        // code here
        List<Integer> l = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=1;i<=arr.length;i++){
            map.put(i,map.getOrDefault(i,0));
        }
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            l.add(entry.getValue());
        }
        return l;
}
}

public class frequencies_in_a_limited_array {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
        a[i]= scanner.nextInt();
    }
    System.out.println(Solution3.frequencyCount(a));
}
}

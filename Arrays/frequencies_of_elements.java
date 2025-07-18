package Arrays;
import java.util.*;

public class frequencies_of_elements {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s1.nextInt();
        }
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put( arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        System.out.println(map);
    }
}

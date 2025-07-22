package Arrays;
import java.util.*;

class Solution5 {
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        int result = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>(n/2)){
                result = entry.getKey();
            }
        }
        return result;
    }
}

public class Majority_Element {
    public static void main(String[] args) {
        int[] num = {1,2,1,3,4,1,3,3,6,5,4};
        System.out.println(Solution5.majorityElement(num));
    }
}

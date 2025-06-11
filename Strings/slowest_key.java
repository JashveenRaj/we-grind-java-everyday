package Strings;

class Solution {
    public static char slowestKey(int[] releaseTimes, String keysPressed) {
        char[] c = keysPressed.toCharArray();
        int max = releaseTimes[0];
        char ch = c[0];
        for(int i = 1 ; i<releaseTimes.length ; i++){
            int curr = releaseTimes[i]-releaseTimes[i-1];
            if(curr>max||(curr==max && c[i]>ch)){
                max = curr;
                ch = c[i];
            }
        }
        return ch;
    }
}

public class slowest_key {
    public static void main(String[] args) {
        int[] arr = {12,23,36,46,62};
        String s = "spuda";
        System.out.println(Solution.slowestKey(arr,s));
    }
}

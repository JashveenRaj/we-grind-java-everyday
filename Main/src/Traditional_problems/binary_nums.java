package Traditional_problems;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class binary_nums {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        ArrayList<Integer> arr = new ArrayList<>();
        while(n!=0){
            arr.add(n%2);
            n=n/2;
        }
        System.out.println(arr);
        int l = 0;
        int r = 1;
        int count = 1 ;
        while(l<r && r<arr.size()){
            if(arr.get(l) == 1 && arr.get(r)==1){
                count++;
            }
            l++;
            r++;
        }
        if(count==0){
            System.out.println(count+1);
        }else{
            System.out.println(count);
        }
    }
}

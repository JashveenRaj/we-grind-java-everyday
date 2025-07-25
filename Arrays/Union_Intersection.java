package Arrays;
import java.util.*;

public class Union_Intersection {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {5,3,6,7,8};
        Set<Integer> s = new HashSet<>();

        for(int i:a){
            s.add(i);
        }
        for(int i:b){
            s.add(i);
        }
        System.out.println("Union: ");
        for(int i:s){
            System.out.print(i +" ");
        }
        s.clear();

        for(int i : a){
            s.add(i);
        }
        System.out.println();
        System.out.println("Intersection: ");
        for(int i : b){
            if(s.contains(i)){
                System.out.print(i + " ");
            }
        }
    }
}

package ArrayLists;
import java.util.*;

public class two_dimensional_arraylist {
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> twoD_ArrayList = new ArrayList<ArrayList<Integer>>();

        //Main List or Outer List
        ArrayList<Integer> main_list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        twoD_ArrayList.add(main_list);

        //Sub List or Inner List
        ArrayList<Integer> sub_list = new ArrayList<Integer>(Arrays.asList(5,4,3,2,1));
        twoD_ArrayList.add(sub_list);

        System.out.println(twoD_ArrayList);
    }
}
package Arrays;

import java.util.ArrayList;

public class arr_list {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(8);
        arrayList.add(3,5);
        System.out.println(arrayList.size());
        System.out.println(arrayList);
    }
}

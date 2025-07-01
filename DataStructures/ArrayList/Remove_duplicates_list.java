package DataStructures.ArrayList;
import java.util.*;

public class Remove_duplicates_list {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size: ");
        int n = scanner.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            arrayList.add(i,scanner.nextInt());
        }

        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
        for(int i:arrayList){
            hashSet.add(i);
        }

        System.out.println(hashSet);
    }
}

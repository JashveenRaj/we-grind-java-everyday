package DataStructures.HashSet;
import java.util.HashSet;

public class basics {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(23);
        System.out.println(hashSet.hashCode());
    }
}

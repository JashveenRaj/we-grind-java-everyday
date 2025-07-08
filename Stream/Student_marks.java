package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Student_marks {
    public static void main(String[] args) {
        ArrayList<Integer> a= new ArrayList<>();
        a.add(45);
        a.add(63);
        a.add(65);
        a.add(23);
        a.add(34);
        a.add(95);
        a.add(37);

        List<Integer> l1 = a.stream().filter((x)->x<35).toList();
        System.out.println("Students with marks less than 35: " + l1);

        List<Integer> l2 = a.stream().sorted().map((x)->x+5).toList();
        System.out.println("Ascending order of marks after +5 grace marks: " + l2);

        Comparator<Integer> comparator = (o1,o2)->o1-o2;
        System.out.println("MAX: " + a.stream().max(comparator).get());
        System.out.println("MIN: " + a.stream().min(comparator).get());
    }
}

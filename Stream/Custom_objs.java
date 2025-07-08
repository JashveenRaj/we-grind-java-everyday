package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student{
    String name;
    int id;

    Student(String name , int id){
        this.name = name;
        this.id = id;
    }

    public String toString(){
        return "Name: " + name  + " , Id: " + id;
    }
}
public class Custom_objs {
    public static void main(String[] args) {
        ArrayList<Student> a = new ArrayList<>();
        a.add(new Student("Jash", 105));
        a.add(new Student("Magi", 102));
        a.add(new Student("Jaya", 101));
        a.add(new Student("Deepak", 103));
        a.add(new Student("Lakshmi", 104));
        for(Object o : a){
            System.out.println(o);
        }

        Comparator<Student> comparator = (o1,o2)->o1.id-o2.id;
        List<Student> l1 = a.stream().sorted(comparator).toList();
        System.out.println(l1);

        Comparator<Student> comparator1 = ((o1,o2)->o1.name.compareToIgnoreCase(o2.name));
        List<Student> l2 = a.stream().sorted(comparator1).toList();
        System.out.println(l2);
    }
}

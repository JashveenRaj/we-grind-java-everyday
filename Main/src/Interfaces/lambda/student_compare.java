package Interfaces.lambda;

import java.util.ArrayList;
import java.util.Collections;

class Student{
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public int compareTo(Student o){
        return this.id-o.id;
    }
}
public class student_compare {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student("Jash" , 101));
        arrayList.add(new Student("Jaya",102));
        arrayList.add(new Student("Deepak",103));

        Collections.sort(arrayList,((o1,o2)-> (o1.name.compareToIgnoreCase(o2.name))));
        for(Object o:arrayList){
            System.out.println(o);
        }
    }
}

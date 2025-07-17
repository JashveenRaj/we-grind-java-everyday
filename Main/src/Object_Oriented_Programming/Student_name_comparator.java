package Object_Oriented_Programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class student {
    String name;
    int id;

    student(String name, int id){
        this.name=name;
        this.id=id;
    }

    public String toString(){
        return "Student[ name: " + name + ", id: " + id+"]";
    }
}

class Summa implements Comparator<student> {
    public int compare(student s1, student s2){
        return s1.name.compareToIgnoreCase(s2.name);
    }
}

public class Student_name_comparator {
    public static void main(String[] args) {
        ArrayList<student> arrayList2 = new ArrayList<student>();
        arrayList2.add(new student("Jash",101));
        arrayList2.add(new student("Deepak",103));
        arrayList2.add(new student("Jaya",102));
        Collections.sort(arrayList2, new Summa() );
        for(student a : arrayList2){
            System.out.println(a);
        }
    }
}

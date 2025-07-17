package DataStructures.HashSet;
import java.util.*;
import java.util.HashSet;

class Student{
    String name;
    int id;

    Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String toString(){
        return "name: " + name + " id: " + id;
    }

    public boolean equals(Object o){
        Student student = (Student)o;
        return this.name.equals(student.name) && this.id== student.id;
    }

    public int hashCode() {
        return Objects.hash(name,id);
    }
}

public class custom_object_hashset {
    public static void main(String[] args) {
        java.util.HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(new Student("Jash" , 101));
        hashSet.add(new Student("Jash" , 101));
        System.out.println(hashSet);
    }
}

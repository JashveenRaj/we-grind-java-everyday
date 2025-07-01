import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int sid;
    String blood;

    Student(String name, int sid, String blood){
        this.name = name;
        this.sid = sid;
        this.blood = blood;
    }

    @Override
    public String toString(){
        return "name: " + name + " ,sid: " + sid + " ,blood: " + blood;
    }

    @Override
    public boolean equals(Object obj) {
        Student student = (Student) obj;
        return this.sid == student.sid && this.name.equals(student.name) && this.blood.equals(student.blood);
    }
}

public class searching_object{
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Student("Ramesh" , 101 , "O+ve") );
        arrayList.add(new Student("Suresh" , 102 , "A+ve") );
        arrayList.add(new Student("Rajesh" , 103 , "O-ve") );

        for (Object student : arrayList) {
            System.out.println(student);
        }

        Student searchStudent = new Student("Ramesh", 101, "O+ve");

        if (arrayList.contains(searchStudent)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

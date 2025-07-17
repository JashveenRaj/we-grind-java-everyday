//package Object_Oriented_Programming;
//
//import java.util.ArrayList;
//import java.util.Collections;
//
//class Student2{
//    String name;
//    int id;
//
//    Student2(String name, int id){
//        this.name=name;
//        this.id=id;
//    }
//
//    public String toString(){
//        return "Student[ name: " + name + ", id: " + id+"]";
//    }
//
//    public int compareTo(Object o){
//        Student2 student2 = (Student2)o;
//        if(this.id>student2.id){
//            return 1;
//        }
//        if(this.id<student2.id){
//            return -1;
//        }
//        return 0;
//    }
//
//}
//public class Student_compareTo {
//    public static void main(String[] args) {
//        ArrayList<Student2> arrayList = new ArrayList<Student2>();
//        arrayList.add(new Student2("Jash",101));
//        arrayList.add(new Student2("Deepak",103));
//        arrayList.add(new Student2("Jaya",102));
//        Collections.sort(arrayList);
//        for(Student2 a :arrayList){
//            System.out.println(a);
//        }
//    }
//}

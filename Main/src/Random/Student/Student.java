package Random.Student;

    public class Student {
    String name;
    int age;
    int id;
    int marks;
    int regno;
    String stream;

    Student(String name, int age, int id, int marks, int regno, String stream) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.marks = marks;
        this.regno = regno;
        this.stream = stream;
    }
}

class main{
    public static void main(String[] args) {
        Student s3 = new Student("Bob", 21, 101, 90, 20231234, "Science");
    }
}

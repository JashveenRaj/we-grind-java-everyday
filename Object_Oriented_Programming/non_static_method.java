package Object_Oriented_Programming;

class Student{
    String sname;
    int rollno;
    int[] marks = new int[4];

    public void getAvg(){// This is a non-static method not a constructor
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum+=marks[i];
        }
        for(int i : marks){
            System.out.println(i);
        }
        System.out.println(sum/marks.length);
    }
}

public class non_static_method {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        //Student 1
        s1.sname = "Vamsi";
        s1.rollno = 101;
        for (int i = 0; i < s1.marks.length; i++) {
            s1.marks[i] = (int)(Math.random()*100);
        }
        s1.getAvg();
    }
}

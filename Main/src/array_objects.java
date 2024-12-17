class Students{

	String name;
	int marks;
	int roll;
}

public class array_objects{
	public static void main(String[]args){
		Students s1 = new Students();
		s1.name = "naveen";
		s1.marks = 50;
		s1.roll = 516;

		Students s2 = new Students();
		s2.name = "rubesh";
		s2.marks = 60;
		s2.roll = 526;

		Students s3 = new Students();
		s3.name = "robin";
		s3.marks = 65;
		s3.roll = 536;

		// This will just print their memory address
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		Students students[] = new Students[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
		for(int i=0;i<students.length;i++){
			System.out.println(students[i].name + ":" + students[i].marks + ":" + students[i].roll);
		}
	}
}

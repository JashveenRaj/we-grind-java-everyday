package Stream;
import java.util.*;

class Employee2{
    String name;
    int age;
    int id;
    String dept;
    double salary;

    public Employee2(String name,int age, int id, String dept, double salary) {
        this.name = name;
        this.age= age;
        this.id = id;
        this.dept = dept;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class Custom_obj_stream {
    public static void main(String[] args) {
        ArrayList<Employee2> a = new ArrayList<>();
        a.add(new Employee2("John" , 25,12,"development",25000));
        a.add(new Employee2("Mark", 24,121,"Testing", 20000));
        a.add(new Employee2("King",29,139,"Devops",40000));
        a.add(new Employee2("Allen",34,14,"Sales",15000));
        a.add(new Employee2("Smith",31,77,"Testing",21000));

        //Filter the Salary more than 20000
        List<Employee2> l1 = a.stream().filter((x)->x.salary>20000).toList();
        System.out.println("Employees with More than 20000rs as Salary: ");
        for(Employee2 employee2:l1){
            System.out.println(employee2);
        }
        System.out.println();

        //Update double the salary
        List<Employee2> l2 = a.stream().map((e)-> {e.salary=e.salary*2; return e;}).toList();
        System.out.println("Salary Doubled for Everyone: ");
        for(Employee2 d:l2){
            System.out.println(d);
        }
        System.out.println();

        //Sort based on Id
        List<Employee2> l3 = a.stream().sorted(((o1,o2)->o1.id-o2.id)).toList();
        System.out.println("Employees sorted based on ID: ");
        for(Employee2 employee2:l3){
            System.out.println(employee2);
        }
        System.out.println();

        //Min
        System.out.println("MIN Age: " + a.stream().min(((o1,o2)->o1.age-o2.age)));
        System.out.println();

        //Max
        System.out.println("MAX Salary with casting: " + a.stream().max(((o1,o2)-> (int) (o1.salary-o2.salary))));
        System.out.println();

        //Max
        Comparator<Employee2> comparator = (o1,o2)->{
            if(o1.salary>o2.salary)
                return 1;
            if(o1.salary<o2.salary)
                return -1;

            return 0;
        };
        System.out.println("MAX Salary without casting: " + a.stream().max(comparator));
        System.out.println();

        //Count
        System.out.println("No of Employees: " + a.stream().count());
        System.out.println();
    }
}
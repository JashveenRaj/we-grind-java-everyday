package Object_Oriented_Programming;

import java.util.Scanner;

class Employee {
    String name;
    int age;
    double height;
    public void application(){
        if((age<35 && age > 18) && (height>5.4)){
            System.out.println("Your eligible " + name + " ☺️");
        }else{
            System.out.println("Your not eligible " + name + " 😢");
        }
    }
}

public class job_application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e1 = new Employee();

        System.out.print("Enter your name: ");
        e1.name = sc.nextLine();
        System.out.print("Enter your age: ");
        e1.age = sc.nextInt();
        System.out.print("Enter your height (in decimal): ");
        e1.height = sc.nextDouble();
        e1.application();
    }
}
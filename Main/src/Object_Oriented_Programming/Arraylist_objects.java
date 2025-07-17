package Object_Oriented_Programming;
import java.util.*;

class Employeee implements Comparable<Employeee>{
    String name;
    int id;
    Employeee(String name , int id){
        this.name = name;
        this.id = id;
    }

    public String toString(){
        return "Name: " + name + " id: " + id;
    }

//    public int compareTo(Employeee o){
//        return this.name.compareToIgnoreCase(o.name);
//    }

    public boolean equals(Object obj){
        Employeee employeee = (Employeee)obj;
        if(!(this.name.equalsIgnoreCase(employeee.name))){
            return false;
        }
        if(this.id != employeee.id){
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Employeee o) {
        Employeee employee = (Employeee)o;
        if(this.id > employee.id){
            return 1;
        }else if(this.id< employee.id){
            return -1;
        }
        return 0;
    }
}

public class Arraylist_objects {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Employeee("Nigga" , 101));
        list.add(new Employeee("Gigga" , 104));
        list.add(new Employeee("Chigga" , 103));

        Collections.sort(list);
        System.out.println(list);

        Employeee suma = new Employeee("Nigga", 101);
        System.out.println(list.contains(suma)); //without overriding equals we'll get false


    }
}

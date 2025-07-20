package DataStructures.HashMaps;
import java.util.*;

public class Contacts {
    public static void main(String[] args) {
        Map<String, Long> map = new HashMap<>();
        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.println();
            System.out.println("Welcome to Contacts App: ");
            System.out.println("1. View Saved Contact");
            System.out.println("2. Add Contact");
            System.out.println("3. Remove Contact");
            System.out.println("4. Find Contact");
            System.out.println("5. Exit");
            System.out.println();

            int n = s.nextInt();
            switch (n){
                case 1:
                    for(Map.Entry<String , Long> entry : map.entrySet()){
                        System.out.println(entry.getKey() + " : " + entry.getValue());
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Enter Name: ");
                    s.nextLine();
                    String name = s.nextLine();
                    System.out.println("Enter Phn.No: ");
                    long num = s.nextLong();
                    map.put(name,num);
                    System.out.println("Contact Added Successfully");
                    break;

                case 3:
                    System.out.println("Enter the name of the contact: ");
                    s.nextLine();
                    String name_to_remove = s.nextLine();
                    map.remove(name_to_remove);
                    System.out.println("Contact removed Successfully");
                    break;

                case 4:
                    System.out.println("Enter the name to Search: ");
                    s.nextLine();
                    String nameSearch = s.nextLine();
                    System.out.println(map.get(nameSearch));
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}

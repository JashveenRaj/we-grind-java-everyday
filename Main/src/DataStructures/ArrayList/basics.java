package ArrayLists;
import java.util.*;

class list{

    ArrayList<String> grocery_list = new ArrayList<>();

    public void disp(){
        if(grocery_list.size()==0){
            System.out.println("Your list is empty !");
        }else{
            for(int i = 0 ; i<grocery_list.size() ; i++){
                System.out.println(i + ". " + grocery_list.get(i));
            }
        }
    }

    public void addItem(int n , String item){
        if(n==0){
            grocery_list.add(n,item);
        }else{
            grocery_list.add(item);
        }
    }

    public void remove(int rem){
        grocery_list.remove(rem);
    }

    public void length(){
        System.out.println(grocery_list.size());
    }

    public void findIndex(String thing){
        boolean found = false;
        String index = "";
        for(String i: grocery_list){
            if(i.toLowerCase().equals(thing.toLowerCase())) {
                found = true;
                index = i;
                break;
            }
        }
        if(found){
            System.out.println(thing + "is at: " + grocery_list.indexOf(index) + "of the list");
        }else{
            System.out.println("Not Found !");
        }
    }
}

public class basics{
    public static void main(String[] args) {

        list list = new list();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("\n---------List of Operations---------");
            System.out.println("1.Display List");
            System.out.println("2.Add Items");
            System.out.println("3.Remove Items");
            System.out.println("4.Find Item's no");
            System.out.println("5.Total no of Items");
            System.out.println("6.Exit");
            System.out.println("------------------------------------");
            System.out.println();

            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            System.out.println();

            switch(choice){
                case 1:
                    list.disp();
                    break;
                case 2:
                    System.out.println("Enter Item: ");
                    scanner.nextLine();
                    String item = scanner.nextLine();
                    System.out.println("Add to top ? (0 for yes, 1 for no): ");
                    int top = scanner.nextInt();
                    list.addItem(top,item);
                    System.out.println("Item added !");
                    break;
                case 3:
                    list.disp();
                    System.out.println();
                    System.out.println("Enter the item number to remove: ");
                    int rem = scanner.nextInt();
                    list.remove(rem);
                    System.out.println("Item removed !");
                    break;
                case 4:
                    System.out.println("Enter Item you want to find: ");
                    scanner.nextLine();
                    String thing = scanner.nextLine();
                    list.findIndex(thing);
                    break;
                case 5:
                    list.length();
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
}
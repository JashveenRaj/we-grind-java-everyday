package Object_Oriented_Programming.flipkart;

import java.util.Scanner;

public class flipkart {
    public static void main(String[] args) {
        customer customer = new customer();
        product product = new product();
        shipper shipper = new shipper();
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Enter Record");
        System.out.println("2. Exit");
        System.out.println();
        int user = scanner.nextInt();

        switch(user){
            case 1:
                scanner.nextLine();

                System.out.print("Enter purchaser name: ");
                customer.name = scanner.nextLine();

                System.out.print("Enter purchaser phone number: ");
                customer.phone_number = scanner.nextLong();
                scanner.nextLine();

                System.out.print("Enter product name: ");
                product.product_name = scanner.nextLine();

                System.out.print("Enter price: ");
                product.price = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter Shipper name: ");
                shipper.shipper_name = scanner.nextLine();

                System.out.print("Enter shipper number: ");
                shipper.shipper_number = scanner.nextInt();
                scanner.nextLine();

                System.out.println();
                System.out.println("Purchase Invoice: ");
                System.out.println("Customer: " + customer.name);
                System.out.println("Phone number: " + customer.phone_number);
                System.out.println("Product Purchased: " + product.product_name);
                System.out.println("Cost: " + product.price);
                System.out.println("Shipped from: " + shipper.shipper_name);
                System.out.println("Shipper Number: " + shipper.shipper_number);
                break;

            case 2:
                System.exit(0);
                break;

            default:
                System.out.println("Enter valid option");
        }





    }
}

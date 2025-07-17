package Random.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.setBrand("Honda");
        bike.setName("Lakshmi");
        bike.setcc(125);
        System.out.println("Bike CC: " + bike.getcc());
        System.out.println("Bike Brand: " + bike.getBrand());
        System.out.println("Bike name: " + bike.getName());

        System.out.println();

        Car car = new Car();
        car.setBrand("Lambourghini");
        car.setName("Lakshmi");
        System.out.println("Car Brand: " + car.getBrand());
        System.out.println("Car name: " + car.getName());
    }
}

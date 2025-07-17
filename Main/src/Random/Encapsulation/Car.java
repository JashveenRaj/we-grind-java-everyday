package Random.Encapsulation;

public class Car extends Vehicle {
    private String colors;
    private int seats;

    public String getColors(){
        return colors;
    }

    public void setColors(String colors){
        this.colors = colors;
    }

    public int getSeats(){
        return seats;
    }

    public void setSeats(int seats){
        this.seats = seats;
    }
}

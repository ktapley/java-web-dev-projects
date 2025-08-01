package transportation;

public class Boat extends Vehicle{

    private String make;
    private String color;

    public Boat(String type, boolean hasWheels, double occupancy, boolean isPrivatelyOwned) {
        super(type, hasWheels, occupancy, isPrivatelyOwned);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String noise() {
        return "I'm a boat!";
    }
}

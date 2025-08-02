package transportation;

public class Boat extends Vehicle{

    private String make;
    private String color;

    public Boat(String type, String make, String color) {
        super(type);
        this.make = make;
        this.color = color;
    }

    public Boat(String type, boolean hasWheels, int occupancy, boolean isPrivatelyOwned) {
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
        if (getType().contains("boat")) {
            return "Rumble rumble";
        }
        return "Vroom vroom!";
    }
}

package transportation;

public class Plane extends Vehicle{

    private double topSpeed;

    public Plane(String type) {
        super(type);
    }

    public Plane(String type, boolean hasWheels, int occupancy, boolean isPrivatelyOwned) {
        super(type, hasWheels, occupancy, isPrivatelyOwned);
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String flight() {
        if (getType().contains("plane")) {
            return "Ready for liftoff!";
        }
        return "Vroom vroom";
    }
}

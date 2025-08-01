package transportation;

public class Plane extends Vehicle{

    private double topSpeed;

    public Plane(String type, boolean hasWheels, double occupancy, boolean isPrivatelyOwned) {
        super(type, hasWheels, occupancy, isPrivatelyOwned);
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String flight() {
        return "Ready for liftoff!";
    }
}

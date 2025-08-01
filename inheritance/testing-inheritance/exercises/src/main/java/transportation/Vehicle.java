package transportation;

public class Vehicle {

    private String type;
    private boolean hasWheels = true;
    private double occupancy;
    private boolean isPrivatelyOwned = true;

    public Vehicle(String type, boolean hasWheels, double occupancy, boolean isPrivatelyOwned) {
        this.type = type;
        this.hasWheels = hasWheels;
        this.occupancy = occupancy;
        this.isPrivatelyOwned = isPrivatelyOwned;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isHasWheels() {
        return hasWheels;
    }

    public void setHasWheels(boolean hasWheels) {
        this.hasWheels = hasWheels;
    }

    public double getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(double occupancy) {
        this.occupancy = occupancy;
    }

    public boolean isPrivatelyOwned() {
        return isPrivatelyOwned;
    }

    public void setPrivatelyOwned(boolean privatelyOwned) {
        isPrivatelyOwned = privatelyOwned;
    }

    //Returns false if type = boat
    public void canRoll() {
        if (type.contains("boat")) {
            hasWheels = false;
        }
    }

    //If occupancy is < 15 then private owned = true, if > 15 then private owned = false?
    public void privatelyOwned() {
        if (occupancy >= 15) {
            isPrivatelyOwned = false;
        }
    }
}

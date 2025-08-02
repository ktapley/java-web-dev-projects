package transportation;

public class Vehicle {

    private String type;
    private boolean hasWheels;
    private int occupancy;
    private boolean isPrivatelyOwned = true;

    public Vehicle(String type) {
        this.type = type;
    }

    public Vehicle(String type, boolean hasWheels, int occupancy, boolean isPrivatelyOwned) {
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

    public boolean setHasWheels(boolean hasWheels) {
        this.hasWheels = hasWheels;
        return hasWheels;
    }

    public double getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(int occupancy) {
        this.occupancy = occupancy;
    }

    public void setPrivatelyOwned(boolean privatelyOwned) {
        isPrivatelyOwned = privatelyOwned;
    }

    //Returns false if type = boat
    public boolean canRoll() {
        if (type.contains("boat")) {
            return setHasWheels(false);
        }
        return true;
    }

    //If occupancy is < 15 then private owned = true, if > 15 then private owned = false?
    public boolean privatelyOwned(int occupancy) {
        if (occupancy > 15) {
            return isPrivatelyOwned = false;
        } else if (occupancy < 15) {
            return isPrivatelyOwned = true;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vroom vroom!";
    }
}

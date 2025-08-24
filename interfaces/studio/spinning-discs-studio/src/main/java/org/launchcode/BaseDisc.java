package org.launchcode;

public abstract class BaseDisc {

    //This is stored at a class level, not an object level
    private static int nextId = 1;
    //this will increment the ID from nextId
    private final int id;
    private String name;
    private String discType;
    private int spinRate; //in RPMs

    //Customized constructor so ID will increment
    public BaseDisc(String name, String discType, int spinRate) {
        this.id = nextId;
        this.name = name;
        this.discType = discType;
        this.spinRate = spinRate;
        nextId++;
    }

    //Only need getters for nextId and ID
    public static int getNextId() {
        return nextId;
    }

    public int getId() {
        return id;
    }

    //Getters and setters for name, discType and spinRate
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public int getSpinRate() {
        return spinRate;
    }

    public void setSpinRate(int spinRate) {
        this.spinRate = spinRate;
    }

    //custom toString()
    @Override
    public String toString() {
        String newline = System.lineSeparator();
        String asterisks = "*****";
        return newline + asterisks + " " + name + " " + asterisks + newline + "ID: " + id + newline
                + "Disc Type: " + discType + newline +
                "Spin Rate: " + spinRate + " RPM" + newline;
    }

    //Instance Method spinDisc
    void spinDisc() {
        String newline = System.lineSeparator();
        System.out.println(newline + "The " +  discType + " " + name + " is spinning at " + spinRate + " RPM.");
    }
}

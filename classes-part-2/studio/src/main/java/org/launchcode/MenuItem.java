package org.launchcode;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private final LocalDate dateAdded;

    public MenuItem(String name, double price, String description, String ccategory) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = ccategory;
        this.dateAdded = LocalDate.now();
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() { return description; }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() { return category; }
    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDateAdded() { return dateAdded; }

    //SPECIAL METHODS
    //TODO: Define custom toString() method
    //Customize name, description, price and isNew
    @Override
    public String toString() {
        String newText = isNew() ? " - NEW!" : "";
        return "\n" + name + newText + "\n" + description + " | " + price;
    }


    //TODO: Define custom equals() method
    @Override
    public boolean equals(Object toBeCompared){
        if (this == toBeCompared) {
            return true;
        }
        if (toBeCompared == null){
            return false;
        }
        if (getClass() != toBeCompared.getClass()) {
            return false;
        }

        MenuItem otherItem = (MenuItem) toBeCompared;

        return this.name.equals(otherItem.getName());
    }


    //INSTANCE METHODS
    //TODO: Define instance method isNew()
    //return true if item added within last 90 days
    boolean isNew() {
        LocalDate today = LocalDate.now();
        double daysBetween = getDateAdded().until(today, ChronoUnit.DAYS);
        return daysBetween < 90;
    }


}


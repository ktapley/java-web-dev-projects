package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

    //Allow for default constructor

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    //SPECIAL METHODS

    //TODO: Define custom toString() method
    //List menu items, grouped by category
    @Override
    public String toString() {
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("appetizer")) {
                appetizers.append("\n").append(item.toString()).append("\n");
            }
        } StringBuilder mainCourses = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("main course")) {
                mainCourses.append("\n").append(item.toString()).append("\n");
            }
        } StringBuilder desserts = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("dessert")) {
                desserts.append("\n").append(item.toString()).append("\n");
            }
        }
        return "\nMADE UP MENU\n" +
                "APPETIZERS\n" + appetizers.toString() +
                "\nMAIN COURSES\n" + mainCourses.toString() +
                "\nDESSERTS\n" + desserts.toString() + "\n";
    }

    //INSTANCE METHODS

    //TODO: Define addItem()
    //Make sure to update lastUpdated anytime something is successfully added
    //BONUS MISSION: prevent addition of duplicates
    void addItem(MenuItem newItem) {
        String message = "That item has already been added to the menu";
        if (menuItems.contains(newItem)) {
            System.out.println(message);
            return;
        }
        for (MenuItem item : menuItems) {
            if (item.equals(newItem)) {
                System.out.println(message);
                return;
            }
        }

        menuItems.add(newItem);
        lastUpdated = LocalDate.now();
    }


    //TODO: Define removeItem()
    //Make sure to update lastUpdated anything something is removed
    void removeItem(MenuItem item) {
        menuItems.remove(item);
        lastUpdated = LocalDate.now();
    }
}

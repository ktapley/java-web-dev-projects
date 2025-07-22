package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private final ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

    //Allow for default constructor

    public ArrayList<MenuItem> getMenuItems(){ return menuItems; }

    //SPECIAL METHODS
    //TODO: Define custom toString() method
    @Override
    public String toString() {
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item : menuItems) {
            if(item.getCategory().equals("appetizer")) {
                appetizers.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder mainCourse = new StringBuilder();
        for (MenuItem item : menuItems) {
            if(item.getCategory().equals("main course")) {
                mainCourse.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder dessert = new StringBuilder();
        for (MenuItem item :menuItems) {
            if(item.getCategory().equals("dessert")) {
                dessert.append("\n").append(item.toString()).append("\n");
            }
        }
        return "\nTODAY'S MENU\nAPPETIZERS" + appetizers.toString() + "\nMAIN COURSES" + mainCourse.toString() +
                "\nDESSERTS" + dessert.toString() +"\n";
    }

    //INSTANCE METHOD
    //TODO: Define addItem()
    //Make sure to update lastUpdates anytime something is successfully added
    void addItem(MenuItem newItem) {
        menuItems.add(newItem);
        lastUpdated = LocalDate.now();
    }


    //TODO: Define remove Item()
    void removeItem(MenuItem item) {
        menuItems.remove(item);
        lastUpdated = LocalDate.now();
    }
}



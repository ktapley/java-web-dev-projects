package org.launchcode;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

    //TODO: Create 5 menu items in different categories
    MenuItem item1 = new MenuItem("Cheese Pizza", "Extra cheesy slice of pizza!", 5.99, "main course");
    MenuItem item2 = new MenuItem("Mozzarella Sticks", "Breaded cheesy goodness", 4.99, "appetizer");
    MenuItem item3 = new MenuItem("Chocolate Chip Cookie", "Ooey gooey cookie served warm", 3.99, "dessert");
    MenuItem item4 = new MenuItem("Chef Salad", "For those that have goals", 7.99, "main course");
    MenuItem item5 = new MenuItem("Fried Pickles", "Pickles that don't need a description", 4.99, "appetizer");

    //TODO: Print first item
        System.out.println(item1);

    //TODO: Create menu
        Menu menu = new Menu();

    //TODO: Add items to menu and print it
        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);

        System.out.println(menu);

    //TODO: Remove an item and print menu
        menu.removeItem(item4);
        System.out.println(menu);


    //TODO: Test equals method
        System.out.println(item1.equals(item2));

        MenuItem item6 = new MenuItem("Fried Pickles", "Pickles that don't need a description", 4.99, "appetizer");

        System.out.println(item5.equals(item6));

        //BONUS MISSION
    //TODO: Attempt to add a duplicate item, then print menu to confirm it wasn't added
        menu.addItem(item6);
        System.out.println(menu);

    }
}

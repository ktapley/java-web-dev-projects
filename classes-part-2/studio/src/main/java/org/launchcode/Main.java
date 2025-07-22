package org.launchcode;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //TODO: Create menu items in different categories
        MenuItem item1 = new MenuItem("French Fries", 3.00, "Crinkle cut fries", "appetizer");
        MenuItem item2 = new MenuItem("Onion Rings", 4.00, "Classic onion rings made from Vadalia onions", "appetizer");
        MenuItem item3 = new MenuItem("Cheese Curds", 4.00, "Delicious Wisconsin cheese curds", "appetizer");
        MenuItem item4= new MenuItem("Hamburger", 3.00, "Classic hamburger", "main course");
        MenuItem item5 = new MenuItem("Cheeseburger", 3.50, "Classic hamburger with american cheese", "main course");
        MenuItem item6 = new MenuItem("Crispy Chicken Sandwich", 4.00, "Crispy, juicy chicken sandwich with mayo", "main " +
                "course");
        MenuItem item7 = new MenuItem("Ice Cream Cone", 3.50, "Sugar cone with your choice of ice cream", "dessert");
        MenuItem item8 = new MenuItem("Giant Cookie", 3.50, "Giant chocolate chip cookie fresh from the oven", "dessert");
        MenuItem item9 = new MenuItem("Peach Cobbler", 4.00, "Classic peach cobbler served a la mode", "dessert");


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
        menu.addItem(item6);
        menu.addItem(item7);
        menu.addItem(item8);
        menu.addItem(item9);

        System.out.println(menu);

        //TODO: Remove an item and print menu
        menu.removeItem(item3);
        System.out.println(menu);

        //TODO: Test equals method
        System.out.println(item1.equals(item4));

        MenuItem item10 = new MenuItem("Ice Cream Cone", 3.50, "Sugar cone with your choice of ice cream", "dessert");

        System.out.println(item7.equals(item10));


    }
}

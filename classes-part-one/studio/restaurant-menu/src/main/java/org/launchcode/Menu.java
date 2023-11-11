package org.launchcode;

public class Menu {

    public static void main(String[] args) {

        MenuItem guacamole = new MenuItem(3.99, "Guacamole and Chips", "appetizer", false);
        MenuItem enchiladas = new MenuItem(8.99, "Enchiladas (with choice of sauce and meat)", "main course", false);
        MenuItem churros = new MenuItem(4.99, "Traditional Churros", "dessert", true);

        System.out.println(guacamole.getDescription() + "\n" + guacamole.getCategory() + "\n" + guacamole.getPrice() + "\n");
        System.out.println(enchiladas.getDescription() + "\n" + enchiladas.getCategory() + "\n" + enchiladas.getPrice() + "\n");
        System.out.println(churros.getDescription() + "\n" + churros.getCategory() + "\n" + churros.getPrice() + "\n");

    }
}

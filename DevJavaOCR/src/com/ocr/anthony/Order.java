package com.ocr.anthony;

public class Order {
    /**
     * Display all available menus in the restaurant.
     */
    public void displayAvailableMenu() {
        System.out.println("Choix de menu");
        System.out.println("1- poulet");
        System.out.println("2- boeuf");
        System.out.println("3- vegetarian");
        System.out.println("Que souhaitez-vous comme menu?");
    }
    /**
     * Display a selected menu.
     * @param nbMenu The selected menu.
     */
    public void displaySelectedMenu(int nbMenu) {
        System.out.println("Vous avez Choisi le menu " + nbMenu);

    }
}
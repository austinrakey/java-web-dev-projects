package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Menu myMenu = new Menu(new Date(), new ArrayList<>());

        MenuItem newItem = new MenuItem(9.99, "Spaghetti Carbonara", "Main Course", true);
        MenuItem newItem1 = new MenuItem(8.49, "Caesar Salad", "Appetizer", false);

        System.out.println(newItem.isNew());

        System.out.println(myMenu.newOrNot(newItem));

//        System.out.println(myMenu.getItems());

        for (MenuItem item : myMenu.getItems()) {
            System.out.println(item);
        }

    }
}

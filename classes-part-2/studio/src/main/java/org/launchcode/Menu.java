package org.launchcode;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

//     public HashMap<MenuItem, String> MenuItem = new HashMap<>(){
//
//
//     };

    public void addItem(MenuItem newItem) {
        items.add(newItem);
//        lastUpdated = new Date();
    }

    public void removeItem(MenuItem itemToRemove) {
        items.remove(itemToRemove);
//        lastUpdated = new Date();
    }

public String newOrNot(MenuItem item) {
if (item.isNew()) {
}
    return "New Item!";
}
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }
}



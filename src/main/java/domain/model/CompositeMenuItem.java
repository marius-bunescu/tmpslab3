package domain.model;

import domain.model.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class CompositeMenuItem extends MenuItem {
    private List<MenuItem> menuItems = new ArrayList<>();

    public CompositeMenuItem(String name, String description) {
        super(name, 0.0, description);
    }

    public void add(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public void remove(MenuItem menuItem) {
        menuItems.remove(menuItem);
    }

    public void print() {
        System.out.println(name + ": " + description);
        for (MenuItem menuItem : menuItems) {
            menuItem.print();
        }
    }

    public double getPrice() {
        double totalPrice = 0.0;
        for (MenuItem menuItem : menuItems) {
            totalPrice += menuItem.getPrice();
        }
        return totalPrice;
    }
}
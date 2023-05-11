package domain.model;

import domain.model.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<MenuItem> items = new ArrayList<>();

    public void addItem(MenuItem menuItem) {
        items.add(menuItem);
    }

    public void removeItem(MenuItem menuItem) {
        items.remove(menuItem);
    }

    public void print() {
        System.out.println("=====================");
        System.out.println("Items ordered:");
        for (MenuItem item : items) {
            System.out.println("- " + item.getName() + " ($" + item.getPrice() + ")");
        }
        System.out.println("---------------------");
        System.out.println("Total: $" + getTotal());
        System.out.println("=====================");
    }

    public double getTotal() {
        double total = 0.0;
        for (MenuItem menuItem : items) {
            total += menuItem.getPrice();
        }
        return total;
    }

    public void clear() {
        items.clear();
    }
}

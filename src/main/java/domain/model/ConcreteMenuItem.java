package domain.model;

import java.util.HashMap;
import java.util.Map;

public class ConcreteMenuItem extends MenuItem {
    private static Map<String, ConcreteMenuItem> cache = new HashMap<>();

    private ConcreteMenuItem(String name, double price, String description) {
        super(name, price, description);
    }

    public static ConcreteMenuItem getMenuItem(String name, double price, String description) {
        ConcreteMenuItem menuItem = cache.get(name);
        if (menuItem == null) {
            menuItem = new ConcreteMenuItem(name, price, description);
            cache.put(name, menuItem);
        }
        return menuItem;
    }

    public void print() {
        System.out.println(name + " - " + price + ": " + description);
    }
}

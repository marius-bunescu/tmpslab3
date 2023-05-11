package domain.factories;
import domain.model.BurgerMenuItem;
import domain.model.FriesMenuItem;
import domain.model.MenuItem;
import domain.model.PizzaMenuItem;

import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;
import java.util.Map;

public class MenuItemFactory {
    private static final Map<String, MenuItem> ITEM_CACHE = new HashMap<>();

    public static MenuItem getMenuItem(String name, double price) {
        String key = name + "_" + price;
        if (!ITEM_CACHE.containsKey(key)) {
            // Create a concrete subclass based on the type of item
            MenuItem item;
            if (name.equalsIgnoreCase("Pizza")) {
                item = new PizzaMenuItem(name, price, "very Italian");
            } else if (name.equalsIgnoreCase("Burger")) {
                item = new BurgerMenuItem(name, price,"very hot");
            } else if (name.equalsIgnoreCase("Fries")) {
                item = new FriesMenuItem(name, price, "very tasty");
            } else {
                throw new IllegalArgumentException("Invalid item type");
            }
            ITEM_CACHE.put(key, item);
        }
        return ITEM_CACHE.get(key);
    }
}


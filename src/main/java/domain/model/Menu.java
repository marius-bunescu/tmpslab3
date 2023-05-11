package domain.model;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<MenuItem> items = new ArrayList<>();

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void removeItem(MenuItem item) {
        items.remove(item);
    }
    public MenuItem findItemByName(String name) {
        for (MenuItem item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }


    public void print() {
        for (MenuItem item : items) {
            item.print();
        }
    }
}

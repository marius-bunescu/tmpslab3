package domain.model;

public class PizzaMenuItem extends MenuItem {
    public PizzaMenuItem(String name, double price, String description) {
        super(name, price, description);
    }

    @Override
    public void print() {
        System.out.println(getName() + " - $" + getPrice() + "\n" + getDescription());
    }
}
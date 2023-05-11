package domain.model;

public class BurgerMenuItem extends MenuItem {
    public BurgerMenuItem(String name, double price, String description) {
        super(name, price, description);
    }

    @Override
    public void print() {
        System.out.println(getName() + " - $" + getPrice() + "\n" + getDescription());
    }
}
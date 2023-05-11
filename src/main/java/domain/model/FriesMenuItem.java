package domain.model;

public class FriesMenuItem extends MenuItem {
    public FriesMenuItem(String name, double price, String description) {
        super(name, price, description);
    }

    @Override
    public void print() {
        System.out.println(getName() + " - $" + getPrice() + "\n" + getDescription());
    }
}
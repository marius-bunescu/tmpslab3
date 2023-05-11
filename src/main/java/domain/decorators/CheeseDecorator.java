package domain.decorators;

import domain.model.MenuItem;

public class CheeseDecorator extends MenuItem {
    private MenuItem menuItem;

    public CheeseDecorator(MenuItem menuItem) {
        super(menuItem.getName() + " with extra cheese", menuItem.getPrice() + 1.0, menuItem.getDescription() + " with extra cheese");
        this.menuItem = menuItem;
    }

    public void print() {
        menuItem.print();
    }
}

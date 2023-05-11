package domain.model;

import utilities.PaymentProcessor;

public class RestaurantFacade {
    private Menu menu;
    private Order order;

    public RestaurantFacade() {
        this.menu = new Menu();
        this.order = new Order();
    }

    public void displayMenu() {
        menu.print();
    }

    public void addItemToOrder(MenuItem menuItem) {
        order.addItem(menuItem);
    }

    public double getOrderTotal() {
        return order.getTotal();
    }

    public void placeOrder() {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment(order.getTotal());
        order.clear();
    }
}
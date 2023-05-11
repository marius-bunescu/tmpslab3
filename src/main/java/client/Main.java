package client;

import domain.model.*;
import utilities.PaymentProcessor;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a menu
        Menu menu = new Menu();
        menu.addItem(new PizzaMenuItem("Pizza", 8.99, "A classic pizza with tomato sauce and cheese"));
        menu.addItem(new BurgerMenuItem("Burger", 6.99, "A juicy burger with lettuce, tomato, and cheese"));
        menu.addItem(new FriesMenuItem("Fries", 2.99, "Crispy french fries with ketchup"));

        // Create an order
        Order order = new Order();

        // Display the menu and take orders from the user
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            System.out.println("domain.model.Menu:");
            menu.print();
            System.out.println("Enter the name of the item you would like to order, or 'done' to finish:");
            choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("done")) {
                MenuItem item = menu.findItemByName(choice);
                if (item == null) {
                    System.out.println("Sorry, we don't have that item.");
                } else {
                    System.out.println("Adding " + item.getName() + " to your order...");
                    order.addItem(item);
                }
            }
        } while (!choice.equalsIgnoreCase("done"));

        // Display the order and calculate the total price
        System.out.println("Your order:");
        order.print();
        System.out.println("Total price: $" + order.getTotal());

        // Process the payment
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment(order.getTotal());
        System.out.println("Thank you for your order!");
    }
}


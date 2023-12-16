package Shopping;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<Item>();
        Shopping cart = new Shopping(items);
        cart.addItem(new Item(20.2, "Shampoo"));
        cart.addItem(new Item(10, "Apple"));
        cart.addItem(new Item(16.3, "Bread"));
        cart.addItem(new Item(36, "Ice cream"));
        cart.addItem(new Item(11.5, "Juice"));
        Item pear = new Item(4, "Pear");
        cart.addItem(pear);

        System.out.println("Total price of the cart is: " + cart.getTotalPrice());


        cart.removeItem(pear);
        System.out.println("Removed item: " + pear.getName());
        cart.removeItem(pear);
        System.out.println("Total price of the cart is: " + cart.getTotalPrice());

        cart.setDiscount(0.95);
        System.out.println("Items are discounted by 5%, therefore the total price of the cart is: " + cart.getTotalPrice());

    }
}

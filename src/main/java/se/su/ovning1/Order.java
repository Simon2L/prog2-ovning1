package se.su.ovning1;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private ArrayList<Item> items;
    private long orderNumber;
    private long counter;

    public Order(Item... items) {
        this.items = new ArrayList<>(List.of(items));
    }

    public String getReceipt() {
        return "Order";
    }

    public double getTotalValuePlusVAT() {
        return 0;
    }

    public double getTotalValue() {
        return 0;
    }
}

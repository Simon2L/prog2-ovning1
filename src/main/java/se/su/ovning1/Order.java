package se.su.ovning1;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private final ArrayList<Item> items;
    private static long counter = 1;
    private final long orderNumber;


    public Order(Item... items) {
        orderNumber = counter;
        counter++;
        this.items = new ArrayList<>(List.of(items));
    }

    public String getReceipt() {
        var builder = new StringBuilder();
        builder.append("Receipt for order #").append(orderNumber).append("\n");
        builder.append("---------").append("\n");
        for (var item : items) {
            builder.append(item.toString());
            builder.append("\n");
        }
        builder.append("\n");
        builder.append("Total excl. VAT: ").append(getTotalValue()).append("\n");
        builder.append("Total incl. VAT: ").append(getTotalValuePlusVAT());
        return builder.toString();
    }

    public double getTotalValuePlusVAT() {
        double sum = 0;
        for (Item item : items) {
            sum += item.getPriceWithVAT();
        }
        return sum;
    }

    public double getTotalValue() {
        double sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }
}

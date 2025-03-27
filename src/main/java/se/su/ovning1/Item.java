package se.su.ovning1;

public class Item implements Priceable {

    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public double getVAT() {
        return 0;
    }

    @Override
    public double getPriceWithVAT() {
        return 0;
    }
}

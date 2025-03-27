package se.su.ovning1;

public class Book extends Item implements PriceableWithVAT6 {

    private double price;
    private boolean bound;
    private String author;

    public Book(String name, String author, double price, boolean bound) {
        super(name);
        this.price = bound ? price * 1.3 : price;
        this.author = author;
        this.bound = bound;
    }

    public String getType(){
        return "Book";
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getVAT() {
        return price * 0.06;
    }

    @Override
    public double getPriceWithVAT() {
        return price * 1.06;
    }

    @Override
    public String toString() {
        return author + " " + price + " " + bound;
    }
}

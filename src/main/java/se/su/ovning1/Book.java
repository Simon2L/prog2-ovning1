package se.su.ovning1;

public class Book extends Item implements PriceableWithVAT6 {

    private final double price;
    private final boolean bound;
    private final String author;

    public Book(String name, String author, double price, boolean bound) {
        super(name);
        this.price = bound ? price * 1.3 : price;
        this.author = author;
        this.bound = bound;
    }

    private String getType(){
        return "Book";
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return getType() + ": name=" + getName() + ", " + "author=" + author + ", " + "bound=" + bound + ", " + "price=" + price + ", " + "price+VAT=" + getPriceWithVAT();
    }
}

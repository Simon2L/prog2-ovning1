package se.su.ovning1;

public abstract class Recording extends Item implements PriceableWithVAT25 {

    private final String artist;
    private final int year;
    private int condition;
    private final double price;

    public Recording(String name, String artist, int year, int condition, double price) {
        super(name);
        this.artist = artist;
        this.year = year;
        this.condition = condition;
        this.price = price;
    }

    public String getArtist() {
        return artist;
    }

    public abstract String getType();

    public int getYear() {
        return year;
    }

    public int getCondition() {
        return condition;
    }

    @Override
    public String toString() {
        return getType() + ": name=" + getName() + "artist=" + artist + ", year=" + year + ", condition=" + condition + ", original price=" + price + ", price=" + getPrice() + ", price+vat=" + getPriceWithVAT();
    }

    @Override
    public double getPrice() {
        var conditionPrice = price * (condition / 10.0);
        return conditionPrice < 10 ? 10 : conditionPrice;
    }
}

package se.su.ovning1;

public abstract class Recording extends Item implements PriceableWithVAT25 {
    private String artist;
    private int year;
    private int condition;
    private double price;

    public Recording(String name, String artist, int year, int condition, double price) {
        super(name);
        this.artist = artist;
        this.year = year;
        this.condition = condition;
        var conditionPrice = price * (condition / 10.0);
        this.price = conditionPrice < 10 ? 10 : conditionPrice;
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
        return "Recording [artist=" + artist + ", year=" + year + ", condition=" + condition + ", price=";
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getVAT() {
        return price * 0.25;
    }

    @Override
    public double getPriceWithVAT() {
        return price * 1.25;
    }
}

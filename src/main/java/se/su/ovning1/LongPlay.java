package se.su.ovning1;

import java.time.LocalDateTime;

public class LongPlay extends Recording {

    public LongPlay(String name, String artist, int year, int condition, double price) {
        super(name, artist, year, condition, price);
    }

    @Override
    public String getType() {
        return "LP";
    }

    @Override
    public double getPrice() {
        var thisYear = LocalDateTime.now().getYear();
        var increasePrice = (thisYear - getYear()) * 5;
        return super.getPrice() + increasePrice;
    }
}

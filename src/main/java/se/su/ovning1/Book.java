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

    /**
     * Returns an Image object that can then be painted on the screen.
     * The url argument must specify an absolute <a href="#{@link}">{@link URL}</a>. The name
     * argument is a specifier that is relative to the url argument.
     * <p>
     * This method always returns immediately, whether or not the
     * image exists. When this applet attempts to draw the image on
     * the screen, the data will be loaded. The graphics primitives
     * that draw the image will incrementally paint on the screen.
     *
     * @param  price  an absolute URL giving the base location of the image
     * @param  name the location of the image, relative to the url argument
     * @return      the image at the specified URL
     * @see         Image
     */
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

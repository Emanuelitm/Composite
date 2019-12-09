package javamex.patronesdise;

/**
 * @author oblancarte
 * 
*/
public abstract class AbstractProduct {

    protected String name;
    protected double price;

    public AbstractProduct(final String name, final double price) {
        super();
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }
}
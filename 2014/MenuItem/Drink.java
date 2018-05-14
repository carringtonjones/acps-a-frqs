
/**
 * Write a description of class Drink here.
 *
 * @author (Carrington Jones)
 * @version (a version number or a date)
 */
public class Drink implements MenuItem
{
    private String name;
    private double price;

    /**
     * Constructor for objects of class Drink
     * @param name the name of the drink.
     * @param price the price of the drink.
     */
    public Drink(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
}

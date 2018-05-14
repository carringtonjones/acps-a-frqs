
/**
 * Write a description of class Sandwich here.
 *
 * @author (Carrington Jones)
 * @version (a version number or a date)
 */
public class Sandwich implements MenuItem
{
    private String name;
    private double price;

    /**
     * Constructor for objects of class Sandwich
     * @param name the name of the sandwich.
     * @param price the price of the sandwich.
     * 
     */
    public Sandwich(String name, double price)
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

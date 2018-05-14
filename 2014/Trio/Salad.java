
/**
 * Write a description of class Salad here.
 *
 * @author (Carrington Jones)
 * @version (a version number or a date)
 */
public class Salad implements MenuItem
{
    private String name;
    private double price;

    /**
     * Constructor for objects of class Salad
     * @param name the name of the salad.
     * @param price the price of the salad.
     * 
     */
    public Salad(String name, double price)
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

/**
 * Write a description of class Vehicle here.
 *
 * @author (Carrington Jones)
 * @version (3/21/18)
 */
public class Vehicle extends TaxableItem
{
    private double dealerMarkup;
    private double dealerCost;

    /**
     * Constructor for objects of class Vehicle
     * 
     * @param rate is the tax rate on the car.
     * @param dealerCost is the cost for the dealer to buy the car
     * @param dealerMarkup is the amount the dealer takes on the car
     */
    public Vehicle(double rate, double dealerCost, double dealerMarkup)
    {
        super(rate);
        this.dealerMarkup = dealerMarkup;
        this.dealerCost = dealerCost;
    }
    
    /**
     * Gets the list price for the vehicle.
     *
     * @return  the dealer markup plus the dealer cost.
     */
    public double getListPrice() {
        return dealerMarkup + dealerCost;
    }
    
    /**
     * Chages the car markup to a new
     * @param  newMarkup  the new amount for the dealer markup.
     */
    public void changeMarkup(double newMarkup)
    {
        dealerMarkup = newMarkup;
    }
}
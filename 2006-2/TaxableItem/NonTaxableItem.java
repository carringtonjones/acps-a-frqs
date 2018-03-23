
/**
 * Write a description of class NonTaxableItem here.
 *
 * @author (Carrington Jones)
 * @version (3/21/18)
 */
public class NonTaxableItem implements Item
{
    private double listPrice;
    
    /**
     * Constructor for objects of class NonTaxable
     * 
     * @param listPrice the listing price of the item
     */
    public NonTaxableItem(double listPrice)
    {
        this.listPrice = listPrice;
    }
    
    /**
     * Returns the price of the nontaxable item 
     *
     * @return the list price of the item.
     */
    public double purchasePrice()
    {
        return listPrice;
    }    
}

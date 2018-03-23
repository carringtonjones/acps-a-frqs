
/**
 * 2006 Taxable Item FRQ
 *
 * @author (Carrington Jones)
 * @version (3/21/18)
 */
public abstract class TaxableItem implements Item
{
    private double taxRate;
    
    /**
     * Gets the list price of the taxable item.=
     */
    public abstract double getListPrice();

    /**
     * Constructor for the class TaxableItem
     *
     * @param rate the current tax rate for the item.
     */
    public TaxableItem(double rate)
    {
        taxRate = rate;
    }
    
    /**
     * Returns the price of the item including the tax
     *
     * @return sum of the list price with tax added.
     */
    public double purchasePrice()
    {
        return getListPrice() + getListPrice()*taxRate;
    }    
}

/**
 * Write a description of class CookieOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CookieOrder
{
    private String variety;
    private int numBoxes;

    /**
     * Constructor for objects of CookieOrder class
     */
    public CookieOrder(String variety, int numBoxes)
    {
        
        this.variety = variety;
        this.numBoxes = numBoxes;
        
    }

    /**
     * @return the variety of cookies being ordered
     */
    public String getVariety()
    {
        
        return variety;
        
    }
    
    /**
     * @return the number of boxes being ordered
     */
    public int getNumBoxes()
    {
        
        return numBoxes;
        
    }
    
    /**
     * @return the different varieties of cookie being ordered.
     */
    public String toString() {
        
        return variety;
        
    }
}

/**
 * Write a description of class Advance here.
 *
 * @author (Carrington Jones)
 * @version (3/20/18)
 */
public class Advance extends Ticket
{
    private int days;

    /**
     * Constructor for objects of class Advance
     * @param number of days in advance the ticket is ordered.
     */
    public Advance(int days)
    {
        
        this.days = days;
        
    }

    /**
     * gets price of ticket.
     * @return the cost of ticket.
     */  
    public double getPrice()
    {
        
        if (days >= 10) return 30;
        else return 40;
        
    }
    
}
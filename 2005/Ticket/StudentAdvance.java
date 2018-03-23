/**
 * Write a description of class StudentAdvance here.
 *
 * @author (Carrington Jones)
 * @version (3/20/18)
 */
public class StudentAdvance extends Advance
{

    /**
     * Constructor for objects of class StudentAdvance
     * @param number of days in advance the ticket is ordered.
     */
    public StudentAdvance(int days)
    {
        super(days);
        
    }

    public String toString()
    {
        
        return super.toString() + "\n(Student ID required)";
        
    }
    
    /**
     * gets price of ticket.
     * @return half the cost of advance ticket.
     */  
     public double getPrice()
    {
        
        return super.getPrice() / 2;
        
    }
}
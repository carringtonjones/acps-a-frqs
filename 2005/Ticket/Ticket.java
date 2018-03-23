/**
 * Write a description of class Ticket here.
 *
 * @author (Carrington Jones)
 * @version (3/20/18)
 */
public abstract class Ticket
{
    private int serialNumber;

    /**
     * Constructor for objects of class Ticket
     */
    public Ticket()
    {
        serialNumber = getNextSerialNumber();
        
    }

    /**
     * returns price of ticket.
     */    
    public abstract double getPrice();
    
    /**
     * returns a string with information about the ticket.
     * @return string with information about the ticket.
     */
    public String toString()
    {
        return "Number: " + serialNumber + "\nPrice: " + getPrice();
        
    }
    
    /**
     * Gets unique serial number.
     * @return    unique serial number.
     */
    public int getNextSerialNumber()
    {
        return (int) (Math.random() * (1000 - 1)) + 1;
        
    }
}
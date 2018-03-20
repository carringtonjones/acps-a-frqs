/**
 * Write a description of class MasterOrder here.
 *
 * @author (Carrington Jones)
 * @version (2/12/18)
 */
import java.util.ArrayList;

public class MasterOrder
{
    private ArrayList<CookieOrder> orders;
    
    /**
     * Constructs a new MasterOrder object
     */
    public MasterOrder()
    {
        orders = new ArrayList<CookieOrder>();
        
    }

    /**
     * Add theOrder to the master order
     * @param  theOrder  the cookie order to add to the master order
     */
    
    public void addOrder(CookieOrder theOrder)
    {
        orders.add(theOrder);
        
    }
    
    /**
     * @return the sum of the number of boxes of all cookie orders
     */
    
    public int getTotalBoxes() {
        
        int boxes = 0;
        
        for (CookieOrder order: orders) {
            
            boxes += order.getNumBoxes();
            
        }
        
        return boxes;
    }
    
    /**
     * Removes all cookie orders from the master order that have the same variety of
     * cookie as cookieVar and returns the total number of boxes that were removed
     * cookie as cookieVar and returns the total number of boxes that were removed
     * @param  cookieVar  the variety of cookies to be removed from the master order.
     * @return the total number of boxes of cookieVar in the cookie orders removed.
     */
    
    public int removeVariety(String cookieVar) {
         int boxesRemoved = 0;
         
         for (int i = orders.size() - 1; i >= 0; i--) {
             if (cookieVar.equals(orders.get(i).getVariety())) {
                 
                 boxesRemoved += orders.remove(i).getNumBoxes();
                 
                 
             }
         }
         
         return boxesRemoved;
    }
    
    /** 
     * @return the arraylist of all the orders
     */
    public String toString() {
        
        return orders.toString();
        
    }
}

/**
 * Write a description of class BatteryCharger here.
 *
 * @author (Carrington Jones)
 * @version (2/22/18)
 */
public class BatteryCharger
{
   /** rateTable has 24 entries representing the charging costs for hours 0 through 23 */
     private int[] rateTable;
    
    /** 
     * Constructor for the BatteryCharger class
     *  @param rateTable is the array of rates for each individual hour
     */  
    
     public BatteryCharger(int[] rateTable) {
         this.rateTable = rateTable;
         
     }
     
    /** Determines the total cost to charge the battery starting at the beginning of startHour.
     * @param startHour the hour at which the charge period begins
     * Precondition: 0 ≤ startHour ≤ 23
     * @param chargeTime the number of hours the battery needs to be charged
     * Precondition: chargeTime > 0
     * @return the total cost to charge the battery
     */
    
     private int getChargingCost(int startHour, int chargeTime)
     { 
         //int time = 0;
         int cost = 0;
         
         for (int hour = startHour; hour < startHour + chargeTime ; hour++) {
             //time = i;
             //while (time > 23) time -= 24;
             cost += rateTable[hour % rateTable.length];
         }
         
         return cost;
     }
     
    /** Determines start time to charge the battery at the lowest cost for the given charge time.
     * @param chargeTime the number of hours the battery needs to be charged
     * Precondition: chargeTime > 0
     * @return an optimal start time, with 0 ≤ returned value ≤ 23
     */
    
    public int getChargeStartTime(int chargeTime)
  {
    int cheapestStartHour = 0;
    
    for(int startHour = 1; startHour < rateTable.length; startHour++)
      if(getChargingCost(startHour, chargeTime) <
            getChargingCost(cheapestStartHour, chargeTime))
        cheapestStartHour = startHour;
    return cheapestStartHour;
    
  }
}
     
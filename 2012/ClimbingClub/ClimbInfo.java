
/**
 * Write a description of class ClimbInfo here.
 *
 * @author (Carrington Jones)
 * @version (a version number or a date)
 */
public class ClimbInfo
{
    // instance variables - replace the example below with your own
    private String peakName;
    private int climbTime;

    /**
     * Creates a ClimbInfo object with name peakName and time climbTime.
     * @param peakName the name of the mountain peak.
     * @param climbTime the number of minutes taken to complete the climb.
     */
    public ClimbInfo(String peakName, int climbTime)
    {
        this.peakName = peakName;
        this.climbTime = climbTime;
    }

    /**
     * @return the name of the mountain peak.
     */
    public String getName()
    {
        return peakName;
    }
    
    /**
     * @return the number of minutes taken to complete the climb.
     */
    public int getTime()
    {
        return climbTime;
    }

    /**
     * @return the ClimbInfo object as a string.
     */  
    
    public String toString() {
        return "\"" + peakName + "\"" + " " + climbTime;
    }
    
}

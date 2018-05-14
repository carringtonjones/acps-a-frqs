
/**
 * Write a description of class ClimbingClub here.
 *
 * @author (Carrington Jones)
 * @version (a version number or a date)
 */
import java.util.*;
public class ClimbingClub
{
    /**
     * The list of climbs completed by members of the club.
     * Guarenteed not to be null. Contains only non-null references.
     */
    private List<ClimbInfo> climbList;

    /**
     * Creates a new ClimbingClub object.
     */
    public ClimbingClub()
    {
        climbList = new ArrayList<ClimbInfo>();
    }

    /**
     * Adds a new climb with name peakName and time climbTime to the list of climbs.
     * @param peakName the name of the mountain peak.
     * @param climbTime the number of minutes taken to complete the climb.
     */
    public void addClimb(String peakName, int climbTime)
    {
        ClimbInfo climb = new ClimbInfo(peakName, climbTime);
        int i = 0;
        //climbList.add(climb)
        if (climbList.size() == 0) climbList.add(climb);
        else {
            for (ClimbInfo x: climbList) {
                String currentName = x.getName();
                String insertedName = climb.getName();
                
                if (currentName.compareTo(insertedName) > 0) {
                    climbList.add(i, climb);
                    break;
                }
                else if (i+1 == climbList.size()) { 
                    climbList.add(climb);
                    break;
                }
                
                i++;
            }
        }
    }
    
    /**
     * @return the number of distinct names in the list of climbs
     */
    public int distinctPeakNames()
    {
        if (climbList.size() == 0) return 0;
        ClimbInfo currInfo = climbList.get(0);
        String prevName = currInfo.getName();
        String currName;
        int numNames = 1;
        
        for (int i = 1; i < climbList.size(); i++) {
            currInfo = climbList.get(i);
            currName = currInfo.getName();
            if (prevName.compareTo(currName) != 0) {
                numNames++;
                prevName = currName;
            }
        }
        
        return numNames;
    }
    
    /**
     * @return the ClimbingClub arraylist as a string.
     */  
    
    public String toString() {
        return climbList.toString();
    }
}
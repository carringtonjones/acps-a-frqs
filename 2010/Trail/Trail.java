/**
 * Constuctor class for Trail 
 *
 * @author Carrington Jones 
 * @version 11/15/17 
 */
public class Trail
{
    // instance variables - replace the example below with your own
    private int[] markers;

    /**
     * Constructor for objects of class Trail
     * @param markers  int array with all the markers.
     */
    
    public Trail(int[] markers)
    {
        this.markers = markers;
        
    }

    /**
     * Checking to see if a Trail Segment is leveled
     *
     * @param  start  Where to start index in the array
     * @param  end  Where to end index in the array
     * @return true or false based on whether the trail is leveled or not
     */
    
    public boolean isLevelTrailSegment(int start, int end)
    {
        int maxElevation = Integer.MIN_VALUE;
        int minElevation = Integer.MAX_VALUE;
        
        for (int i = start; i <= end; i = i + 1) {
            
            maxElevation = Math.max(markers[i], maxElevation);
            minElevation = Math.min(markers[i], maxElevation);
            
        }
        
        return maxElevation - minElevation <= 10;
        
    }
    
    /**
     * Checking to see if a Trail Segment is difficult
     * @return true or false based on whether the trail is hard or not
     */
    
    public boolean isDifficult()
    {
        
        int change30Elevation = 0;
        
        for (int i = 1; i < markers.length; i = i + 1) {
            if (Math.abs(markers[i-1] - markers[i]) >= 30) {
                change30Elevation++;
                
            }
        }
        
        return change30Elevation >= 3;
        
    }
}
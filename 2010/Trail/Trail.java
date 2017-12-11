package Trail;

import java.util.Arrays;

public class Trail
{
    private int[] markers;

    public Trail(int[] markers)
    {
        this.markers = markers;
        
    }
    
    public boolean isLevelTrailSegment(int start, int end) {
        int highest = markers[start];
        int lowest  = markers[start];
        
        for (int i=start; i <= end; i = i + 1) {
            highest = Math.max(highest, markers[i]);
            lowest  = Math.min(lowest,  markers[i]);
            
        }            
        int difference = Math.abs(highest - lowest);
        
        return difference < 10;
        
    }
    
    public boolean isDifficult() {
        int numBigChanges = 0;
        
        for (int i=1; i < markers.length; i++) {
            int difference = Math.abs(markers[i-1] - markers[i]);
            
            if (difference >= 30) {
                numBigChanges++;
                
            }
        }
        return numBigChanges >= 3;
        
    }
  
    public String toString() {
        return String.format("Trail { markers: %s,%n" +
                             "        isDifficult: %b }",
                             Arrays.toString(markers), this.isDifficult());
                             
    }
}
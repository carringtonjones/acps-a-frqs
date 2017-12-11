
/**
 * Write a description of class CollegeGroup here.
 *
 * @author (Carrington Jones)
 * @version (11/23/17)
 */
public class CollegeGroup
{
    private College[] myColleges; 
    
    /**
     * 
     * 
     */
    public CollegeGroup(College[] myColleges) {
        this. myColleges = myColleges; 
    }
    
     /**
      * 
      */
    public void updateTuition(String collegeName, int newTuition)
    {
        for (int i = 0; i < myColleges.length; i = i + 1) {
            College c = myColleges[i];            
            String n = c.getName();

            if(n.equals(collegeName)) {
                c.setTuition(newTuition);
            }           
        }
    }
    
    /**
     * 
     */
    public College[] getCollegeList(String region, int low, int high)
    {
        int count1 = 0;
       
        for (int i = 0; i < myColleges.length; i = i + 1) {
            College c = myColleges[i];
            String r = c.getRegion();
            int t = c.getTuition();
            
            if (region.equals(r) & t >= low && t <= high) {
                count1++;       
            }
        }
        
        College[] result = new College[count1];
        
        int count2 = 0;
        
        for (int i = 0; i < myColleges.length; i = i + 1) {
            College c = myColleges[i];
            String r = c.getRegion();
            int t = c.getTuition();
            
            if (region.equals(r) & t >= low && t <= high) {
                 result[count2] = myColleges[i];
                 count2++;
            }
        }
        
        return result;
    }
}
   

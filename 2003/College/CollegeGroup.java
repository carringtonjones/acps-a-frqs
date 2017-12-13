
/**
 * Constructor class for CollegeGroup 
 
 * @author (Carrington Jones)
 * @version (11/23/17)
 */
public class CollegeGroup
{
    private College[] myColleges; 
    
    /**
     * Contructor for CollegeGroup
     * 
     * @param myColleges colleges in an array 
     */
    public CollegeGroup(College[] myColleges) {
        this. myColleges = myColleges; 
    }
    
     /**
      * Sets tuition of a college to a new tuition 
      * 
      * @param collegeName college name
      * @param newTuition new tuition value
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
     * Sets tuition of a college to a new tuition
     * 
     * @param region region the college is in
     * @param low lowest cost of the tuition
     * @param high highest cost of tuition
     * @return result the ending result which contains a list of colleges in an array 
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
   


/**
 * 2003 APCS FRQ
 *
 * @author (Carrington Jones)
 * @version (11/23/17)
 */
public class College
{
    private String name;
    private String region;
    private int tuition;
  
    /**
     * College Constructor
     * 
     * @param name Name of the college.
     * @param region Region of the college.
     * @param tuition Tuition cost of the college.
     */
    public College(String name, String region, int tuition)
    {
        this.name = name;
        this.region = region;
        this.tuition = tuition;
    }
    /**
     * Grabs the name of the object
     * @return name name of object 
     */
    public String getName()
    {
        return name;
    }
    /**
     * Grabs the region of the object 
     * @return region region of object 
     */
    public String getRegion()
    {
        return region;
    }
    /**
     * Grabs the tuition of the object
     * @return tuition tuition of object 
     */
    public int getTuition()
    {
        return tuition;
    }
    /**
     * Sets tuition of object 
     */
    public void setTuition(int newTuition)
    {
        this.tuition = newTuition;
    }
    /**
     * 
     */
    public String toString() {
        return name + ", " + region + ", " + tuition;
    }
}

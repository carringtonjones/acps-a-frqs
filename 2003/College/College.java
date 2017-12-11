
/**
 * Write a description of class College here.
 *
 * @author (Carrington Jones)
 * @version (11/23/17)
 */
public class College
{
    private String name;
    private String region;
    private int tuition;
  
    public College(String name, String region, int tuition)
    {
        this.name = name;
        this.region = region;
        this.tuition = tuition;
    }
    //returns college name
    public String getName()
    {
        return name;
    }
    //return college region
    public String getRegion()
    {
        return region;
    }
    //returns college tuition 
    public int getTuition()
    {
        return tuition;
    }
    //sets college's tuition to newTuition
    public void setTuition(int newTuition)
    {
        this.tuition = newTuition;
    }
    //returns name of college, region, and tuition
    public String toString() {
        return name + ", " + region + ", " + tuition;
    }
}

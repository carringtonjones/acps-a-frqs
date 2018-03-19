/**
 * Write a description of class Pet here.
 *
 * @author (Carrington Jones)
 * @version (a version number or a date)
 */
public abstract class Pet
{
    private String myName;
    
    /**
     * @param myName name of pet
     */
    public Pet(String name)
    {
        myName = name;
    }
    
    public String getName()
    /**
     * @return the name of the pet by using as string
     */
    {
        return myName;
    }
    
    public abstract String speak();
}
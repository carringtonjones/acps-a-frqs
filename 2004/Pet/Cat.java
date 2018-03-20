/**
 * Write a description of class Cat here.
 *
 * @author (Carrington Jones)
 * @version (3/16/18)
 */
public class Cat extends Pet
{
    /**
     * Grabs the name and puts in the Pet class 
     */
    public Cat(String name)
    {
        super(name);
    }
    
    
    /**
     * @return meow meow that the cat makes
     */
    public String speak()
    {
        return "meow";
    }
}
   
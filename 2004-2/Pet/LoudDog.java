
/**
 * Write a description of class LoudDog here.
 *
 * @author (Carrington Jones)
 * @version (a version number or a date)
 */
public class LoudDog extends Dog
{
  /**
   * Grabs the name and puts in the Pet class and Dog class 
   */
  public LoudDog(String name)
  {
      super(name);
  }
  
  /**
   * @return super.speak super.speak grabs the sound the dog makes for the Pet and Dog class
   */
  public String speak()
  {
      return super.speak() + " " + super.speak();
  }
}
    
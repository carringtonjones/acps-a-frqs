import java.util.ArrayList;

public class Kennel
{
    private ArrayList<Pet> petList;
    
    public Kennel(ArrayList<Pet> petList)
    {
        this.petList = petList;
    }
    /** 
     * postcondition: for each Pet in the kennel, its name followed 
     * by the result of a call to its speak method has been printed, one line per Pet 
     * 
     */
    public void allSpeak()
    {
        for (Pet p : petList) 
        {
            System.out.println(p.getName() + ": " + p.speak());
        }
    }
}
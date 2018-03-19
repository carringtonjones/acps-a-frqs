
import java.util.ArrayList;

public class PetTester
{
   public static void main(String[] args)
   {
       Pet fido = new Dog("Fido");
       Pet rex = new LoudDog("Rex");
       Pet whiskers = new Cat("Whiskers");
       
       ArrayList<Pet> allPets = new ArrayList<Pet>();
       allPets.add(fido);
       allPets.add(rex);
       allPets.add(whiskers);
       
       Kennel myKennel = new Kennel(allPets);
       myKennel.allSpeak();
    }
}
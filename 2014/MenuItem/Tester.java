
/**
 * Write a description of class Tester here.
 *
 * @author (Carrington Jones)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String args[]) {
        Sandwich Cheeseburger = new Sandwich("Cheeseburger", 2.75);
        Salad SpinachSalad = new Salad("Spinach Salad", 1.25);
        Drink OrangeSoda = new Drink("Orange Soda", 1.25);
        
        Trio trio = new Trio(Cheeseburger, SpinachSalad, OrangeSoda);
        
        System.out.println(trio.getName());
        System.out.println(trio.getPrice());
    }
}

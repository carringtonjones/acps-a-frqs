/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main (String args[]) {
        MasterOrder goodies = new MasterOrder();
        goodies.addOrder(new CookieOrder("Chocolate Chip", 1));
        goodies.addOrder(new CookieOrder("Shortbread", 5));
        goodies.addOrder(new CookieOrder("Macaroon", 2));
        goodies.addOrder(new CookieOrder("Chocolate Chip", 3));
        
        System.out.println(goodies);
        System.out.println(goodies.removeVariety("Chocolate Chip"));
        System.out.println(goodies);
        
        System.out.println(goodies);
        System.out.println(goodies.removeVariety("Brownie"));
        System.out.println(goodies);
    }
}
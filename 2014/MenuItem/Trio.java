
/**
 * Write a description of class Trio here.
 *
 * @author (Carrington  Jones)
 * @version (a version number or a date)
 */
public class Trio implements MenuItem
{
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;
    
    /**
     * Constructor for objects of class Trio
     * 
     * @param  sandwich A sandwich menu item.
     * @param  salad A salad menu item.
     * @param  drink A drink menu item. 
     */
    public Trio(Sandwich sandwich, Salad salad, Drink drink)
    {
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
    }

    public String getName()
    {
        return sandwich.getName() + "/" + salad.getName() + "/" + drink.getName() + " Trio";
    }
    
    public double getPrice() {
        double a = Math.min(sandwich.getPrice(), Math.min(salad.getPrice(), drink.getPrice()));
        double b = sandwich.getPrice() + salad.getPrice() + drink.getPrice();
        
        return b - a;
    }
}

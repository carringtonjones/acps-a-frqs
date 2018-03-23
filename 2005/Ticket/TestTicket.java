/**
 * Write a description of class TestTicket here.
 *
 * @author (Carrington Jones)
 * @version (3/20/18)
 */
public class TestTicket
{
    public static void main(String args[]) {
        Ticket s1 = new Walkup();
        System.out.println(s1.toString());
        System.out.println();
        
        Ticket s2 = new Advance(2);
        System.out.println(s2.toString());
        System.out.println();
        
        Ticket s3 = new Advance(11);
        System.out.println(s3.toString());
        System.out.println();
        
        Ticket s4 = new StudentAdvance(4);
        System.out.println(s4.toString());
        System.out.println();
        
        Ticket s5 = new StudentAdvance(20);
        System.out.println(s5.toString());
    }
}


/**
 * Write a description of class Tester here.
 *
 * @author (Carrington Jones)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String args[]) {
        ClimbingClub hikerClub = new ClimbingClub();
        hikerClub.addClimb("Monadnock", 274);
        hikerClub.addClimb("Whiteface", 301);
        hikerClub.addClimb("Algonquin", 225);
        hikerClub.addClimb("Monadnock", 344);
        hikerClub.addClimb("Paris Mountain", 274);
        hikerClub.addClimb("Alpine", 274);
        
        System.out.println(hikerClub);
        System.out.println(hikerClub.distinctPeakNames());
        
    }
}
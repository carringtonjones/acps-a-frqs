
/**
 * Write a description of class NumberCubeTester here.
 *
 * @author (Carrington Jones)
 * @version (2/13/18)
 */
import java.util.Arrays;

public class NumberCubeTester
{
   public static int[] getCubeTosses(NumberCube cube, int numTosses) {
       int[]tosses = new int [numTosses];
       for(int i = 0; i < tosses.length; i = i + 1) {
           tosses [i] = cube.toss(); 
        }
        return tosses;
    }
    
   public static int getLongestRun(int[] values) {
       int lengthOfLongestRun = 1;
       int StartOfLongestRun = -1;
       int lengthOfCurrentRun = 1;
       
       for(int i = values.length-2; i > 0; i--) {
           if (values [i] == values [i + 1]) {
               lengthOfCurrentRun++;
               
               if(lengthOfCurrentRun > lengthOfLongestRun) {
                   lengthOfLongestRun = lengthOfCurrentRun;
                   StartOfLongestRun = i;
               }
           }
            else {
                lengthOfCurrentRun = 0;
           }
       }
       return StartOfLongestRun;
    }
    
   public static void main(String args[]) {
        NumberCube c1 = new NumberCube();
        int[] r1 = getCubeTosses(c1, 18);
        System.out.println(Arrays.toString(r1));
        System.out.println(getLongestRun(r1));
        
        NumberCube c2 = new NumberCube();
        int[] r2 = getCubeTosses(c2, 18);
        System.out.println(Arrays.toString(r2));
        System.out.println(getLongestRun(r2));
    }
}

            
               
   
     
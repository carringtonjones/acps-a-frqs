/**
 * Takes two positive integers as parameters, representing a start value and number of values
 *
 * @author Carrington Jones
 * @version 11/14/17
 */
import java.util.Arrays;

public class SelfDivisorTester
{
    public static void main(String[] args)
       {
           //states if this is a self divisior or not (true)
           System.out.println(SelfDivisor.isSelfDivisor(128));
            //lists the values in an array
            System.out.println(Arrays.toString(SelfDivisor.firstNumSelfDivisors(10, 3)));
       }

}
/**
 * Takes a positive integer as its parameter and finds the self-divisor
 *
 * @author Carrington Jones
 * @version 11/14/17
 */
public class SelfDivisor
{
    /**
     * @param num the number being tested
     * Precondition: num > 0 
     * @param  n  integer that needs to be checked
     * @return true if every decimal digit of the number is a divisor of the number, if not then its false
     */    
    public static boolean isSelfDivisor(int num)
    {
        int n = num;
        while (num > 0) {
            int d = num % 10;
            if (d == 0 || num % d != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
    
    /**
     * Finds the first "n" self divisors given a start point
     * @param  s  start the number to start looking for self divisors
     * Precondition: start > 0
     * @param  num  the number of self divisors to be returned
     * Precondition: num > 0 
     * @return  an array containing the first num integers > start that are self-divisors
     */   
    public static int[] firstNumSelfDivisors(int start, int num) {
        int[] r = new int[num];
        int count = 0;
        int s = start;
        
        while (count < num) {
            if (isSelfDivisor(s)) {
               r[count] = s;
               count++;
            }
            s++;
        }
     
        return r;
    }
}

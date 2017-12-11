 




public class SelfDivisor {

    public static boolean isSelfDivisor(int number) {
        String numAsString = Integer.toString(number);
        int numDigits = numAsString.length();

        for (int digit=0; digit < numDigits; digit++) {
            int divisor = Integer.parseInt(numAsString.substring(digit, digit+1));

            if (divisor == 0 || number % divisor != 0) {
                return false;
                
            }
        }
        return true;
        
    }

    public static int[] firstNumDivisors(int start, int num) {
        int[] divisors = new int[num];
        int counter = 0;
        int testNum = start;

        while (counter < num) {
            if (isSelfDivisor(testNum)) {
                divisors[counter] = testNum;
                counter++;
                
            }
            testNum++;
            
        }
        return divisors;
        
    }
}

 
import java.util.Arrays;


public class DivisorTester {

    public static void main(String[] args) {
        printDivisorStatus(128);
        printDivisorStatus(26);
        printDivisorStatus(24);
        printDivisorStatus(100);

        printNextDivisors(10, 3);
        printNextDivisors(14, 5);
        printNextDivisors(20, 20);
    }

    public static void printDivisorStatus(int number) {
        System.out.printf("Is %d a self divisor? %b%n", number, SelfDivisor.isSelfDivisor(number));
        
    }

    public static void printNextDivisors(int start, int instances) {
        System.out.printf("What are the next %d self divisors after %d?%n%s%n", 
                          instances, start, Arrays.toString(SelfDivisor.firstNumDivisors(start, instances)));
    }

}

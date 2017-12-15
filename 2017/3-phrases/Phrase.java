
/**
 * Simple phrase class that makes changes to a phrase 
 * Worked with Matt Burnett 
 * 
 * @author Carrington Jones 
 * @version 12/12/17
 */
public class Phrase
{
    private String currentPhrase;

    /**
     * Constructs a new Phrase object
     * @param p Phrase
     */
    public Phrase(String p) {
        currentPhrase = p;
    }
    
    /**
     * @return the index of the nth occurence of str in the current phrase;
     * @return -1 if the nth occurence does not exist
     * Precondition: str.length() {@literal >} 0 and n {@literal >} 0 
     * Postcondition: the current phrase is not modified 
     * @param str String to find
     * @param n Nth occurence of String 
     */
    public int findNthOccurrence(String str, int n) {
        String check; 
        int cap = currentPhrase.length() - str.length();
        
        for (int i = 0; i < cap; i = i + 1) {
            check = currentPhrase.substring(i, i + str.length());
            
            if(check.equals(str)) {
                n--;
            }
            
            if (n < 1) {
                return i;
            }
        
        }
        return -1;
    }

    /**
     * Modifies the current phrase by replacing the nth occurence of str with repl
     * If the nth occurence does not exist, the current phrase is unchanged
     * Precondition: str.length() {@literal >} 0 and n {@literal >} 0
     * @param str String to find 
     * @param n Nth occurence of string
     * @param repl String to substitute in 
     */
    public void replaceNthOccurrence (String str, int n, String repl) {
        int index = findNthOccurrence(str, n);
        
        if (index > -1) {
            String start = currentPhrase.substring(0, index);
            String end = currentPhrase.substring(index + str.length());
            
            currentPhrase = start + repl + end;
        }
    }
    /**
     * @return the index of the last occurence of the str in the current phrase;
     * @return -1 if str is not found 
     * Precondition: str.length() {@literal >} 0 
     * Postcondition: the current phrase is not modified 
     * @param str String to find
     */
    public int findLastOccurrence(String str) {
        int i = 1;
        int lastval = -1;
        int check;
        
        while (true) {
            check = findNthOccurrence(str, i);
            
            if (check != -1) {
                lastval = check;
            } else {
                break;
            } 
            i++;
        }
        return lastval;
    }
    /** @return a string containing the current phrase */
    public String toString() {
        return currentPhrase;
    }
}


/** 
 * A constructor that takes a guess and produces a hint 
 * @author Carrington Jones
 * @version 12/7/17
 */
public class HiddenWord
{
    private String puzzle;

    /**
     * Constructor for objects of class Hiddenword
     * @param puzzle the given word puzzle
     */
    public HiddenWord(String puzzle)
    {
        this.puzzle = puzzle;
        
    }

    /**
     * Compararing the puzzle word to the guess and finds matching or close characters
     * @param  guess  the user's guess at the word
     * @return  the resulting string with matching and close characters
     */
    public String getHint(String guess)
    {
        String result = "";
        
        for (int i = 0; i < guess.length(); i = i + 1) {
            
            if (guess.charAt(i) == puzzle.charAt(i)) {
                result += guess.charAt(i);
            }
            
            else if (puzzle.contains(guess.substring(i, i+1))) {
                result += "+";
            }
            
            else {
                result += "*";
            }
            
        }
        
        return result;
    }
}

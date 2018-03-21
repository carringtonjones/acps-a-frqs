/**
 * 2004 APCS FRQ
 *
 * @author (Carrington Jones)
 * @version (2/5/18)
 */
import java.util.ArrayList;

public class WordList
{
    private ArrayList<String> myList; //contains strings made up of letters

    /**
     * Constructor for objects of class WordList
     * 
     * @param myList list of words
     */
    
    public WordList(ArrayList<String> myList)
    {
        this.myList = myList;
        
    }

    /**
     * Counts the number of words with a certain length
     * @return  count  the word count of the specific length
     * @param  len  the length of the string thats in the list
     * 
     * postcondition: returns the number of words in this WordList that
     * are exactly len letters long 
     */
    
    public int numWordsOfLength(int len)
    {
        
        int count = 0;
        
        for (String x: myList) {
            
            if (x.length() == len) count++;
            
        }
        
        return count;
        
    }
    
    /**
     * Removes the all words with a certain length from the list
     *
     * @param  len  the length of a string in the list
     * 
     * postcondition: all words are exactly len letters long
     * have been removed from this wordList, with the 
     * order of the remaining words unchanged
     */
    
    public void removeWordsOfLength(int len) {
        
        for (int i = myList.size()-1; i >= 0; i--) {
            
            if ((myList.get(i)).length() == len) {
                
                myList.remove(i);
                
            }
            
        }
    }
    
    /**
     * @return ArraryList as a string
     */
    
    public String toString() {
        
         return myList.toString();
        
    }
    
}




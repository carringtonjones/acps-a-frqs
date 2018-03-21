/**
 * Write a description of class WordListTester here.
 *
 * @author (Carrington Jones)
 * @version (2/5/18)
 */
import java.util.ArrayList;

public class WordListTester
{
   public static void main(String[] args)
   {
        ArrayList myList = new ArrayList();
        myList.add("cat");
        myList.add("mouse");
        myList.add("frog");
        myList.add("dog");
        myList.add("dog");
        
        WordList animals = new WordList(myList);
        
        System.out.println(animals.numWordsOfLength(4));
        System.out.println(animals.numWordsOfLength(3));
        System.out.println(animals.numWordsOfLength(2));
        
        animals.removeWordsOfLength(4);
        System.out.println(animals);
        
        animals.removeWordsOfLength(3);
        System.out.println(animals);
        
        animals.removeWordsOfLength(2);
        System.out.println(animals);
   }
}

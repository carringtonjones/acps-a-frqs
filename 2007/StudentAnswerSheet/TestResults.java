
/**
 * Write a description of class TestScores here.
 *
 * @author (Carrington Jones)
 * @version (2/7/18)
 */
import java.util.ArrayList;

public class TestResults
{
    private ArrayList<StudentAnswerSheet> sheets;

    /**
     * Constucts objects of the StudentAnswerSheet class
     */
    
    public TestResults(ArrayList<StudentAnswerSheet> sheets) {
        
        this.sheets = sheets;
        
    }
    
    /**
     * Precondition: sheets.size() > 0;
     * all answer sheets in sheets have the sasme number of answers
     *. 
     *
     * @param  key the list of correct answers represented as strings of length one
     * precondition: key.size() is equal to the number of answers in each of the answer sheets
     * in sheets
     * 
     * @return the name of the student with the highest score
     */
    
    public String highestScoringStudent(ArrayList<String> key)
    {
        
        String name = "";
        double score = Integer.MIN_VALUE;
        
        for (StudentAnswerSheet x : sheets) {
            
            if (x.getScore(key) > score) {
                
                score = x.getScore(key);
                name = x.getName();
                
            }
            
        }
        
        return name;
        
    }
}

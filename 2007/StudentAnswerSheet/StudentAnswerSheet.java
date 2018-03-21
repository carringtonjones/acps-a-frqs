
/**
 * Write a description of class StudentAnswerSheet here.
 *
 * @author (Carrington Jones)
 * @version (2/7/18)
 */
import java.util.ArrayList;

public class StudentAnswerSheet
{
   
    private ArrayList<String> answers; //the list of the students answers
    private String name;
    
    /**
     * Constructs objects of the StudentAnswerSheet class
     */
    
    public StudentAnswerSheet(String name, ArrayList<String> answers)
    {
        
        this.name = name;
        this.answers = answers;
        
    }

    /**
     * Where it gets the score of the student
     *
     * @param  key  the list of correct answers, represented as strings of length one
     * Precondition: key.size() is equal to the number of answers in the answer sheet
     * @return this student's test score
     * 
     */
    
    public double getScore(ArrayList<String> key)
    {
        
        double score = 0;
        
        for (int i = 0; i < key.size(); i++) {
            
            if (key.get(i).equals(answers.get(i))) score++;
            else if (!"?".equals(answers.get(i))) score -= 0.25;
            
        }
        
        return score;
    }
    
    /**
     * @return the name of the student
     */
    
    public String getName() {
        
        return name;
        
    }
}


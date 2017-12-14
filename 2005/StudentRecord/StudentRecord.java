/**
 * Constructor class for StudentRecord(s)
 * 
 * @author Carrington Jones
 * @version 11/14/17
 */ 

public class StudentRecord {
    private int[] scores;
    
    /**
     * Constructor for scores 
     * 
     * @param scores Tests scores in an array 
     */
    public StudentRecord(int[] scores) {
        this.scores = scores;
        
    }

    /**
     * Calculates the average of the test scores
     * 
     * @param first First set of scores in the array 
     * @param last Last position in the array
     * @return The average of all the scores
     */
    private double average(int first, int last) {
        double numScores = last - first + 1;
        int sum = 0;
        
        for (int i = first; i <= last; i = i + 1) {
            sum += scores[i];
            
        }
        return sum / numScores; 
        
    }
   
    /**
     * Determines if the student scores improvede of not
     * 
     * @return If student has improved or not improved
     */
    private boolean hasImproved() {
        for (int i = 0; i<scores.length - 1; i = i + 1) {
            if (scores[i+1] < scores[i]) {
                return false;
                
            }
        }
        return true;
        
    }

    /**
     * If student has improved it will average the test score5
     * 
     * @return Average of test scores based on the improvement of each score 
     */
    public double finalAverage() {
        if (this.hasImproved()) { 
            return average(scores.length / 2, scores.length - 1);
            
        }
        return average(0, scores.length - 1);
        
    }
    
}
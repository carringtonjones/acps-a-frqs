 /**
 * 
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;

public class Sound
{
    /**
     * 
     */
    private int[] samples;

    /**
     * Constructor for objects of Sound class
     * The array of values in this sound; guaranteed not to be null 
     * 
     * @param samples Samples in an array 
     */
    
    public Sound(int[] samples)
    {
        this.samples = samples;
        
    }

    /** 
     * Changes those values in this sound that have an amplitude greater than limit
     * Values greater than limit are changed to limit
     * Values less than -limit are changed to -limit
     *
     * @param limit the amplitude limit
     * @return the number of values in this sound that the message has changed
     */
    
    public int limitAmplitude(int limit)
    {
        
        int count = 0;
        
        for (int i = 0; i < samples.length; i = i + 1) {
            
            if (samples[i] > limit) {
                
                samples[i] = limit;
                count++;
                
            }
            else if (samples[i] < -limit) {
                
                samples[i] = -limit;
                count++;
                
            }
            
        }
        
        return count;
        
    }
    
    /** 
     *  Removes silence from beginning of sound
     * 0 is the value of silence 
     *  
     */
    
    public void trimSilenceFromBeginning() {
        int count = 0;
        
        while (samples[count] == 0) {
            
            count++;
            
        }
        
        int[] result = new int[samples.length-count];
        
        for (int i = count; i < samples.length; i = i + 1) {
            
            result[i-count] = samples[i];
            
        }
        
        samples = result;
    }
    
    /** 
     *  Outputs an array of trimSilence 
     *  @return Output of the samples in an array 
     */
    
    public String toString() {
        
        trimSilenceFromBeginning();
        return Arrays.toString(samples);
        
    }
}
 

public class SoundTester
{
    public static void main(String[] args) {
       
        int[] samples1 = {40, 2532, 17, -2300, -17, -4000, 2000, 1048, -420, 33, 15, -32, 2030, 3223};
        Sound r1 = new Sound(samples1);
        //after trimSilenceFromBeginning has been called, the instance variable samples will refer to 
        //the following array
        int[] samples2 = {0, 0, 0, 0, -14, 0, -35, -39, 0, -7, 16, 32, 37, 29, 0, 0};
        Sound r2 = new Sound(samples2);
        
        System.out.println(r1.limitAmplitude(2000));
        System.out.println(r1.toString());
        System.out.println(r2.limitAmplitude(2000));
        System.out.println(r2.toString());
    }
}
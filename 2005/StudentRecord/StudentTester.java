 

public class StudentTester{
    
    public static void main(String[] args) {
        
        int[] scores1 = {50, 50, 20, 80, 53};
        StudentRecord record1 = new StudentRecord(scores1);
        
        int[] scores2 = {20, 50, 50, 53, 80};
        StudentRecord record2 = new StudentRecord(scores2);
        
        int[] scores3 = {20, 50, 50, 80};
        StudentRecord record3 = new StudentRecord(scores3);
        
        System.out.println(record1.finalAverage());
        System.out.println(record2.finalAverage());
        System.out.println(record3.finalAverage());
    }
}
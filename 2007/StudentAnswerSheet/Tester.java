
/**
 * Write a description of class AnswerSheetTester here.
 *
 * @author (Carrington Jones)
 * @version (2/7/18)
 */
import java.util.ArrayList;
public class Tester
{
    public static void main(String args[]) {
        ArrayList student1 = new ArrayList();
        student1.add("A");
        student1.add("B");
        student1.add("D");
        student1.add("E");
        student1.add("A");
        student1.add("C");
        student1.add("?");
        student1.add("B");
        student1.add("D");
        student1.add("C");
        
        ArrayList student2 = new ArrayList();
        student2.add("B");
        student2.add("B");
        student2.add("B");
        student2.add("B");
        student2.add("A");
        student2.add("B");
        student2.add("B");
        student2.add("C");
        student2.add("A");
        student2.add("B");
        
        ArrayList student3 = new ArrayList();
        student3.add("A");
        student3.add("C");
        student3.add("D");
        student3.add("E");
        student3.add("B");
        student3.add("C");
        student3.add("E");
        student3.add("B");
        student3.add("B");
        student3.add("C");
        
        ArrayList key = new ArrayList();
        key.add("A");
        key.add("C");
        key.add("D");
        key.add("E");
        key.add("B");
        key.add("C");
        key.add("E");
        key.add("B");
        key.add("B");
        key.add("C");
        
        StudentAnswerSheet stu1 = new StudentAnswerSheet("Bobbye Jones", student1);
        StudentAnswerSheet stu2 = new StudentAnswerSheet("Carrington Jones", student2);
        StudentAnswerSheet stu3 = new StudentAnswerSheet("Madeline Jones", student3);
        
        ArrayList<StudentAnswerSheet> sheets = new ArrayList<StudentAnswerSheet>();
        sheets.add(stu1);
        sheets.add(stu2);
        sheets.add(stu3);
        
        TestResults results = new TestResults(sheets);
        
        System.out.println(stu1.getScore(key));
        System.out.println(stu2.getScore(key));
        System.out.println(stu3.getScore(key));
        
        System.out.println(results.highestScoringStudent(key));

    }
}


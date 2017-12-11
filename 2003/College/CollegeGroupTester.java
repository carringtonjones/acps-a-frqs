
/**
 * Write a description of class CollegeTester here.
 *
 * @author (Carrington Jones)
 * @version (11/23/17)
 */
public class CollegeGroupTester
{
    
     public static void main(String[] args)
       {
            College col1 = new College("Colgate University", "Northeast", 27025);
            College col2 = new College("Duke University", "Southeast", 26000);
            College col3 = new College("Kalamazoo College", "Midwest", 19764);
            College col4 = new College("Stanford University", "West", 25917);
            College col5 = new College("Florida International University", "Southeast", 10800);
            College col6 = new College("Dartmouth College", "Northeast", 27764);
            College col7 = new College("Spelman College", "Southeast", 11455);
            
            College[] myColleges = {col1, col2, col3, col4, col5, col6, col7};
            CollegeGroup colleges = new CollegeGroup(myColleges);
            
            //colleges that are in the range of 10,000 and 20,000
            College[] matches = colleges.getCollegeList("Southeast", 10000, 20000);
            
            for (int i = 0; i < matches.length; i = i + 1) {
                System.out.println(matches[i]);
                
            }
            
            //original tuition 
            System.out.println(col1);            
            colleges.updateTuition("Colgate University", 27500);
            //prints updated tuition
            System.out.println(col1);
            
       }
}


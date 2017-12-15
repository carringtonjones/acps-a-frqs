public class TrailTester
{
   public static void main(String[] args)
   {
        int[] trail1 = {100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100};
        Trail r1 = new Trail(trail1);
        
        int[] trail2 = {100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100};
        Trail r2 = new Trail(trail2);
        
        System.out.println(r1.isLevelTrailSegment(4, 5));
        System.out.println(r2.isDifficult());
   }

}
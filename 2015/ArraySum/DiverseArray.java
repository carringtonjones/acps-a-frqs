
/**
 * Write a description of class DiverseArray here.
 *
 * @author (Carrington Jones)
 * @version (a version number or a date)
 */
import java.util.Arrays;

public class DiverseArray
{
    /** Returns the sum of the entries in the one-dimensional array arr
     *  @param one-dimensional array arr
     *  @return sum of the array.
     */
    public static int arraySum(int[] arr) {
        int count = 0;
        for (int x: arr) {
            count += x;
        }
        return count;
    }

    /** Returns a one-dimensional array in whihc the entry at index k is the sum of 
     *  the entries in row k of the two-dimensional array arr2D
     *  @param two-dimensional array arr2D
     *  @return result one-dimensional array containing sums of each row.
     */
    public static int[] rowSums(int[][] arr2D) {
        int[] result = new int[arr2D.length];
        
        for (int i =0; i<arr2D.length; i++) {
            result[i] = arraySum(arr2D[i]);
        }
        
        return result;
    }
    
    /** Returns true if all rows in arr2D have different sums; false otherwise.
     *  @param two-dimensional array arr2D
     *  @return true or false based on if rows in arr2D have different sums.
     */
    public static boolean isDiverse(int[][] arr2D) {
        int count = 0;
        int[] result = rowSums(arr2D);
        for (int i = 0; i < result.length; i++) {
            count = 0;
            for (int x: result) {
                if (x == result[i]) count++;
            }
            if (count > 1) return false;
        }
        return true;
    }
    
    public static void main(String args[]) {
        
        int[][] mat1 = new int[][]{
          { 1, 3, 2, 7, 3},
          { 10, 10, 4, 6, 2},
          { 5, 3, 5, 9, 6},
          { 7, 6, 4, 2, 1},
        };
        
        System.out.println(Arrays.toString(rowSums(mat1)));
        System.out.println(isDiverse(mat1));
        
        int[][] mat2 = new int[][]{
          { 1, 1, 5, 3, 4},
          { 12, 7, 6, 1, 9},
          { 8, 11, 10, 2, 5},
          { 3, 2, 3, 0, 6},
        };  
        
        System.out.println(Arrays.toString(rowSums(mat2)));
        System.out.println(isDiverse(mat2));
    }
    
}

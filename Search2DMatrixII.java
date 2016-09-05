import java.util.*;
import java.io.*;
import java.math.*;
/*
See: https://leetcode.com/problems/search-a-2d-matrix-ii/

Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.

*/
class Search2DMatrixII  {

public class Solution  {
    public boolean searchMatrix(int[][] matrix, int target) {
         
      // case size 1
      if ( target == matrix[0][0] || target == matrix[matrix.length][matrix[0].length] )
        return true;
      for ( int i = 0; i < matrix.length-1; i++ ) {
        for ( int j = 0; j < matrix[i].length-1; j++ ) {
          int node = matrix[i][j];
          // check current node
          if ( target == node ) return true; //found
          // check right
          if ( target > matrix[i+1][j] ) {
            // check down
             if  ( target == matrix[i][j+1] )
              return true;
             //else if ( target > matrix[i][j+1] )
              //return false;
             else
              j++;
          }
        }
      }      
      return false;
    }
}


 public final static void main(String[] args)  {
    Search2DMatrixII mySearch2DMatrixII = new Search2DMatrixII();    
    Search2DMatrixII.Solution mySolution = mySearch2DMatrixII.new Solution();
    Scanner scan = new Scanner(System.in);
    int[][] matrix = new int[][] {
                        {1,   4,  7, 11, 15},
                        {2,   5,  8, 12, 19},
                        {3,   6,  9, 16, 22},
                        {10, 13, 14, 17, 24},
                        {18, 21, 23, 26, 30}
                      };
    int[][] matrix2 = new int[][] {{-1,-2}};
    String input = scan.nextLine();  
    String[] arrs = input.split(" ");
    boolean solution;
    for(int i = 0; i < arrs.length; i++) {
      int target = Integer.parseInt(arrs[i]);
      solution = mySolution.searchMatrix( matrix, target );
      System.out.println( solution );
    }    
 } //main
}

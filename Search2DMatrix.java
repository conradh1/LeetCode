import java.io.*;
import java.util.*;
/*

https://leetcode.com/problems/search-a-2d-matrix/

Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

* Integers in each row are sorted from left to right.
* The first integer of each row is greater than the last integer of the previous row.
For example,

Consider the following matrix:

{
  {1,   3,  5,  7},
  {10, 11, 16, 20},
  {23, 30, 34, 50}
}
Given target = 3, return true.

*/
public class Search2DMatrix {

  public static void main(String[] args) {
    // build the simple tree from chapter 11.
    int[][] matrix = {
                  {1,   3,  5,  7},
                  {10, 11, 16, 20},
                  {23, 30, 34, 50}
               };
    System.out.println( searchMatrix(matrix,3));
    System.out.println( searchMatrix(matrix,13));

  }


  public static boolean searchMatrix(int[][] matrix, int target) {
    for ( int i = 0; i < matrix.length; i++) {
      if ( matrix[i][0] == target || matrix[i][matrix[i].length-1] == target)
        return true;
      else if ( target > matrix[i][0] && target < matrix[i][matrix[i].length-1]) {
        int low = 0;
        int high = matrix[i].length-1;
        int pos = (low + high) / 2;

        while( (matrix[i][pos] != target) && (low <= high) ) {
          if ( matrix[i][pos] > target) {
            high = pos - 1;
          }
          else if ( matrix[i][pos] < target) {
            low = pos + 1;
          }
          pos = (low + high) / 2;
        }
        if ( low <= high) return true;
        else return false;
      }
    }
    return false;
  }
}

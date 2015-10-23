import java.util.*;
import java.io.*;
import java.math.*;
/*
See: https://leetcode.com/problems/move-zeroes/

Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.

*/
class MoveZeroes  {

public class Solution  {
    public void moveZeroes(int[] nums) {
      int lastZero = nums.length - 1; //position of where the zeroes are to be placed.
      for ( int i = 0; i <= lastZero; i++ ) {
        if ( nums[i] == 0 ) {                    
          for ( int j = i; j < lastZero; j++ ) {
            nums[j] = nums[j+1];
          }
          nums[lastZero] = 0;
          lastZero--;
          i--;          
        }      
      } //for 
      System.out.println(Arrays.toString(nums));
    }
}


 public final static void main(String[] args)  {
    MoveZeroes myMoveZeroes = new MoveZeroes();    
    MoveZeroes.Solution mySolution = myMoveZeroes.new Solution();
    Scanner scan = new Scanner(System.in);
    
    String input = scan.nextLine();  
    String[] arrs = input.split(" ");
    int[] nums = new int[arrs.length];
    for(int i = 0; i < arrs.length; i++) {
      nums[i] = Integer.parseInt(arrs[i]);
    }
    mySolution.moveZeroes( nums);
 } //main
}

import java.io.*;
import java.util.*;
/*

https://leetcode.com/problems/remove-duplicates-from-sorted-array/

Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
*/
public class RemoveDuplicates {

  public static void main(String[] args) {
    // build the simple tree from chapter 11.
    int[] ar = {1,1,2};
    System.out.println( removeDuplicates(ar));
  }


  public static int removeDuplicates(int[] nums) {


          if ( nums.length == 0 || nums == null) return 0;  // case size one
          if ( nums.length == 1 ) return 1;  // case size one

          int last = nums[0];
          int index = 1;
          for (int i = 1; i < nums.length; i++) {
              if ( last != nums[i] ) {
                  last = nums[i];
                  nums[index] = nums[i];
                  index++;
              }

          }
         return index;
      }
}

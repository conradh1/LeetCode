/*
1. Two Sum  QuestionEditorial Solution  My Submissions
Difficulty: Easy
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/

import java.util.Arrays;

public class TwoSum {

  public static void main(String[] args) {
    // build the simple tree from chapter 11.
    int[] ar = {0,4,3,0};
    System.out.println(Arrays.toString(twoSum(ar, 0)));
  }


  public static int[] twoSum(int[] nums, int target) {
    int[] twosum = { -1, -1 };

    if (nums.length == 0 )
      return new int[0];


    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    for ( int i = 0; i < nums.length; i++ )
      map.put(target - nums[i], i);
    for ( int i = 0; i < nums.length; i++ ) {
      Integer index = map.get(nums[i]);
      if ( index != null && i != index ) {
        twosum[0] = i;
        twosum[1] = index;
        return twosum;
      }
    }
  }
}

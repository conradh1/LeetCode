import java.util.*;
import java.math.*;

/*
See problem: https://leetcode.com/problems/house-robber/

You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
*/
class HouseRobber
{

   public static int rob(int[] nums ) {
      int one, two;
      one = two = 0;
      if ( nums.length > 2) {
        int sub2[] = Arrays.copyOfRange(nums, 2, nums.length);
	two = rob(sub2);
      }

      if ( nums.length > 1) {
        int sub1[] = Arrays.copyOfRange(nums, 1, nums.length);
	one = rob(sub1);
      }
      if ( nums.length == 0)
	return 0;
      else
	return Math.max(nums[0]+two,one);
   }
   public final static void main(String S[]) {
    int[] input = {1,2,3,5,100};
    System.out.println(rob(input));
  }
}

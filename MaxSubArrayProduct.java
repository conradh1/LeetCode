/*
https://leetcode.com/problems/maximum-product-subarray/

Find the contiguous subarray within an array (containing at least one number)
which has the largest product.

For example, given the array [2,3,-2,4],
the contiguous subarray [2,3] has the largest product = 6.

*/

import java.math.*;
public class MaxSubArrayProduct {

  public static void main(String[] args) {
    // build the simple tree from chapter 11.
    int[] ar = {2,4,-3,5,1};
    System.out.println(maxProduct(ar));
  }


  public static int maxProduct(int[] nums) {
    int current = 1;
    int max = Integer.MIN_VALUE;
    int size = nums.length;

    if ( nums.length == 0)
      return -1;
    if ( nums.length == 1 )
      return nums[0];

    for (int i = 0; i < size; i++) {
      if ( current == 0 ) {
	current = 1;
       }
      current *= nums[i];
      if (current > max )
        max = current;
    }

    current = 1;

    for (int i = size-1; i >= 0; i--) {
      if ( current == 0 ) {
	current = 1;
       }
      current *= nums[i];
      if (current > max )
        max = current;
    }
     return max;
  }

}

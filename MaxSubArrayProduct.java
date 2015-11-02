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
    int[] ar = {2,1,3,4,0,2,1,-5,-6};
    System.out.println(maxProduct(ar));
  }


  public static int maxProduct(int[] nums) {
    int current_product = 1;
    int max = Integer.MIN_VALUE;
    int size = nums.length;

    if ( nums.length == 0)
      return -1;
    if ( nums.length == 1 )
      return nums[0];


    for (int i = 0; i < size; i++) {
      for ( int j = 1; j < size; j++) {
	current_product = 1;
	for ( int k = i; k <= (i+j) && k < size; k++) {
	  current_product *= nums[k];
	}
	if ( current_product > max )
	  max = current_product;
      }
    }
     return max;
  }

}

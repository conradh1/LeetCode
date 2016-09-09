import java.io.*;
import java.util.*;
/*
Given an array of size n, find the majority element.
The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

https://leetcode.com/problems/majority-element/
*/
public class MajorityElement {

  public static void main(String[] args) {
    // build the simple tree from chapter 11.
    int[] ar = {1,1,2,2,2,2,4};
    System.out.println(majorityElement(ar));
  }


  public static int  majorityElement(int[] nums) {
    LinkedHashMap<Integer,Integer> myhash = new LinkedHashMap<Integer,Integer>();
    int majority = 0;

    if ( nums.length % 2 == 0) majority = nums.length / 2;
    else majority = (nums.length + 1) / 2;

    for ( int i = 0; i < nums.length; i++) {
      if ( !myhash.containsKey(nums[i])) {
       myhash.put(nums[i], 1);  // add first instance
      }
      else {
          int j = myhash.get(nums[i]);
          myhash.put(nums[i],++j);
          if (j > majority) return nums[i];
      }
    }
    return 0;
   }
}

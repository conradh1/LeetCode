/*
https://leetcode.com/problems/add-digits/

Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

Follow up:
Could you do it without any loop/recursion in O(1) runtime?
*/


import java.util.*;

public class IntersectionTwoArraysII {

  public static void main(String[] args) {
    // build the simple tree from chapter 11.
    int[] nums1 = { 1, 2, 2, 1};
    int[] nums2 = { 2, 2};
    System.out.println(Arrays.toString(intersect(nums1, nums2)) );
    
    

  }

  public static int[] intersect(int[] nums1, int[] nums2) {
  
    int start = -1, pos = 0, i = 0, j = 0;


    Arrays.sort(nums1);
    Arrays.sort(nums2);

    while ( i < nums1.length && j < nums2.length) {
	    while ( nums1[i] != nums2[j] ) {
	      if ( nums1[i] < nums2[j])
		i++;
	      else if ( nums1[i] > nums2[j])
		j++;
	      if ( i == nums1.length ) {
		i--;
		break;
	      }
	      if ( j == nums2.length ) {
		j--;
		break;
	      }
	    }
            if ( nums1[i] == nums2[j] ) {
                if ( start == -1 )
		  start = i;
                i++;
                j++;
                pos++;
            }
            else if ( nums1[i] < nums2[j])
	      i++;
	    else if ( nums1[i] > nums2[j])
	      j++;
    }


    if ( start == -1 ) return new int[0];
    int[] sub = new int[pos];
    

    j = 0;
    for ( i = start; i < pos+start; i++)  {
        sub[j] = nums1[i];
        j++;
    }
    return sub;
  }
}

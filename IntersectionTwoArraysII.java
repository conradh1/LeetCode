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
  
    int start = -1, pos = 0; 
    int max = -1;
      
    for ( int i = 0; i < nums1.length; i++ ) {
        for ( int j = 0; j < nums2.length; j++ ) {
            if ( nums1[i] == nums2[j] ) {
                pos = j;
                while ( i < nums1.length && j < nums2.length && nums1[i] == nums2[j] ){
                    i++;
                    j++;
                }
                if ( (j-pos) > max ) {
                    start = pos;
                    max = j-pos;                
                }
                
            }
            
        }
    }
    
    if ( max == -1 ) return new int[0];
    int[] sub = new int[max];
    
    System.out.println ("pos: "+start+ " max: "+max);
    int j = 0;
    for ( int i = start; i < max; i++)  {
        sub[j] = nums2[i];
        j++;
    }
    return sub;
  }
}

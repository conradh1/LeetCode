import java.util.*;
import java.io.*;
import java.math.*;
/*
Given a sorted integer array without duplicates, return the summary of its ranges.

For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].

See: https://leetcode.com/problems/summary-ranges/

*/
class SumRanges  {

public class Solution  {
    public List<String> summaryRanges(int[] nums) {
      List<String> ranges = new ArrayList<String>();
      int i  =0;
      for ( i = 0; i < nums.length-1; i++ ) {
        String tmp = Integer.toString(nums[i]);
        boolean isAppend = false;
        
        if ( nums[i]+1 == nums[i+1] ) {
          tmp+=("->");
          isAppend = true;
        }
          
        while ( i < nums.length-1 && nums[i]+1 == nums[i+1]) {          
            i++;            
        }        
        if (isAppend) {          
          tmp+=Integer.toString(nums[i]);
        }                
        ranges.add(tmp);        
      }   
      // add last index if needed
      if (i == nums.length -1) {
          ranges.add(Integer.toString(nums[i]));      
      }      
      return ranges;
    } 
}


 public final static void main(String[] args)  {
    SumRanges mySumRanges = new SumRanges();
    SumRanges.Solution mySolution = mySumRanges.new Solution();
    
    int[] range = {0,1,2,5,6,8,9,11,12};
       
    List<String> ranges = new ArrayList<String>();
    ranges = mySolution.summaryRanges(range);
    System.out.println(ranges);    
 
 } //main
}

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
class ShortestWordDistance  {

public class Solution  {
     public int shortestDistance(String[] words, String word1, String word2) {
      int pos1 = 0;
      int pos2 = 0;
      int shortest = words.length+1;
      
      for ( int i = 0; i < words.length; i++ ) {
        if ( words[i].equals(word1) ) 
          pos1 = i+1;
        else if ( words[i].equals(word2) ) 
          pos2 = i+1;      
        if ( pos1 != 0 && pos2 != 0 ) {
          int n = Math.abs(pos1 - pos2);
          if ( shortest > n ) shortest = n;
        }
      }      
      return shortest;  
     }
}


 public final static void main(String[] args)  {
    ShortestWordDistance myShortestWordDistance = new ShortestWordDistance();    
    ShortestWordDistance.Solution mySolution = myShortestWordDistance.new Solution();
    
    String[] words = {"practice", "makes", "perfect", "coding", "makes"};
    
    
    System.out.println(mySolution.shortestDistance( words, "coding", "practice"));
 } //main
}

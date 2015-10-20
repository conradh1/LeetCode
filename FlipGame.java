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
class FlipGame  {

public class Solution  {
     public List<String> generatePossibleNextMoves(String s) {
        List<String> solutionStrings = new ArrayList<String>();
        char[] signs = s.toCharArray();
        char plus = '+';
         for (int i = 0; i < signs.length-1; i++ ) {
           if ( signs[i] == '+' && signs[i+1] == '+') {               
               signs[i] = signs[i+1] = '-';
               String converted = new String(signs);
               solutionStrings.add(converted);
               signs[i] = signs[i+1] = '+'; //switch back
           }
         }        
        return solutionStrings;
     }
}


 public final static void main(String[] args)  {
    FlipGame myFlipGame = new FlipGame();    
    FlipGame.Solution mySolution = myFlipGame.new Solution();
    
    List<String> solutionStrings = new ArrayList<String>();
    solutionStrings = mySolution.generatePossibleNextMoves( "++++" );
    
    Iterator itr= solutionStrings.iterator();
    while(itr.hasNext())

  System.out.println(itr.next());
 } //main
}

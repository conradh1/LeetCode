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
class FlipGame2  {

public class Solution  {
     public boolean canWin(String s) {
        char[] signs = s.toCharArray();
        
        for (int i = 0; i < signs.length-1; i++ ) {
           if ( signs[i] == '+' && signs[i+1] == '+') {                              
               signs[i] = signs[i+1] = '-';
               String mod = new String(signs);
               // check if we have another move
               if (!canWin(mod)) return true;
               signs[i] = signs[i+1] = '+';
           }
           
        }        
        return false;
     }
}


 public final static void main(String[] args)  {
    FlipGame2 myFlipGame2 = new FlipGame2();    
    FlipGame2.Solution mySolution = myFlipGame2.new Solution();
    
    List<String> solutionStrings = new ArrayList<String>();
    
    System.out.println(mySolution.canWin( "++++++" ));
 } //main
}

/*
https://leetcode.com/problems/add-digits/

Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

Follow up:
Could you do it without any loop/recursion in O(1) runtime?
*/


import java.util.*;

public class AddDigits {

  public static void main(String[] args) {
    // build the simple tree from chapter 11.
    int n = 38;
    System.out.println("AddDigits: "+n+" is: "+addDigits(n));
     n = 3838;
    System.out.println("AddDigits: "+n+" is: "+addDigits(n));
    

  }

  public static int addDigits(int num) {
    String str = Integer.toString(num);
    char[] digits = str.toCharArray();
    int sum = 0;
    
    if ( digits.length == 1 ) return num;
    
    while ( digits.length != 1 ) {
        sum = 0;
        for ( int i = 0; i < digits.length; i++) {
            sum += Character.getNumericValue(digits[i]);        
        }
        str = Integer.toString(sum);
        digits = str.toCharArray();
    }
    
    return sum;
  }

}

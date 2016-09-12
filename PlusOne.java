import java.io.*;
import java.util.*;
/*

https://leetcode.com/problems/plus-one/

Given a non-negative number represented as an array of digits, plus one to the number.

The digits are stored such that the most significant digit is at the head of the list.

*/
public class PlusOne {

  public static void main(String[] args) {
    // build the simple tree from chapter 11.
    int[] ar = {1,1,2,2,2,2,9};
    System.out.println(Arrays.toString(plusOne(ar)));
  }


  public static int[] plusOne(int[] digits) {

    if ( digits[digits.length-1] < 9) {
      digits[digits.length-1]++;
      return digits;
    }

    for ( int i = digits.length-1; i >= 0; i--) {
      if ( digits[i] == 9 && i != 0) {
        digits[i] = 0;
      }
      else if ( digits[i] < 9 && i != 0) {
        digits[i]++;
        return digits;
      }
    }
    if (digits[0] < 9) {
      digits[0]++;
      return digits;
    }
    else {
      // carry over
      int[] newDigits = new int[digits.length+1];
      newDigits[0] = 1;
      newDigits[1] = 0;
      for (int i = 2; i < newDigits.length; i++) {
         newDigits[i] = digits[i-1];
      }
      return newDigits;
    }
   }
}

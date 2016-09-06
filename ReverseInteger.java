/*
1. Two Sum  QuestionEditorial Solution  My Submissions
Difficulty: Easy
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/

import java.util.Arrays;

public class ReverseInteger {

  public static void main(String[] args) {
    // build the simple tree from chapter 11.
    int x = -123;
    System.out.println(""+reverse(x));
  }


  public static long reverse(int x) {

    // case negative
    int start = 0;
    if ( x < 0 ) {
      start = 1;
    }

    /*
    String str = ""+x;
    String rev = new StringBuffer(str).reverse().toString();

    int reverse = Integer.parseInt(rev);

    return reverse;
    */

    char[] chars = (x+"").toCharArray();  // integer to char array
    String rev = "";

    // case single character
    if ( chars.length == 1 )
      return x;

    for ( int i = chars.length-1; i >= start; i--) {
       rev += ""+chars[i];

    }
    if ( start > 0 ) rev = chars[0]+rev;  // add negative sign

    long reverse = Long.parseLong(rev);
    //int reverse = 0;
    return reverse;

  }

}

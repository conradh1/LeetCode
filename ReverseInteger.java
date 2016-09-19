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
    int x = -2147483648;
    System.out.println(""+reverse(x));
  }


  public static int reverse(int x) {

    int neg = 1;
    if ( x < 0) neg = -1;

    Long reverse = new Long(x);
     reverse = Math.abs(reverse);
    char[] chars = (reverse+"").toCharArray();  // integer to char array
    String rev = "";

    // case single character
    if ( chars.length == 1 )
      return x;

    for ( int i = chars.length-1; i >= 0; i--) {
       rev += ""+chars[i];

    }

    reverse = Long.parseLong(rev)*neg;


    if ( reverse >= Integer.MAX_VALUE || reverse <= Integer.MIN_VALUE )
      return 0;
    //int reverse = 0;
    return Integer.parseInt(rev)*neg;

  }

}

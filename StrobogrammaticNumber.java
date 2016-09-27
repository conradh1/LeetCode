import java.util.*;
import java.io.*;

/*

https://leetcode.com/problems/strobogrammatic-number/

246. Strobogrammatic Number  QuestionEditorial Solution  My Submissions

A strobogrammatic number is a number that looks the same when rotated 180 degrees (looked at upside down).

Write a function to determine if a number is strobogrammatic. The number is represented as a string.

For example, the numbers "69", "88", and "818" are all strobogrammatic.

*/

public class StrobogrammaticNumber  {


public static boolean isStrobogrammatic(String num) {

  char[] numbers = num.toCharArray();
  String rev = "";

  for ( int i = numbers.length-1; i >= 0; i--) {
    // look for non-strobogrammatic number
    char c = numbers[i];
    if ( c == '2' || c == '3' || c == '4' || c =='5' || c =='7') return false;
    else if ( c == '6') c = '9';
    else if ( c == '9') c = '6';
    rev += c;
  }
  if ( num.equals(rev)) return true;
  return false;
}




public static void main(String args[]) {

  String num = "69";
  System.out.println(isStrobogrammatic(num));
  num = "88";
  System.out.println(isStrobogrammatic(num));
  num = "72";
  System.out.println(isStrobogrammatic(num));
  num = "818";
  System.out.println(isStrobogrammatic(num));

}

}
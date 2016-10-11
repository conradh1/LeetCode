/*
https://leetcode.com/problems/reverse-string/

Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".

Subscribe to see which companies asked this question

Show Tags
Show Similar Problems

*/

import java.util.*;

public class ReverseString {

  public static void main(String[] args) {
    // build the simple tree from chapter 11.
    String str = "hello";
    System.out.println(reverse(str));
    str = "leetcode";
    System.out.println(reverse(str));



  }


  public static String reverse(String s) {

    char[] letters = (s).toCharArray();  // integer to char array
    int mid = letters.length/2; // get the mid point

    if ( letters.length == 1 ) return s;

    for ( int i = 0, k = letters.length-1; i < mid && k >= 0; i++, k--) {
	char tmp = letters[i];
	letters[i] = letters[k];
	letters[k] = tmp;
    }
    String output = new String(letters);
    return output;

  }

}
/*
https://leetcode.com/problems/reverse-vowels-of-a-string/

Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
Given s = "hello", return "holle".

Example 2:
Given s = "leetcode", return "leotcede".

Note:
The vowels does not include the letter "y".

Subscribe to see which companies asked this question
*/

import java.util.*;

public class ReverseVowelsString {

  public static void main(String[] args) {
    // build the simple tree from chapter 11.
    String str = "hello";
    System.out.println(reverseVowels(str));
    str = "leetcode";
    System.out.println(reverseVowels(str));



  }


  public static String reverseVowels(String s) {

    char[] letters = (s).toCharArray();  // integer to char array
    char[] vowels = new char[letters.length];

    int c = 0;
    int top = 0;

    if ( letters.length == 0 || letters.length == 1)
      return s;

    for ( int i = 0; i < letters.length; i++) {

      if ( isVowel(letters[i])) {
	vowels[c] = letters[i];
	top = i;
	c++;
      }
    }

    c--;  //pull one back

    for ( int i = 0; i <= top; i++) {
      if ( isVowel(letters[i])) {
	letters[i] = vowels[c];
	c--;
      }
    }
    String output = new String(letters);
    return output;

  }

  private static boolean isVowel(char c) {
    if ( c == 'a' || c == 'e' || c == 'i' || c =='o' || c == 'u' ||
         c == 'A' || c == 'E' || c == 'I' || c =='O' || c == 'U'
         )
      return true;

    return false;

  }
}
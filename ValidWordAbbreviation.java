/*
https://leetcode.com/problems/valid-word-abbreviation/

Valid Word Abbreviation

Given a non-empty string s and an abbreviation abbr, return whether the string matches with the given abbreviation.

A string such as "word" contains only the following valid abbreviations:

["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", "w1r1", "1o2", "2r1", "3d", "w3", "4"]
Notice that only the above abbreviations are valid abbreviations of the string "word". Any other string is not a valid abbreviation of "word".

Note:
Assume s contains only lowercase letters and abbr contains only lowercase letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":

Return true.
Example 2:
Given s = "apple", abbr = "a2e":

Return false.
*/


import java.util.*;

public class ValidWordAbbreviation {

  public static void main(String[] args) {
    // build the simple tree from chapter 11.
    String str = "apple";
    String abbr = "a2l";
    System.out.println( validWordAbbreviation( str, abbr));
    str = "internationalization";
    abbr = "i12iz4n";
    System.out.println( validWordAbbreviation( str, abbr));

  }

  public static boolean validWordAbbreviation(String word, String abbr) {
    char[] letters = (word).toCharArray();
    char[] abrrs = (abbr).toCharArray();
    
    int pos = 0, i = 0;
    while ( i < abrrs.length ) {
        
        if ( pos >= letters.length) return false;
        
        char c = abrrs[i];
        
        if ( Character.isLetter(c) ) {
            if ( letters[pos] == c ) {
                i++;
                pos++;
            }
            else 
                return false;
        }
        else if ( Character.isDigit(c) ) {
            String num = "";
            
            if ( c == '0') return false; // starts with 0
            while ( i < abrrs.length && (abrrs[i] >= '0' && abrrs[i] <= '9')) {
                num += abrrs[i];
                i++;
            }
            pos += Integer.parseInt(num);
        }          
    }
    return ( letters.length == pos );
  }

}

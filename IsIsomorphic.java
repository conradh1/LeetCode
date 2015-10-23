import java.util.*;
import java.io.*;
import java.math.*;
/*
Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

For example,
Given "egg", "add", return true.

Given "foo", "bar", return false.

Given "paper", "title", return true.

See: https://leetcode.com/problems/isomorphic-strings/

*/
class IsIsomorphic  {

public class Solution  {
    public boolean isIsomorphic(String s, String t) {
      int size = s.length();      
      Hashtable<Character, Character> match = new Hashtable<Character, Character>();
      
      // case empty string
      if ( s == null || t == null )
        return false;
      if ( s.length() != t.length() )
        return false;
            
      for ( int i = 0; i < size; i++ ) {
        if (match.containsKey(s.charAt(i))) {
          if ( match.get(s.charAt(i)) != t.charAt(i) )
            return false;        
        }
        else if ( match.containsValue(t.charAt(i))) {
            return false;
        }
        else {
          match.put(s.charAt(i),t.charAt(i));
        }
      }
      return true;
    }
    
    public boolean isIsomorphic2(String s, String t) {
     
      if ( s == null || t == null)
        return false;
      
      int size = s.length();
      for ( int i = 0; i < size; i++ ) {
        char sLetter = s.charAt(i);
        char tLetter = t.charAt(i);
        for ( int j = i; j < size; j++ ) {
          if ( sLetter == s.charAt(j) && tLetter != t.charAt(j) )
            return false;
          if ( sLetter != s.charAt(j) && tLetter == t.charAt(j) )
            return false;                                 
        }
      
      }
    
      return true;
    }
}


 public final static void main(String[] args)  {
    IsIsomorphic myIsIsomorphic = new IsIsomorphic();
    IsIsomorphic.Solution mySolution = myIsIsomorphic.new Solution();
       
    if ( mySolution.isIsomorphic2( "egg","add") ) 
      System.out.println("true");
    else
      System.out.println("false");      
 } //main
}

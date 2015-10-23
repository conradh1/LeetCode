import java.util.*;
import java.io.*;
import java.math.*;
/*
See: https://leetcode.com/problems/alien-dictionary/#

There is a new alien language which uses the latin alphabet. However, the order among letters are unknown to you. You receive a list of words from the dictionary, where words are sorted lexicographically by the rules of this new language. Derive the order of letters in this language.

For example,
Given the following words in dictionary,

[
  "wrt",
  "wrf",
  "er",
  "ett",
  "rftt"
]
The correct order is: "wertf".

*/
class AlienDictionary  {

public class Solution  {
    public String alienOrder(String[] words) {
      char[] alpha = new char[27];

      for ( int i = 0; i < words.length; i++ ) {
	char[] letters = words[i].toCharArray();
	for ( int j = 0; j < letters.length; j++ ) {
          boolean foundAlready = false;
          int w = 0;
          while ( alpha[w] != '\0' ) {
            if ( alpha[w] == letters[j] ) {
              foundAlready = true;
              break;
            }
            w++;
          }
	  if ( alpha[j] == '\0' ) {
	    alpha[j] = letters[j];  //add into empty slot
	  }
	  else if ( !foundAlready && alpha[j] != letters[j] ) {	    
	    //slot already taken move everything down.
	    char tmp1 = alpha[j+1];
	    alpha[j+1] = letters[j];
	    int k = j+1;
	    while ( alpha[k] != '\0' ) {
	      char tmp2 = alpha[k+1];
	      k++;
	      alpha[k] = tmp1;
	      tmp1 = tmp2;	      
	    }
	  }	  
	}
      }
      String alienDictionary = new String();
      int k = 0;
      while ( alpha[k] != '\0' ) {
        alienDictionary += alpha[k];
        k++;
      }
      
      return alienDictionary;
    }
    
    public String alienOrder2(String[] words) {
      String alienDictionary = new String("");
      int pos =0;      
      int max = 1;
      for ( int k = 0; k < words.length; k++ ) { 
          for ( int i = 0; i < words.length; i++ ) {             
            if ( pos < words[i].length()) {
              char letter = words[i].charAt(pos);
              if ( alienDictionary.indexOf(letter) == -1) {
                alienDictionary += letter;
              }
            }
          }      
          pos++;        
      }
      return alienDictionary;
    }
}


 public final static void main(String[] args)  {
    AlienDictionary myAlienDictionary = new AlienDictionary();
    AlienDictionary.Solution mySolution = myAlienDictionary.new Solution();
    String[] words = {
			"wrt",
			"wrf",
			"er",
			"ett",
			"rftt"
		      };
		    
    String[] words2 = {"aac","aabb","aaba"};
    System.out.println(mySolution.alienOrder2( words2 ));
 } //main
}

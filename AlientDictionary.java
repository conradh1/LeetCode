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
      char[] alpha = new char[26];

      for ( int i = 0; i < words.length; i++ ) {
	char[] letters = words[i].toCharArray();
	for ( int j = 0; j < letters.length; j++ ) {
	  if ( alpha[j] == '\0' ) {
	    alpha[j] = letters[j];
	  }
	  else if ( alpha[j] != letters[j] ) {
	    int k = j;
	    char tmp1 = alpha[j];
	    alpha[j] = letters[j];
	    while ( alpha[k] != '\0' ) {
	      char tmp2 = alpha[k+1];
	      alpha[k] = tmp1;
	      tmp1 = tmp2;
	      k++;
	    }
	  }
	}
      }
      String alienDictionary = new String(alpha);
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

    System.out.println(mySolution.alienOrder( words ));
 } //main
}

/*
https://leetcode.com/problems/word-break/

Word Break

Given a string s and a dictionary of words dict, determine if s can be segmented into a space-separated sequence of one or more dictionary words.

For example, given
s = "leetcode",
dict = ["leet", "code"].

Return true because "leetcode" can be segmented as "leet code".
*/


import java.util.*;

public class WordBreak {

  public static void main(String[] args) {
    // build the simple tree from chapter 11.
    Set<String> dict = new HashSet<String>();
    dict.add("leet");
    dict.add("code");
    System.out.println( wordBreak("leetcode", dict));

  }

  public static boolean wordBreak(String s, Set<String> wordDict) {
    int min = wordDict.size();


    for (String word : wordDict) {
      if ( s.contains(word) ) {        
        s = s.replace(word,"");
      }
    }
    if ( s.equals("")) return true;
    return false;
  }

}

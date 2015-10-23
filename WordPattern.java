import java.util.*;
import java.io.*;
import java.math.*;
/*
iven a pattern and a string str, find if str follows the same pattern.

Examples:
pattern = "abba", str = "dog cat cat dog" should return true.
pattern = "abba", str = "dog cat cat fish" should return false.
pattern = "aaaa", str = "dog cat cat dog" should return false.
pattern = "abba", str = "dog dog dog dog" should return false.
Notes:
patterncontains only lowercase alphabetical letters, and str contains words separated by a single space. Each word in str contains only lowercase alphabetical letters.
Both pattern and str do not have leading or trailing spaces.
Each letter in pattern must map to a word with length that is at least 1.

See: https://leetcode.com/problems/word-pattern/

*/
class WordPattern  {

public class Solution  {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        char[] letters = pattern.toCharArray();
        LinkedHashMap<Character, String> wordList = new LinkedHashMap<Character, String>();
        
        if ( words.length != letters.length ) return false;
        
        for ( int i  = 0; i < letters.length; i++ ) {
          // if we've seen this before, it should match
          if ( wordList.containsKey( letters[i] )) {
            String word = wordList.get( letters[i] );
            if ( !words[i].equals(word) ) 
              return false;
          }
          else {
             // Get a set of the entries
            Set set = wordList.entrySet();
            // Get an iterator
            Iterator itr = set.iterator();
            // Display elements            
            while(itr.hasNext()) {
              Map.Entry me = (Map.Entry)itr.next();
              //System.out.print(me.getKey() + ": ");
              // check for duplicates
              if ( words[i].equals( me.getValue() )) 
                return false;
            }
            wordList.put( letters[i], words[i] );  //add new
          }          
        } //for            
        return true;
    }
}


 public final static void main(String[] args)  {
    WordPattern myWordPattern = new WordPattern();
    WordPattern.Solution mySolution = myWordPattern.new Solution();
    Scanner scan = new Scanner(System.in);
    
    int num = scan.nextInt();  // Get the number of tests.
    scan.nextLine();
    for (int i = 1; i <= num; i++) {
      String pattern = scan.nextLine();
      String sentence = scan.nextLine();
      //System.out.println("pattern|"+pattern+"|sentence"+sentence );
      if ( mySolution.wordPattern(pattern, sentence) ) 
        System.out.println("true");
      else
        System.out.println("false");
      
    }
 } //main
}

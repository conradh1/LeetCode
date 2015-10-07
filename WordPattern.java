import java.util.*;
import java.io.*;
import java.math.*;
/*
Determines whether a string reverse is funny or not based on its char value being zero.
See: https://www.hackerrank.com/challenges/funny-string

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

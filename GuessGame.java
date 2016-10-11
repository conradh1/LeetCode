import java.util.*;
import java.io.*;

/*

https://leetcode.com/problems/guess-number-higher-or-lower/


We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked.

Every time you guess wrong, I'll tell you whether the number is higher or lower.

You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):
*/

public class GuessGame {



    int g;

    public GuessGame (int n) {
      this.g = n;
    }

    public int guessNumber(int n) {
      int f = 1, l = n, m = -1, guess;


      while ( f <= l ) {
        m = f+(l-f)/2;
        guess = guess(m);
	if ( guess == 1)
	  f = m+1;
        else if ( guess == -1)
          l = m-1;
        else if ( guess == 0)
	  return m;
      }
      return m;
    }

    public int guess(int n) {

      if ( n < this.g ) return 1;
      if ( n > this.g ) return -1;
      return 0;
    }


public static void main(String args[]) {

  GuessGame guess = new GuessGame(3);

  System.out.println(guess.guessNumber(10));
  //System.out.println(guess.guessNumber(100));
}

}
/*
https://leetcode.com/problems/power-of-two/


Given an integer, write a function to determine if it is a power of two.

*/


import java.util.*;

public class PowerThree {

  public static void main(String[] args) {

    System.out.println( isPowerOfThree(3));
    System.out.println( isPowerOfThree(27));
    System.out.println( isPowerOfThree(1024));

  }

  public static boolean isPowerOfThree( int n) {
    if ( n == 1 ) return true;
    
    while ( n > 0 ) {
        int m = n%3;
        if ( m == 0) {
            n = n/3;            
            if ( n == 1 ) return true;
        }
        else 
            return false;
    }
    return false;
  }

}

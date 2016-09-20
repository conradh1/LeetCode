/*
https://leetcode.com/problems/power-of-two/


Given an integer, write a function to determine if it is a power of two.

*/


import java.util.*;

public class PowerTwo {

  public static void main(String[] args) {

    System.out.println( isPowerOfTwo(2));
    System.out.println( isPowerOfTwo(-2147483648));
    System.out.println( isPowerOfTwo(1024));

  }

  public static boolean isPowerOfTwo( int n) {
    String bin = Integer.toBinaryString(n);
    char[] bins = bin.toCharArray();
    int found = 0;

    if ( n < 0) return false;
    for ( int i = 0; i < bins.length; i++) {
        if ( bins[i] == '1')
          found++;
    }
    if ( found == 1 )return true;
    return false;
  }

}

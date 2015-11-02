/*
https://leetcode.com/problems/find-the-celebrity/

Suppose you are at a party with n people (labeled from 0 to n - 1) and among them, there may exist one celebrity. The definition of a celebrity is that all the other n - 1 people know him/her but he/she does not know any of them.

Now you want to find out who the celebrity is or verify that there is not one. The only thing you are allowed to do is to ask questions like: "Hi, A. Do you know B?" to get information of whether A knows B. You need to find out the celebrity (or verify there is not one) by asking as few questions as possible (in the asymptotic sense).

You are given a helper function bool knows(a, b) which tells you whether A knows B. Implement a function int findCelebrity(n), your function should minimize the number of calls to knows.

Note: There will be exactly one celebrity if he/she is in the party. Return the celebrity's label if there is a celebrity in the party. If there is no celebrity, return -1.

*/

import java.math.*;
import java.util.*;
public class FindCelebrity {

  public static void main(String[] args) {
    // build the simple tree from chapter 11.
    System.out.println(findCelebrity(5));

  }

  public static boolean knows(int a, int b) {
    // 3 is the celeb
    if ( a == 2)
      return false;
    if ( b == 2 )
      return true;
    if ( a ==0 && b == 4)
      return true;
    if ( a == 1 && b == 3 )
      return true;
    if ( a ==3 && b == 0)
      return true;
    if ( a ==4 && b == 1)
      return true;
    return false;
  }

  public static int findCelebrity(int n) {
    int[] tk = new int[n];  // number of people a knows
    int[] kt = new int[n];  // number of people knows a

    int celeb = -1;
    for ( int i = 0; i < n; i++ ) {
      for ( int j = 0; j < n; j++ ) {
	if ( i != j ) {
	  if ( tk[i] > 0 )
	    continue;
	  if ( knows(i,j) ) {
	    tk[i]++;
	  }
	  if ( knows(j,i) ) {
	    kt[i]++;
	  }
	}
      }
    }

    for ( int i = 0; i < n; i++ ) {
      if ( tk[i] == 0 && kt[i] == n-1 ) {
	celeb = i;
	break;
      }
    }

    return celeb;
  }

}

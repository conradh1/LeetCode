/*
https://leetcode.com/problems/valid-parentheses/

Valid Parentheses

Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid
but "(]" and "([)]" are not.
*/

import java.util.*;
import java.io.*;

public class ValidParentheses {

  public static void main(String[] args) {
    // build the simple tree from chapter 11.
    String str = "(){}[]";
    System.out.println("Test 1:"+str+isValid(str) );
    str = "(())[]{[]}";
    System.out.println("Test 2:"+str+isValid(str) );
    str = "((";
    System.out.println("Test 3:"+str+isValid(str) );
  }


  public static boolean isValid(String s) {
    char[] pars = s.toCharArray();
    Stack<Character> stack = new Stack<Character>();
    char last;

    if ( pars.length == 1 ) return false;
    for ( int i = 0; i < pars.length; i++ ) {
      switch ( pars[i] ) {

	case '{':
	case '[':
	case '(': stack.push(pars[i]);
		  break;

	case '}': if ( stack.isEmpty()) return false;
		  last = stack.pop();
		  if ( last != '{' ) return false;
		  break;

	case ']': if ( stack.isEmpty()) return false;
	          last = stack.pop();
		  if ( last != '[' ) return false;
		  break;

	case ')': if ( stack.isEmpty()) return false;
	          last = stack.pop();
		  if ( last != '(' ) return false;
		  break;

	default:
	    return false;

       }
    }
    if (stack.isEmpty()) return true;
    else return false;
  }
}

import java.util.*;
import java.io.*;

/*

https://leetcode.com/problems/moving-average-from-data-stream/


346. Moving Average from Data Stream  QuestionEditorial Solution  My Submissions

Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.

For example,
MovingAverage m = new MovingAverage(3);
m.next(1) = 1
m.next(10) = (1 + 10) / 2
m.next(3) = (1 + 10 + 3) / 3
m.next(5) = (10 + 3 + 5) / 3
*/

public class AvDataStream  {


public static boolean isStrobogrammatic(String num) {

  char[] numbers = num.toCharArray();
  String rev = "";

  for ( int i = numbers.length-1; i >= 0; i--) {
    // look for non-strobogrammatic number
    char c = numbers[i];
    if ( c == '2' || c == '3' || c == '4' || c =='5' || c =='7') return false;
    else if ( c == '6') c = '9';
    else if ( c == '9') c = '6';
    rev += c;
  }
  if ( num.equals(rev)) return true;
  return false;
}




public static void main(String args[]) {

  String num = "69";
  System.out.println(isStrobogrammatic(num));
  num = "88";
  System.out.println(isStrobogrammatic(num));
  num = "72";
  System.out.println(isStrobogrammatic(num));
  num = "818";
  System.out.println(isStrobogrammatic(num));

}

}
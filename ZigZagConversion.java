import java.io.*;
import java.util.*;
/*

https://leetcode.com/problems/zigzag-conversion/

The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
(you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:

string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
Show Tags

*/
public class ZigZagConversion {

  public static void main(String[] args) {
    // build the simple tree from chapter 11.
    String str = "PAYPALISHIRING";
    System.out.println( convert( str, 3));
  }


  public static String convert(String str, int numRows) {

      char[] s = str.toCharArray();
      char[] t = new char[s.length];

      if (numRows == 1) return str;
      int offset = 2 * numRows - 2;
      for (int i = 0, len = 0; i < numRows; i++) {
          for (int j = 0, k = i; k < s.length; j++) {
              t[len++] = s[k];
              k += ((i == 0 || j % 2 == 0) && i != numRows - 1 ? 2 * (numRows - i - 1) : 2 * i);
          }
      }

      return Arrays.toString(t);
  }
}

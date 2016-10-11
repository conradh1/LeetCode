import java.util.*;
import java.io.*;
import java.math.*;
/*
https://leetcode.com/problems/binary-watch/

Binary Watch  QuestionEditorial Solution  My Submissions
Total Accepted: 7322
Total Submissions: 17103
Difficulty: Easy
A binary watch has 4 LEDs on the top which represent the hours (0-11), and the 6 LEDs on the bottom represent the minutes (0-59).

Each LED represents a zero or one, with the least significant bit on the right.


For example, the above binary watch reads "3:25".

Given a non-negative integer n which represents the number of LEDs that are currently on, return all possible times the watch could represent.

Example:

Input: n = 1
Return: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"]
Note:
The order of output does not matter.
The hour must not contain a leading zero, for example "01:00" is not valid, it should be "1:00".
The minute must be consist of two digits and may contain a leading zero, for example "10:2" is not valid, it should be "10:02".

*/
class BinaryWatch  {

public class Solution  {
     public List<String> readBinaryWatch(int num) {
	List<String> solution = new ArrayList<String>();
	int[] hours = { 8 , 4 ,2 ,1 };
	int[] minutes = { 32, 16, 8, 4, 2, 1 };


	// Do hour combinations
	while ( int i = 0; i < num; i++ );


	// Do minute combinations

	return solution;
    }
}


 public final static void main(String[] args)  {
    BinaryWatch myBinaryWatch = new BinaryWatch();
    BinaryWatch.Solution mySolution = myBinaryWatch.new Solution();

    List<String> solutionStrings = new ArrayList<String>();
    solutionStrings = mySolution.readBinaryWatch(1);

    Iterator itr= solutionStrings.iterator();
    while(itr.hasNext())
      System.out.println(itr.next());
 } //main
}

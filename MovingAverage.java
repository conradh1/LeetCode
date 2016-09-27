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

public class MovingAverage {

    Queue<Integer> q;
    double avg;
    int members;
    double total;
    int max;

    /** Initialize your data structure here. */
    public MovingAverage(int size) {
      q = new ArrayDeque<>(size);
      this.max = size;
      this.total = 0;
    }

    public double next(int val) {

      if ( q.size()  == this.max) {
          total -= q.poll();
      }

      q.offer(val);
      total += val;

      return (double) total/q.size();

    }


public static void main(String args[]) {
MovingAverage m = new MovingAverage(3);

System.out.println(m.next(1)); //= 1
System.out.println(m.next(10));/// = (1 + 10) / 2
System.out.println(m.next(3)); //= (1 + 10 + 3) / 3
System.out.println(m.next(5)); //= (10 + 3 + 5) / 3

}

}
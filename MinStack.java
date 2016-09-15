import java.util.*;
/*
https://leetcode.com/problems/min-stack/

Min Stack  QuestionEditorial Solution  My Submissions
Total Accepted: 89593
Total Submissions: 365766
Difficulty: Easy
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
Example:
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.

*/

public class MinStack {

    /** initialize your data structure here. */
    private Node head;
    private int value;

    public class Node {
      private int value;
      private Node next;
    }

    public MinStack() {
      head = null;
    }

    public void push(int x) {
       Node add = head;
       head = new Node();
       head.value = x;
       head.next = add;
    }

    public void pop() {
      head = head.next;
    }

    public int top() {
      Node temp = head;
      return temp.value;
    }

    public int printStack() {
      Node tmp = head;
      while ( tmp.next != null ) {
        System.out.print(tmp.value+" ");
        tmp = tmp.next;
      }
      System.out.println();
      return min;
    }
    public int getMin() {
      Node tmp = head;
      int min = tmp.value;
      while ( tmp.next != null ) {
        if ( tmp.value < min )
          min = tmp.value;
        tmp = tmp.next;
      }
      return min;
    }
    public static void main(String[] args) {
      // build the simple tree from chapter 11.
      MinStack minStack = new MinStack();
      minStack.push(-5);
      minStack.push(0);
      minStack.push(-3);
      minStack.push(4);
      minStack.printStack();
      System.out.println("Min: "+minStack.getMin());   // Returns -3.
      minStack.pop();
      System.out.println("Top: "+minStack.top());      // Returns 0.
      System.out.println("Min: "+minStack.getMin());   // Returns -2.

    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

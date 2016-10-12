import java.io.*;
import java.util.*;
/*


https://leetcode.com/problems/path-sum/

Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

For example:
Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \      \
        7    2      1
return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.

*/
public class BinaryTreePathSum {

  public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }

  }


  public static boolean hasPathSum(TreeNode root, int sum) {

    if ( root == null ) return false;

    else if ( root.val == sum & root.right == null && root.left == null ) return true;

    return (hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val));
  }

  public static void main(String ar[]) {
        TreeNode root = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);

        root.left = n2;
        root.right = n3;
        root.left.right = (n5);

	System.out.println("Sum:"+ hasPathSum(root,4));


  }



}
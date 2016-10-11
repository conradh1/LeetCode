import java.io.*;
import java.util.*;
/*


https://leetcode.com/problems/binary-tree-paths/

Given a binary tree, return all root-to-leaf paths.

For example, given the following binary tree:

   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:

["1->2->5", "1->3"]

*/
public class BinaryTreePaths {

  public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }

  }


  public static void preOrder( TreeNode node ) {
    if ( node  != null ) {
      System.out.print( node.val+" " );
      preOrder( node.left);
      preOrder( node.right);
    }
  }


  public static List<String> binaryTreePaths(TreeNode root) {

    Stack<TreeNode> s = new Stack<TreeNode>();
    Queue<String> q = new ArrayDeque<String>();
    List<String> list = new ArrayList<String>();
    String str = "";

    s.push(root);


    while ( !s.isEmpty() ) {
      TreeNode tmp = s.pop();
      if ( tmp.left != null ) {
	s.push( tmp.left);
	q.offer( tmp.left.val+"->");
      }
      if ( tmp.right != null ) {
	s.push( tmp.right);
	q.offer( tmp.right.val+"->");
      }
      if ( tmp.left == null && tmp.right == null ) {
         str = root.val+"->";
	 while (!q.isEmpty()) {
            str += q.poll();
        }
        list.add(str);
      }
    }
    return list;
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


        System.out.print("PreOrder: ");
        //preOrder(root);
	List<String> list = binaryTreePaths(root);
	 Iterator iter = list.iterator();
	while (iter.hasNext()) {      // any more element
         String str = (String)iter.next();
         System.out.println(str);
      }

  }



}
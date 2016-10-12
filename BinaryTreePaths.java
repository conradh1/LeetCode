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


  public static List<String> binaryTreePaths(TreeNode root) {

    Stack<TreeNode> s = new Stack<TreeNode>();
    List<String> list = new ArrayList<String>();
    Map<TreeNode, String> nodeMap = new HashMap<TreeNode, String>();

    if ( root == null ) return list;
    s.push(root);
    nodeMap.put(root, ""+root.val);

    while ( !s.isEmpty() ) {
      TreeNode node = s.pop();
      if ( node.left == null && node.right == null ) {
         list.add(nodeMap.get(node));
      }
      if ( node.right != null ) {
	s.push( node.right);
	nodeMap.put( node.right, nodeMap.get(node)+"->"+node.right.val);
      }
      if ( node.left != null ) {
	s.push( node.left);
	nodeMap.put( node.left, nodeMap.get(node)+"->"+node.left.val);
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

	List<String> list = binaryTreePaths(root);
	 Iterator iter = list.iterator();
	while (iter.hasNext()) {      // any more element
         String str = (String)iter.next();
         System.out.print(str+" ");
	}
	System.out.println();
  }



}
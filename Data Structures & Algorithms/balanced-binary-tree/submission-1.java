/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
   public boolean isBalanced(TreeNode root) {
    return check(root) != -1;
}

private int check(TreeNode node) {
    // Empty tree is balanced, height = 0
    if (node == null) return 0;
    
    // Check left subtree
    int left = check(node.left);
    if (left == -1) return -1;  // Left is not balanced
    
    // Check right subtree
    int right = check(node.right);
    if (right == -1) return -1; // Right is not balanced
    
    // Check current node
    if (Math.abs(left - right) > 1) {
        return -1;  // Current node is not balanced
    }
    
    // If we reach here, everything is balanced
    // Return the height of this node
    return 1 + Math.max(left, right);
}
}

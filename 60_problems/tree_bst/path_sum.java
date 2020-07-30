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
    public boolean hasPathSum(TreeNode root, int sum) {
        
//         if (root == null)  {
//             //             Sum == zero return true
//             return sum == 0;
//         }
        
        
//       use for [] 0 input because this will return false but still return true when the sum == 0 but not for null tree
//        for [] 0 input
        if (root == null) {
            return false;
        }
//         no childrens and root.val is equal to the remaining sum.
        if (root.left == null && root.right == null && sum - root.val == 0) {
            return true;
        }
        

        
        if (hasPathSum(root.left, sum - root.val)) {
            return true;
        }
        if (hasPathSum(root.right, sum - root.val)) {
            return true;
        }
        
        return false;
        
    }
}

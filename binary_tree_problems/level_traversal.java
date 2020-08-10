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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> re = new LinkedList<>();
        
        if(root == null) {
            return re;
        }
        
        
        Queue<TreeNode> queue = new LinkedList();        
        queue.offer(root);
        
        while(!queue.isEmpty()) {
            int level_size = queue.size();
            
            List<Integer> level_list = new LinkedList();
            
            for(int i = 0; i < level_size; i++) {
                TreeNode node = queue.poll();
                level_list.add(node.val);
                if(node.left != null) {
                    queue.offer(node.left);
                }
                if(node.right != null) {
                    queue.offer(node.right);
                }
            
            }
            
            re.add(level_list);
            
            
            
            
        }
        
        
        
        return re;
        
    }
}

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
            List<Integer> list=new ArrayList<>();
    public int minDiffInBST(TreeNode root) {

        inorder(root);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list.size()-1;i++){
            int diff=list.get(i+1)-list.get(i);
            min=Math.min(min,diff);
        }
        return min;
    }
    public void inorder(TreeNode root){
        if(root==null) return ;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
        // list.add(root.val);
    }
}
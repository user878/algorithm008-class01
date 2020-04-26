package week2;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        helper(root,ans);
        return ans;
    }
    public void helper(TreeNode root,List<Integer> ans){
          if (root != null) {
                ans.add(root.val);
                if (root.left != null ) {
                   helper(root.left,ans);
                }
                if (root.right != null ) {
                   helper(root.right,ans);
                }
          }
    }
}

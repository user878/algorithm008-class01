package week2;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> postorder(Node root) {
        List <Integer> list = new ArrayList<>();
        helper(root,list);
        return  list;
    }
    public void helper(Node root,List<Integer> list){
             if (root != null) {
                 if (root.left != null) {
                   helper(root.left,list);
                 }
                 if(root.right != null){
                    helper(root.right,list);
                 }
                 list.add(root.val);
             }
    }
}

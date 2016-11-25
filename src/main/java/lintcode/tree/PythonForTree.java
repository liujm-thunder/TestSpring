package lintcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liujianmeng on 16/9/29.
 */
public class PythonForTree {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> tree = new ArrayList<ArrayList<Integer>>();
        if (root == null) return tree;
        int count = 1;
        List<TreeNode> list = new ArrayList<TreeNode>();
        list.add(root);
        while (count != 0) {
            getEle(list, count, tree);
        }
        return tree;
    }

    static int getEle(List<TreeNode> list, int count, ArrayList<ArrayList<Integer>> tree) {
        ArrayList<Integer> level = new ArrayList<Integer>();
        int child = 0;
        for (int i =0;i<count;i++){
            TreeNode element = list.remove(0);
            level.add(element.val);
            if (element.left!=null){
                list.add(element.left);
                child+=1;
            }
            if (element.right!=null){
                list.add(element.right);
                child+=1;
            }

        }
        tree.add(level);
        return child;
    }
}

package org.dfs.challenge4;

import org.dfs.challenge2.FindAllTreePaths;
import org.dfs.challenge2.TreeNode;

import java.util.List;


public class TreeHeights {
    private static int findHeight(TreeNode root, int maxHeight) {

        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return maxHeight;
        } else {
            return Math.max(findHeight(root.left, maxHeight + 1), findHeight(root.right, maxHeight + 1));
        }
    }

    public static void main(String[] args) {
//        TreeNode root = new TreeNode(4);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(6);
//        root.left.left = new TreeNode(1);
//        root.left.right = new TreeNode(3);
//        root.right.left = new TreeNode(5);
//        root.right.right = new TreeNode(7);
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        // root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        root.right.right.right = new TreeNode(7);

        int height = TreeHeights.findHeight(root, 0);
        System.out.println("Tree height is :" + height);
    }


}

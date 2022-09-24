package org.bfs.challenge4;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumBinaryTreeDepth {

    private static Integer findDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int maxDepth = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            maxDepth++;
            for(int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
            }
        }
    return maxDepth;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        System.out.println("Tree Maximum Depth: " + MaximumBinaryTreeDepth.findDepth(root));
        root.left.left = new TreeNode(9);
        root.right.left.left = new TreeNode(11);
        System.out.println("Tree Maximum Depth: " + MaximumBinaryTreeDepth.findDepth(root));
    }


}

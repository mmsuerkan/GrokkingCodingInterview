package org.dfs.challenge4;

class Node{
    Node left,right;
    int val;

    public Node(int val) {
        this.val = val;
    }
}


public class TreeHeights {
    private static int findHeight(Node root, int maxHeight) {

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
//        TreeNode root = new TreeNode(4);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(6);
//        root.left.left = new TreeNode(1);
//        // root.left.right = new TreeNode(3);
//        root.right.left = new TreeNode(5);
//        root.right.right = new TreeNode(7);
//        root.right.right.right = new TreeNode(7);
        Node root = new Node(4);
        root.left = new Node(2);
        root.left.left = new Node(6);
        root.left.left.right = new Node(7);

        int height = TreeHeights.findHeight(root, 0);
        System.out.println("Tree height is :" + height);
    }


}

package org.dfs.challenge3;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
};

public class SumOfPathNumbers {


    public static int findSumOfPathNumbers(TreeNode root) {
        return findRootToPathNumbers(root,0);
    }

    private static int findRootToPathNumbers(TreeNode currentNode, int pathSum) {

        if (currentNode == null)
            return 0;

        // calculate the path number of the current node
        pathSum = 10 * pathSum + currentNode.val;

        // if the current node is a leaf, return the current path sum.
        if (currentNode.left == null && currentNode.right == null) {
            return pathSum;
        }

        // traverse the left and the right sub-tree
        return findRootToPathNumbers(currentNode.left, pathSum) + findRootToPathNumbers(currentNode.right, pathSum);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(5);
        System.out.println("Total Sum of Path Numbers: " + SumOfPathNumbers.findSumOfPathNumbers(root));
    }

}


package org.dfs.challenge6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
};

class CountAllPathSum {
    public static int countPaths(TreeNode root, int S) {


        LinkedList<Integer> currentPath = new LinkedList<>();
        
        return countPathsRecursive(root, S, currentPath);
    }

    private static int countPathsRecursive(TreeNode currentNode, int S, LinkedList<Integer> currentPath) {
        if(currentNode == null) {
            return 0;
        }
        currentPath.add(currentNode.val);
        int pathCount = 0, pathSum = 0;
        ListIterator<Integer> pathIterator = currentPath.listIterator(currentPath.size());
        while(pathIterator.hasPrevious()) {
            pathSum += pathIterator.previous();
            if(pathSum == S) {
                pathCount++;
            }
        }
        pathCount += countPathsRecursive(currentNode.left, S, currentPath);
        // traverse the right sub-tree
        pathCount += countPathsRecursive(currentNode.right, S, currentPath);

        currentPath.remove(currentPath.size() - 1);
        return pathCount;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        System.out.println("Tree has path: " + CountAllPathSum.countPaths(root, 11));
    }
}


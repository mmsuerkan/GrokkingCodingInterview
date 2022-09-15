package org.dfs.challenge2;

import org.dfs.challenge1.TreePathSum;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
};

public class FindAllTreePaths {

    public static boolean hasPath(TreeNode root, int sum) {

        if (root == null) {
            return false;
        }
        if (root.val == sum) {
            return true;
        } else {
            return hasPath(root.left, sum - root.val) || hasPath(root.right, sum - root.val);
        }

    }

    private static List<List<Integer>> findPaths(TreeNode root, int sum) {

        List<List<Integer>> allPaths = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();

        findPathsRecursive(root,sum,allPaths,currentPath);
        return allPaths;
    }

    private static void findPathsRecursive(TreeNode currentNode, int sum, List<List<Integer>> allPaths, List<Integer> currentPath) {

        if(currentNode == null){
            return;
        }
        currentPath.add(currentNode.val);

        if(currentNode.val == sum && currentNode.left == null && currentNode.right == null){
            allPaths.add(new ArrayList<Integer>(currentPath));
        }else {
          findPathsRecursive(currentNode.left,sum - currentNode.val,allPaths,currentPath);
          findPathsRecursive(currentNode.right,sum - currentNode.val,allPaths,currentPath);
        }
        currentPath.remove(currentPath.size() - 1);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        int sum = 23;
        List<List<Integer>> result = FindAllTreePaths.findPaths(root, sum);
        System.out.println("Tree paths with sum " + sum + ": " + result);
    }
//    public static void main(String[] args) {
//        TreeNode root = new TreeNode(12);
//        root.left = new TreeNode(7);
//        root.right = new TreeNode(1);
//        root.left.left = new TreeNode(9);
//        root.right.left = new TreeNode(10);
//        root.right.right = new TreeNode(5);
//        System.out.println("Tree has path: " + FindAllTreePaths.hasPath(root, 23));
//        System.out.println("Tree has path: " + FindAllTreePaths.hasPath(root, 16));
//    }


}

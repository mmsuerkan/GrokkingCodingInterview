package org.bfs.challenge7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode next;

    TreeNode(int x) {
        val = x;
        left = right = next = null;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                '}';
    }
}

public class ConnectLevelOrderSiblings {

    public static List<List<TreeNode>> traverse(TreeNode root) {
        List<List<TreeNode>> result = new ArrayList<List<TreeNode>>();

        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode previousNode = null;
            int levelSize = queue.size();
            List<TreeNode> currentLevel = new LinkedList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                if(previousNode != null) {
                    previousNode.next = currentNode;
                }
                previousNode = currentNode;

                currentLevel.add(currentNode);

                if (currentNode.left != null)
                    queue.offer(currentNode.left);
                if (currentNode.right != null)
                    queue.offer(currentNode.right);

            }
            result.add(currentLevel);
        }

        return result;
    }

    public static void connect(TreeNode root) {

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        List<List<TreeNode>> traverse = ConnectLevelOrderSiblings.traverse(root);
        for (int i = 0; i < traverse.size(); i++) {
            List<TreeNode> treeNodes = traverse.get(i);
            TreeNode first = treeNodes.get(0);
            while (first != null) {
                System.out.print(first.val + " ");
                first = first.next;
            }
            System.out.println();
        }
    }
}


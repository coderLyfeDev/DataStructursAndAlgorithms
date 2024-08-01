package com.coderlyfe.DataStructuresAndAlgorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    int key;
    TreeNode left, right;

    public List<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(List<TreeNode> children) {
        this.children = children;
    }

    List<TreeNode> children = new ArrayList<>();

    public TreeNode(int item)
    {
        key = item;
        left = right = null;
    }

    public static void breadthFirstSearchTree(TreeNode node){
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(node);

        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            System.out.println("Visited6: "+temp.getKey());
            queue.addAll(temp.getChildren());
        }
    }



    public static void main(String[] args){
        TreeNode root = new TreeNode(0);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        node4.getChildren().add(node5);
        node4.getChildren().add(node6);

        node1.getChildren().add(node3);
        node1.getChildren().add(node4);

        root.getChildren().add(node1);
        root.getChildren().add(node2);

        breadthFirstSearchTree(root);

        // 0 1 2 3 4 5 6



    }
}
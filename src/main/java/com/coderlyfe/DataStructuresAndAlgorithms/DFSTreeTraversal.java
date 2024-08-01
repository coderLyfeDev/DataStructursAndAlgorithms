package com.coderlyfe.DataStructuresAndAlgorithms;

public class DFSTreeTraversal {

    /*private static void preOrder(TreeNode root){
        if(root != null){
            System.out.print(root.getKey()+" ");
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }

    private static void inOrder(TreeNode root){
        if(root != null){
            inOrder(root.getLeft());
            System.out.print(root.getKey()+" ");
            inOrder(root.getRight());
        }
    }

    private static void postOrder(TreeNode root){
        if(root != null){
            postOrder(root.getLeft());
            postOrder(root.getRight());
            System.out.print(root.getKey()+" ");
        }
    }
    preOrder
   0123456
    inOrder
    1032546
    postOrder
    1356420*/

    public String preOrder(TreeNode root, StringBuilder results){

        if(root != null){
            results.append(root.getKey());
            //System.out.print(root.getKey());
            preOrder(root.left, results);
            preOrder(root.right, results);
        }
        return results.toString();
    }

    public String inOrder(TreeNode root, StringBuilder results){
        if(root != null){

            inOrder(root.left, results);
            results.append(root.getKey());
            //System.out.print(root.getKey());
            inOrder(root.right, results);
        }
        return results.toString();
    }

    public String postOrder(TreeNode root, StringBuilder results){
        if(root != null){

            postOrder(root.left, results);
            postOrder(root.right, results);
            results.append(root.getKey());
            //System.out.print(root.getKey());
        }
        return results.toString();
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(0);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        node2.setLeft(node3);
        TreeNode node4 = new TreeNode(4);
        node2.setRight(node4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        node4.setLeft(node5);
        node4.setRight(node6);
        root.setLeft(node1);
        root.setRight(node2);
        //System.out.print(preOrder(root, new StringBuilder()));
        System.out.println("");
        //System.out.print(inOrder(root , new StringBuilder()));
        System.out.println("");
        //System.out.print(postOrder(root, new StringBuilder()));
    }
}

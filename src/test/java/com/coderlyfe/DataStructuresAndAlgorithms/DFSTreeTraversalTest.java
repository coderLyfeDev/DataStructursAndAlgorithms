package com.coderlyfe.DataStructuresAndAlgorithms;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class DFSTreeTraversalTest extends TestCase {

    TreeNode root;
    DFSTreeTraversal dfsTreeTraversal;

    @Before
    public void setUp() {
        root = new TreeNode(0);
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
        dfsTreeTraversal = new DFSTreeTraversal();
    }

    @Test
    public void testPreOrder() {
        assertEquals("0123456", dfsTreeTraversal.preOrder(root, new StringBuilder()));
    }

    @Test
    public void testInOrder() {
        assertEquals("1032546", dfsTreeTraversal.inOrder(root, new StringBuilder()));
    }

    @Test
    public void testPostOrder() {
        assertEquals("1356420", dfsTreeTraversal.postOrder(root, new StringBuilder()));
    }
}
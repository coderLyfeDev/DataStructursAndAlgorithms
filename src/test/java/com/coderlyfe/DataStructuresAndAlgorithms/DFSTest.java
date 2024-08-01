package com.coderlyfe.DataStructuresAndAlgorithms;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class DFSTest {

    @Test
    public void testDFS() {
        DFS g = new DFS();
        int v = 4;

        for(int i = 0; i < v; i++){
            g.adj.put(i, new LinkedList<>());
            g.visited.put(i, false);
        }

        g.adj.get(0).add(1);
        g.adj.get(0).add(2);
        g.adj.get(1).add(2);
        g.adj.get(2).add(0);
        g.adj.get(2).add(3);
        g.adj.get(3).add(3);

        g.dfs(2);
        assertEquals("2013", g.results);
    }
}
package com.coderlyfe.DataStructuresAndAlgorithms;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS {

    private int V;
    private LinkedList<Integer> adj[];
    boolean[] visited;
    public BFS(int v){
        V = v;
        adj = new LinkedList[V];
        visited = new boolean[V];

        for(int i = 0; i<V; i++){
            adj[i] = new LinkedList<>();
        }
    }
    public void addEdge(int v, int e){
        adj[v].add(e);
    }

    public void BFS(int v){
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[v] = true;
        queue.add(v);
        while(!queue.isEmpty()){
            int n = queue.poll();
            System.out.print(n+" ");
            Iterator<Integer> i = adj[n].listIterator();
            while(i.hasNext()){
                int k = i.next();
                if(!visited[k]){
                    visited[k] = true;
                    queue.add(k);
                }
            }
        }
    }

    public static void main(String[] args){
        BFS g = new BFS(4);

        System.out.println("-----------------BFS-------------\n");
        g = new BFS(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.BFS(2);
    }
}

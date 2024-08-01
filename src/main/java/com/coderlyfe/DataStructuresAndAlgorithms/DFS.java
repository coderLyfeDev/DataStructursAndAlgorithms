package com.coderlyfe.DataStructuresAndAlgorithms;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;

public class DFS {

    /*private int V;
    private LinkedList<Integer> adj[];
    private boolean[] visited;
    private String result = "";
    public DFS(int v){
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

    public String getResult(){
        return result;
    }

    public void DFS(int v){
        visited[v] = true;
        result+=v;
        System.out.print(v);

        Iterator<Integer> i = adj[v].listIterator();

        while(i.hasNext()){
            int n = i.next();
            if(!visited[n]) DFS(n);
        }
    }*/

    public HashMap<Integer, LinkedList<Integer>> adj = new HashMap<>();
    public HashMap<Integer, Boolean> visited = new HashMap<>();
    public String results = "";

    public void dfs(int v){
        visited.put(v, true);
        results+=v;
        System.out.print(v);

        ListIterator<Integer> i = adj.get(v).listIterator();

        while(i.hasNext()){
            int n = i.next();
            if(!visited.get(n)){
                dfs(n);
            }
        }
    }


}

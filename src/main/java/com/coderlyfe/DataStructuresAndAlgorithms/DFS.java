package com.coderlyfe.DataStructuresAndAlgorithms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

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



    /*HashMap<Integer, LinkedList<Integer>> adj = new HashMap<>();
    HashMap<Integer, Boolean> visited = new HashMap<>();
    String results = "";
    public String dfs(int v){
        visited.put(v, true);
        System.out.print(v);
        results+=v;

        Iterator<Integer> i = adj.get(v).listIterator();

        while(i.hasNext()){
            int n = i.next();

            if(!visited.get(n)) dfs(n);
        }
        return results;
    }*/



    String results = "";
    HashMap<Integer, List<Integer>> adj = new HashMap<>();
    HashMap<Integer, Boolean> visited = new HashMap<>();
    public String dfs(int v){


        visited.put(v, true);
        System.out.println("Visited: " + v);
        results+=v;

        Iterator<Integer> i = adj.get(v).listIterator();

        while(i.hasNext()){
            int n = i.next();
            if(!visited.get(n)) dfs(n);
        }
        return  results;
    }

    public static void main(String[] args){
    }
}

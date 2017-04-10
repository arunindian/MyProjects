package org.graphexamples.snakeladder;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
	
	private int V;
	private LinkedList<Integer>[] adj;
	
	public Graph(int V) {
		this.V=V;
		
		adj = new LinkedList[V];

		for(int i=0;i<V;i++) {
			adj[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(int v, int w) {
		adj[v].add(w);
	}
	
	public void DFS(int src) {
		boolean[] visited = new boolean[V];
		
		Arrays.fill(visited, false);
		
		for(int v=0;v<V;v++) {
			if(!visited[v]) {
				DFSUtil(visited, v);
			}
		}
	}
	
	private void DFSUtil(boolean[] visited, int v) {
		visited[v]= true;
		System.out.println(v);
		
		Iterator<Integer> itr = adj[v].iterator();
		while(itr.hasNext()) {
			Integer i = itr.next();
			if(!visited[i]) {
				DFSUtil(visited, v);
			}
		}
	}
	
	/**
	 * Breadth first search time complexity id O(V+E)
	 * 
	 */
	public void BFS(int src) {
		boolean[] visited = new boolean[V];
		visited[src] = true;
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(src);
		
		Integer gnode;
		// V in time complexity comes from this loop
		while(!queue.isEmpty()) {
			gnode = queue.poll();
			
			System.out.println(gnode);
			
			Iterator<Integer> itr = adj[gnode].iterator();
			
			// E part comes from this loop
			while(itr.hasNext()) {
				Integer i = itr.next();
				
				if(!visited[i]) {
					visited[i]=true;
					queue.add(i);
				}
			}
		}
	}
	
	private void topologicalSort(){
		Stack<Integer> stack = new Stack<>();
		
		boolean[] visited = new boolean[V];
		
		Arrays.fill(visited, false);
		
		for(int i=0;i<this.V;i++) {
			if(!visited[i]) {
				topologicalSortUtil(visited, stack, i);
			}
		}
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
	}
	
	private void topologicalSortUtil(boolean[] visited, Stack<Integer> stack,int v) {
		visited[v] = true;
		
		Iterator<Integer> itr = adj[v].iterator();
		while(itr.hasNext()) {
			
			Integer i = itr.next();
			if(!visited[i]) {
				topologicalSortUtil(visited, stack, i);
			}
		}
		
		stack.push(v);
	}
	
	// Driver method
    public static void main(String args[])
    {
    	Graph g = new Graph(4);
    	 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 2)");
 
        g.BFS(2);
    }

}

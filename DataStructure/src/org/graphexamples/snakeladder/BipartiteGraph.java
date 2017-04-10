package org.graphexamples.snakeladder;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BipartiteGraph {
	
	private int V;
	
	public BipartiteGraph(int V) {
		this.V = V;
	}
	
	private boolean isBipartite(int[][] graph,int src) {
		int[] colorAttr = new int[V];
		Arrays.fill(colorAttr, -1);
		
		// Marking the color of source vertex as 1
		colorAttr[src] = 1;
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(src);
		
		while(!queue.isEmpty()) {
			int u = queue.poll();
			
			for(int v=0;v<V;v++) {
				if(graph[u][v]==1 && colorAttr[v] == -1) {
					colorAttr[v]=1-colorAttr[u];
				} else if(graph[u][v]==1 && colorAttr[v] == colorAttr[u]) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		BipartiteGraph bg = new BipartiteGraph(4);
		 int G[][] = {{0, 1, 0, 1},
		            {1, 0, 1, 0},
		            {0, 1, 0, 1},
		            {1, 0, 1, 0}
		        };
		        if (bg.isBipartite(G, 0))
		           System.out.println("Yes");
		        else
		           System.out.println("No");
		    }

}

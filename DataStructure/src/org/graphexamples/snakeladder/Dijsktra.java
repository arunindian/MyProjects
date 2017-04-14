package org.graphexamples.snakeladder;

import java.util.Arrays;

public class Dijsktra {
	private int V;
	
	public Dijsktra(int V) {
		this.V = V;
	}
	
	public void dijsktra(int[][] graph, int src) {
		// stores the distances of visited vertices
		int[] dist = new int[V];
		// sptSet identifies the included vertices
		boolean sptSet[] = new boolean[V];
		
		Arrays.fill(dist, Integer.MAX_VALUE);
		Arrays.fill(sptSet, false);
		
		// Marking the src vertex as visitedc
		dist[src] = 0;
		
		for(int count =0;count<V;count++) {
			int u = minDistance(dist, sptSet);
			
			sptSet[u] = true;
			
			for(int v=0;v<V;v++) {
				//Relaxing the edges
				if(!sptSet[v] && graph[u][v]!=0 && dist[u]!=Integer.MAX_VALUE && dist[u]+graph[u][v]<dist[v]) {
					dist[v]=dist[u]+graph[u][v];
				}
			}
		}
		
		printSolution(dist);
	}
	
	private int minDistance(int[] dist, boolean[] sptSet) {
		int min =Integer.MAX_VALUE,min_index=-1;
		for(int v=0;v<V;v++) {
			if(sptSet[v] == false && dist[v]<=min) {
				min = dist[v];
				min_index = v;
			}
		}
		return min_index;
	}
	
	private void printSolution(int[] dist) {
		for(int i=0;i<dist.length;i++) {
			System.out.println(i+" "+dist[i]);
		}
	}
	
	// Driver method
    public static void main (String[] args)
    {
        /* Let us create the example graph discussed above */
       int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
                                  {4, 0, 8, 0, 0, 0, 0, 11, 0},
                                  {0, 8, 0, 7, 0, 4, 0, 0, 2},
                                  {0, 0, 7, 0, 9, 14, 0, 0, 0},
                                  {0, 0, 0, 9, 0, 10, 0, 0, 0},
                                  {0, 0, 4, 14, 10, 0, 2, 0, 0},
                                  {0, 0, 0, 0, 0, 2, 0, 1, 6},
                                  {8, 11, 0, 0, 0, 0, 1, 0, 7},
                                  {0, 0, 2, 0, 0, 0, 6, 7, 0}
                                 };
        Dijsktra d = new Dijsktra(9);
        d.dijsktra(graph, 0);
    }

}

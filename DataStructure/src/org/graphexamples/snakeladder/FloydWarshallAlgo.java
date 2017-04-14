package org.graphexamples.snakeladder;

public class FloydWarshallAlgo {
	
	final static int INF=9999;
	
	private int V;
	
	public FloydWarshallAlgo(int V) {
		this.V= V;
	}
	
	private void floydWarshall(int[][] graph) {
		int[][] dist = new int[V][V];
		int i,j,k;
		
		for(i=0;i<V;i++) {
			for(j=0;j<V;j++)
				dist[i][j] = graph[i][j];
		}
		
		for(k=0;k<V;k++) {
			for(i=0;i<V;i++) {
				for(j=0;j<V;j++) {
					if(dist[i][k]+dist[k][j]<dist[i][j]) {
						dist[i][j]=dist[i][k]+dist[k][j];
					}
				}
			}
		}
		
		printSolution(dist);
		
	}
	
	private void printSolution(int[][] dist) {
		System.out.println("Following matrix shows the shortest "+
                "distances between every pair of vertices");
for (int i=0; i<V; ++i)
{
   for (int j=0; j<V; ++j)
   {
       if (dist[i][j]==INF)
           System.out.print("INF ");
       else
           System.out.print(dist[i][j]+"   ");
   }
   System.out.println();
}
}
	public static void main(String[] args) {
		int graph[][] = { {0,   5,  INF, 10},
                {INF, 0,   3, INF},
                {INF, INF, 0,   1},
                {INF, INF, INF, 0}
              };
		FloydWarshallAlgo a = new FloydWarshallAlgo(4);

// Print the solution
a.floydWarshall(graph);
	}

}

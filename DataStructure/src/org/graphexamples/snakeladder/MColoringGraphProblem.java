package org.graphexamples.snakeladder;

import java.util.Arrays;

public class MColoringGraphProblem {
	
	private int V;
	
	public MColoringGraphProblem(int V) {
		this.V = V;
	}
	
	private boolean graphColoringUtil(int[][] graph, int[] color, int v) {
		
		if(v == V) {
			return true;
		}
		
		for(int c=1;c<color.length;c++) {
			if(isSafe(graph, v, c, color)) {
				// Color with color c
				color[v] = c;
				
				if(graphColoringUtil(graph, color, v+1)) {
					return true;
				}
				// Backtrak if this donot tun into solution
				color[v]=0;
			}
		}
		
		return false;
	}
	
	private boolean isSafe(int[][] graph, int v,int c,int[] color) {
		for(int i=0;i<graph[0].length;i++) {
			if(graph[i][v] == 1 && color[i] == c) {
				return false;
			}
		}
		return true;
	}
	
	public void graphColoring(int[][] graph, int m) {
		int[] color = new int[V];
		
		Arrays.fill(color, 0);
		
		if(graphColoringUtil(graph, color, 0)) {
			printSolution(color);
		} else {
			System.out.println("No solution exists");
		}
	}
	
	private void printSolution(int[] color) {
		for (int i = 0; i < color.length; i++) {
			System.out.println(i+"---->"+color[i]);
		}
	}
	
	public static void main(String[] args) {
		MColoringGraphProblem mColoringProblem = new MColoringGraphProblem(4);
		 int graph[][] = {{0, 1, 1, 1},
		            {1, 0, 1, 0},
		            {1, 1, 0, 1},
		            {1, 0, 1, 0},
		        };
		 int m = 3; // Number of colors
		 mColoringProblem.graphColoring(graph, m);
	}

}

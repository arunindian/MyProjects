package org.graphexamples.snakeladder;

public class DriverForSnakeLadder {

	public static void main(String[] args) {
		
		 int N = 30;
		 int moves[] = new int[N];
		 for (int i = 0; i<N; i++) {
			 moves[i] = -1;
		 }
		 
		 // Ladders
		 moves[2] = 21;
		 moves[4] = 7;
		 moves[10] = 25;
		 moves[19] = 28;
		 
		 // Snakes
		 moves[26] = 0;
		 moves[20] = 8;
		 moves[16] = 3;
		 moves[18] = 6;
		 
		 System.out.println("Minmum steps needed are "+SnakeLadderSolution.getMinimumMove(moves, N));
	}
}

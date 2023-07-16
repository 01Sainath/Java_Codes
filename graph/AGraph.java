package graph;

import java.util.Scanner;

public class AGraph {
	
	static int adjMatrix[][];
	
	private static void addEdges(int start, int end) {
		adjMatrix[start][end] = 1;
		adjMatrix[end][start] = 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int nodes = input.nextInt();
		int edges = input.nextInt();
		
		adjMatrix = new int[nodes][nodes];
		
		for(int i=0; i<edges; i++) {
			int s = input.nextInt();
			int e = input.nextInt();
			addEdges(s,e);
		}
		
		for(int i=0; i<nodes; i++) {
			for(int j=0; j<nodes; j++) {
				System.out.print(adjMatrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}

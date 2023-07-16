package greedyAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

class Graph{
    private int nodes;
    private int adjMat[][];
    Graph(int n){
        nodes=n;
        adjMat= new int [n][n];
    }

    void addEdge(int u, int v, int w){
        adjMat[u][v]=w;
        adjMat[v][u]=w;
    }

    void primsAlgo(){
        int result[] = new int[nodes];
        Arrays.fill(result,-1);
        boolean mst[] = new boolean[nodes];
        int minWt[] = new int[nodes];
        Arrays.fill(minWt, Integer.MAX_VALUE);

        for(int i=0; i<nodes-1; i++){
            int minV = minimumWt(minWt, mst);
            mst[minV] = true;
            for(int j=0; j<nodes; j++){
                if(adjMat[minV][j]>0 && !mst[j]){
                    if(minWt[j]>adjMat[minV][j]){
                        result[j] = minV;
                        minWt[j] = adjMat[minV][j];
                    }  
                }
            }
        }

        for(int i=1; i<nodes; i++){
            System.out.println(result[i]+" to "+i);
        }

    }

    private int minimumWt(int[] minWt, boolean[] mst) {
        int index=-1;
        for(int i=0; i<nodes; i++){
            if(!mst[i] && (index==-1||minWt[index]>minWt[i]))
                index=i;
        }
        return index;
    }
}
public class primsAlgorithm {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int nodes = input.nextInt();
        int edges = input.nextInt();

        Graph g = new Graph(nodes);
        for(int i=0; i<edges; i++){
            int u = input.nextInt();
            int v = input.nextInt();
            int w = input.nextInt();

            g.addEdge(u,v,w);
        }
        g.primsAlgo();
    }
}
    
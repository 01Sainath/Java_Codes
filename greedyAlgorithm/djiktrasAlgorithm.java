package greedyAlgorithm;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class djiktrasAlgorithm {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        int nodes = input.nextInt();
        int edges = input.nextInt();

        ArrayList <ArrayList<edge>> graph = new ArrayList<>(); 
        for(int i=0; i<nodes; i++){
            graph.add(new ArrayList<>());
        }

        int s,d,w;
        for(int i=0; i<edges; i++){
            s = input.nextInt();
            d = input.nextInt();
            w = input.nextInt();

            graph.get(s).add(new edge(d, w));
            graph.get(d).add(new edge(s, w));
        }

        dijktrasAlgo(graph,nodes,0);
    }

    private static void dijktrasAlgo(ArrayList<ArrayList<edge>> graph, int nodes, int u) {
        int dist[] = new int[nodes];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[u] = 0;

        PriorityQueue <Pairs> pq = new PriorityQueue<>(nodes, new Pairs());
        pq.add(new Pairs(0,u));
        boolean visited[] = new boolean[nodes];
        while(!pq.isEmpty()){
            int vt = pq.peek().y;
            pq.remove();
            if(visited[vt])
                continue;
            else{
                visited[vt]=true;
                for(edge ele: graph.get(vt)){
                    int v = ele.dest;
                    int wt= ele.wt;
                    if(dist[v]>dist[vt]+wt){
                        dist[v]=dist[vt]+wt;
                        pq.add(new Pairs(dist[vt]+wt, v));
                    }
                }
            }
        }

        for(int i=0; i<nodes; i++){
            System.out.println("Shortest distance from "+ u +" to "+ i+" = "+dist[i]);
        }
    }

    static class edge{
        int dest;
        int wt;
        edge(int d,int w){
            dest=d;
            wt=w;
        }
    }
}

class Pairs implements Comparator<Pairs>{
    int x,y;
    Pairs(){

    }
    Pairs(int i, int j){
        x=i;
        y=j;
    }

    @Override
    public int compare(Pairs o1, Pairs o2){
        return o2.x-o1.x;
    }
}
package heap;
import java.util.*;
public class maxHeap {
    public static void main(String[]args){
        PriorityQueue <Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.add(1);
        pq.add(2);
        pq.add(5);
        pq.add(10);
        pq.add(7);

        System.out.println(pq.size());

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.poll();
        }
    }

}

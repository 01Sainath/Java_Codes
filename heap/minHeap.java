package heap;

import java.util.PriorityQueue;

public class minHeap {
	public static void main(String[]args) {
		PriorityQueue <Integer> pq = new PriorityQueue<>();
		
		pq.add(11);
		pq.add(4);
		pq.add(7);
		pq.add(1);
		
		System.out.println(pq.size());

		while(!pq.isEmpty()){
			System.out.println(pq.peek());
			pq.poll();
		}
	}
}

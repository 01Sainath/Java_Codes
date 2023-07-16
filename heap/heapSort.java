package heap;
import java.util.*;
public class heapSort {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in); 

        PriorityQueue <Integer> pq = new PriorityQueue<>();

        int n = input.nextInt();
        for(int i=0; i<n; i++){
            int ele=input.nextInt();
            pq.add(ele);
        }

        while(!pq.isEmpty()){
            System.out.print(pq.peek()+" ");
            pq.poll();
        }
    }
    
}


import java.util.*;

public class queue {
    static Stack <Integer> s1 = new Stack<>();
    static Stack <Integer> s2 = new Stack<>();

    static boolean isEmpty(){
        return s1.isEmpty();
    }

    static void enqueue(int data){
        if(!s1.isEmpty()){
            s1.push(data);
            return;
        }

        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(data);

        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }

        return;
    }

    static int dequeue(){
        if(isEmpty()){
            return -1;
        }

        return s1.pop();
    }

    static int peek(){
        if(isEmpty()){
            return -1;
        }

        return s1.peek();
    }

}

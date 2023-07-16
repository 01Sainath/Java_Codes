package randomProblems;
import java.util.*;
public class stackOfTwo {
    
    static class node{
        String name;
        int age;

        node(String n,int a){
            name = n;
            age = a;
        }
    }
    
    public static void main(String [] args){
        Stack <node> s = new Stack<>();
        int counter=5;
        while(counter>0){
            node newNode = new node("Sainath",21);
            s.push(newNode);
            counter--;
        }

        while(!s.isEmpty()){
            System.out.println(s.peek().name+" "+s.peek().age);
            s.pop();
        }
    }
    
}

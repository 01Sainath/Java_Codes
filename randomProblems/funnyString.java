package randomProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class funnyString {
    
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        String s = input.next();

        int arr[] = new int[s.length()];
        for(int i=0; i<arr.length; i++){
            arr[i]= s.charAt(i);
        }

        ArrayList <Integer> a = new ArrayList<>();
        ArrayList <Integer> r = new ArrayList<>();

        for(int i=0; i<arr.length-1; i++){
            int front=arr[i]-arr[i+1];
            if(front<0)
                front*=-1;
            a.add(front);
        }

        for(int i=arr.length-1; i>0; i--){
            int rear=arr[i]-arr[i-1];
            if(rear<0)
                rear*=-1;
            r.add(rear);
        }

        int count=0;
        for(int i=0; i<a.size(); i++){
            if(a.get(i)!=r.get(i)){
                count++;
                break;
            }
        }


        if(count==0)
            System.out.println("Funny");
        else
            System.out.println("Not Funny");
        
    }
}

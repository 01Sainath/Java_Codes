package randomProblems;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        //pre decrement  --n

        int n1 = input.nextInt();
        int count1=0;
        while(n1-->0){
            count1++;
        }

        //post decrement  n++
        int n2 = input.nextInt();
        int count2=0;
        while(--n2>0){
            count2++;
        }

        System.out.println("Post "+count1);
        System.out.println("Pre "+count2);
    }
}

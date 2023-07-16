package randomProblems;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class box {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        int m = input.nextInt();
        int n = input.nextInt();
        
        int path;

        if(m%2==0 && n%2==0)
            path = Math.min(m,n);
        else if(m%2==0)
            path = m;
        else if(n%2==0)
            path = n;
        else 
            path = (m-1)+(n-1);

        int counter = 2;
        int color = 0;

        for(int i=0; i<path; i++){
            if(counter%4==0)
                color++;
            counter++;
        }

        System.out.println(color);
    }
}

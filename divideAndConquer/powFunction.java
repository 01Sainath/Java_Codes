package divideAndConquer;

import java.util.Scanner;

public class powFunction {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int t  = input.nextInt();
        while(t-->0){
            int x = input.nextInt();
            // char bt = input.next().charAt(0); 
            int n = input.nextInt();

            System.out.println(pow(x,n));
        }
    }

    static int pow(int x,int n) {

        int pow=1;

        while(n>0){

            if(n%2!=0)
                pow*=x;
                
            n=n/2;
            x=x*x;
        }

        return pow;
    }
}

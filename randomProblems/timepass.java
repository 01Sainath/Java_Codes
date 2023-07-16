import java.util.Scanner;

public class timepass {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();
        while(t-->0){
            int n = input.nextInt();

            product arr[] = new product[n];

            int w, p;

            for(int i=0; i<n; i++){
                w = input.nextInt();
                p = input.nextInt();
                arr[i] = new product(w,p);
            }

            for(int i=0; i<n;i++){
                System.out.println("Object "+(i+1)+" = "+arr[i].weight+" "+arr[i].profit+" "+arr[i].profitPerKg);
            }
        }
    }

    static class product{
        int weight;
        int profit;
        float profitPerKg;
        product(int w, int p){
            weight=w;
            profit=p;
            profitPerKg=(float)p/w;
        }
    }
}

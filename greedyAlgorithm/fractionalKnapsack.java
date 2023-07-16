package greedyAlgorithm;

import java.util.*;

public class fractionalKnapsack {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        float cap = input.nextInt();
        float wt[] = new float[n];
        float profit[] = new float[n];
        product ratio[] = new product[n];

        for(int i=0; i<n; i++)
            wt[i] = input.nextFloat();

        for(int i=0; i<n; i++)
            profit[i] = input.nextFloat();
        
        for(int i=0; i<n; i++)
            ratio[i] = new product(wt[i],profit[i]); 

        FractionalKnapsack(ratio,cap,n);
    }
    static void FractionalKnapsack(product[] ratio, Float cap, int n){
        Arrays.sort(ratio, new Comparator<product>(){
			@Override
			public int compare(product v1, product v2){
				if(v1.pw>v2.pw)
                    return 1;
                else if(v1.pw<v2.pw)
                    return -1;
                else
                    return 0;
			}
		});

        int flag =0;
        float totalProf=0;
        int i=0;
        for(i=n-1; i>=0; i--){
            Float currwt = ratio[i].weight;
            Float currProf = ratio[i].profit;
            if(cap>0 && currwt<=cap){
                totalProf = totalProf+currProf;
                cap = cap-currwt;
            }
            else{
                flag=1;
                break;
            }
        }

        if(flag==1){
            totalProf += ratio[i].profit*(cap/ratio[i].weight);
        }

        System.out.println(totalProf);
    }
}
class product{
    float weight;
    float profit;
    float pw;
    product(Float w, Float p){
        weight=w;
        profit=p;
        pw=p/w;
    }
}


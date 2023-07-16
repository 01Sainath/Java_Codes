package divideAndConquer;

import java.util.Scanner;

public class maxSubArraySum {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-->0){
            int n = input.nextInt();
        
            int arr[] = new int[n];
    
            for(int i=0; i<n; i++){
                arr[i]=input.nextInt();
            }
    
            int maxSum = Integer.MIN_VALUE;
            for(int i=0; i<n; i++){
                int sum=0;
                for(int j=i; j<n; j++){
                    sum+=arr[j];
                    if(sum>maxSum){
                        maxSum=sum;
                    }
                }
            }
    
            System.out.println(maxSum);
        }
    }
}

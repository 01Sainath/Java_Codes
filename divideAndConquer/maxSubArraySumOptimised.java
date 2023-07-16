package divideAndConquer;

import java.util.Scanner;

public class maxSubArraySumOptimised {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();
        while(t-->0){
            int n = input.nextInt();
            int arr[] = new int[n];

            for(int i=0; i<n; i++){
                arr[i]=input.nextInt();
            }

            System.out.println(maximumSum(arr,0,n-1));
        }
    }

    static int maximumSum(int arr[], int l, int r){

        if(l==r){
            return arr[l];
        }

        int mid = (l+r)/2;
        int leftMax = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=mid; i>l-1; i--){
            sum+=arr[i];
            if(sum>leftMax)
                leftMax=sum;
        }
        int rightMax = Integer.MIN_VALUE;
        sum=0;
        for(int i=mid+1; i<r+1; i++){
            sum+=arr[i];
            if(sum>rightMax)
                rightMax=sum;
        }

        int maxLeftArr = maximumSum(arr,l,mid);
        int maxRightArr = maximumSum(arr,mid+1,r);
        return Math.max(leftMax+rightMax, Math.max(maxLeftArr, maxRightArr));
    }
}

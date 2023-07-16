package greedyAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class minNumberOfPlatformsOptimised {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();
        while(t-->0){
            int n = input.nextInt();

            int arr[] = new int[n];
            int dept[] = new int[n];

            for(int i=0; i<n; i++)
                arr[i] = input.nextInt();

            for(int i=0; i<n; i++)
                dept[i] = input.nextInt();

            System.out.println(minNumOfPlat(arr,dept,n));
        }
    }

    private static int minNumOfPlat(int[] arr, int[] dept, int n) {
         
        Arrays.sort(arr);
        Arrays.sort(dept);

        int plat = 1, res=1, i=1, j=0; 
        while(i<n && j<n){
            if(arr[i]<=dept[j]){
                plat+=1;
                i+=1;
            }
            else{
                plat-=1;
                j+=1;
            }

            res = Math.max(res,plat);
        }
        return res;
    }
}

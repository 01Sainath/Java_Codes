package randomProblems;

import java.util.Scanner;

public class circulerArrayRotation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();
        int q = input.nextInt();

        int arr[] = new int[n];
        int queries[] = new int[q];

        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }

        for(int i=0; i<q; i++){
           queries[i] = input.nextInt(); 
        }

        for(int i=0; i<k; i++)
            rightArrayRotation(arr,n);

        for(int i=0; i<q; i++){
            System.out.print(arr[queries[i]]+" ");
        }
    }

    static void rightArrayRotation(int arr[], int n){

        int ele=arr[n-1];
        for(int i=n-1; i>0; i--){
           arr[i]=arr[i-1];
        }
        arr[0]=ele;
    }
}

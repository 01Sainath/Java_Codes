package randomProblems;
import java.util.*;
public class hurdleRace{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();

        int A[] = new int[n];

        for(int i=0; i<n; i++){
            A[i] = input.nextInt();
        }

        System.out.println(maxPotion(k,A));
        
    }

    public static int maxPotion(int k, int arr[]){

        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        if(max>k){
            return max-k;
        }
        else return 0;

    }
}
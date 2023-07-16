package greedyAlgorithm;

import java.util.Scanner;

// import javax.lang.model.util.ElementScanner14;

public class minNumberOfPlatforms {
    public static void main(String[] args){
        Scanner input  =new Scanner(System.in);

        int n = input.nextInt();

        trains t[] = new trains[n];

        int a, d;
        for(int i=0; i<n; i++){
            a = input.nextInt();
            d = input.nextInt();
            t[i] = new trains(a, d);
        }

        // for(int i=0; i<n; i++){
        //     System.out.println((i+1)+" "+t[i].arr+" "+t[i].dept);
        // }sainath Ibitwar
        int result=0;

        
        for(int i=0; i<n; i++){
            int arr1 = t[i].arr;
            int dept1 = t[i].dept;
            int platforms=0;
            for(int j=i; j<n; j++){
                int arr=t[j].arr;
                int dept=t[j].dept;
                if(arr<arr1 && (dept>arr1 || dept>dept1))
                    platforms++;
                else if(arr>arr1 && arr<dept1)
                    platforms++;
                else if(arr1==arr || dept1==dept)
                    platforms++;
            }
            if(platforms>result)
                result=platforms;
        }
        System.out.println();
        System.out.println(result);
    }
}
class trains{
    int arr;
    int dept;
    trains(int a, int d){
        arr=a;
        dept=d;
    }
}
package greedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class job{
    int jobNo;
    int deadline;
    int profit;
    job(int id, int d, int p){
        jobNo=id;
        deadline=d;
        profit=p;
    }
}

public class jobSequencing {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();

        job jobs[] = new job[n];

        int id, deadl, prof;
        for(int i=0; i<n; i++){
            id = input.nextInt();
            deadl = input.nextInt();
            prof = input.nextInt();
            jobs[i] = new job(id,deadl,prof);
        }

        // for(int i =0; i<n; i++){
        //     System.out.println(jobs[i].jobNo+
        //     " "+jobs[i].deadline+" "+jobs[i].profit);
        // }
        
        jobScheduling(jobs,n);
    }

    private static void jobScheduling(job[] jobs, int n) {

        Arrays.sort(jobs, new Comparator<job>(){
            @Override
            public int compare(job j1, job j2){
                return j2.profit - j1.profit;
            }
        });

        int sequence[] = new int[n];
        boolean timeline[] = new boolean[n];

        for(int i=0; i<n ;i++){
            for(int j=Math.min(n-1,jobs[i].deadline-1); j>=0; j--){
                if(timeline[j]==false){
                    timeline[j]=true;
                    sequence[j]=i+1;
                    break;
                }
            }
        }

        int totalProfit=0;
        for(int i=0; i<n; i++){
            if(sequence[i]!=0)
                totalProfit = totalProfit+jobs[sequence[i]-1].profit;
        }

        for(int i=0; i<n; i++){
            System.out.print(sequence[i]+" ");
        }
        System.out.println();
        System.out.println(totalProfit);
    }
}


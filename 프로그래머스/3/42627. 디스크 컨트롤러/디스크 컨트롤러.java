import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int n =jobs.length;
        int time = 0;
        int count = 0;
        int total = 0;
        
        PriorityQueue<int[]>pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        boolean[]visited = new boolean[n];
        
        while(count < n){
            for(int i=0; i<n; i++){
                if(!visited[i] && jobs[i][0] <= time){
                    visited[i] = true;
                    pq.add(jobs[i]);
                }
            }
            
            if(!pq.isEmpty()){
                int[]job = pq.poll();
                
                time = time + job[1];
                total = total + time - job[0];
                
                count++;
            }else{
                time++;
            }
        }
        
        return total / n;
    }
}
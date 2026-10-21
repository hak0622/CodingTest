import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int n = jobs.length;
        
        boolean[]visited = new boolean[n];
        
        PriorityQueue<int[]>pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        
        int time = 0;
        int count = 0;
        int total = 0;
        
        while(count < n){
            for(int i=0; i<n; i++){
                if(!visited[i] && jobs[i][0] <= time){
                    pq.add(jobs[i]);
                    visited[i] = true;
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
        
        return total/n;
    }
}
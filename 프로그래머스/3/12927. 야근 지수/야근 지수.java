import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        int count = 0;
        int sum = 0;
        
        for(int w : works){
            pq.add(w);
            sum = sum + w;
        }
        
        if(sum < n) return 0;
        
        while(count < n){
            int max = pq.poll() - 1;
            pq.add(max);
            count++;
        }
        
        long answer = 0;
        
        while(!pq.isEmpty()){
            int num = pq.poll();
            answer = answer + num * num;
        }
        
        return answer;
    }
}
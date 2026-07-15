import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        
        for(int i=0; i<scoville.length; i++){
            pq.add(scoville[i]);
        }
        
        while(pq.peek() < K){
            if(pq.size() < 2) return -1;
            
            int one = pq.poll();
            int two = pq.poll();
            
            int mix = one + (two * 2);
            
            pq.add(mix);
            answer++;
        }
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        
        for(int s : scoville){
            pq.add(s);
        }
        
        while(pq.size() >= 2){
            if(pq.peek() >= K) return answer;
            
            int one = pq.poll();
            int two = pq.poll();
            
            int mix = one + two * 2;
            
            pq.add(mix);
            answer++;
        }
        
        if(pq.peek() >= K) return answer;
        
        return -1;
    }
}
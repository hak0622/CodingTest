import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        int cnt = 0;
        
        for(int s : scoville){
            pq.add(s);
        }
        
        while(pq.peek() < K){
            if(pq.size() < 2) return -1;
            
            int n1 = pq.poll();
            int n2 = pq.poll();
            
            int mix = n1 + (n2 * 2);
            
            pq.add(mix);
            cnt++;
        }
        
        return cnt;
    }
}
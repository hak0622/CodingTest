import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int answer = 0;
        
        for(int s : scoville){
            pq.add(s);
        }
        
        while(pq.peek() < K){
            if(pq.size() < 2) return -1;
            
            int one = pq.poll();
            int two = pq.poll();
            
            pq.add(one + (two * 2));
            answer++;
        }
        return answer;
    }
}
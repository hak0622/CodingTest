import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        long sum1 = 0;
        long sum2 = 0;
        long total = 0;
        
        Queue<Integer>q1 = new LinkedList<>();
        Queue<Integer>q2 = new LinkedList<>();
        
        for(int q : queue1){
            q1.add(q);
            sum1 += q;
        }
        
        for(int q : queue2){
            q2.add(q);
            sum2 += q;
        }
        
        total = sum1 + sum2;
        
        if(total % 2 != 0) return -1;
        
        long target = total / 2;
        int limit = queue1.length * 4;
        int count = 0;
        
        while(count < limit){
            if(sum1 == target) return count;
            
            if(sum1 > target){
                int num = q1.poll();
                q2.add(num);
                
                sum1 = sum1 - num;
                sum2 = sum2 + num;
            }else{
                int num = q2.poll();
                q1.add(num);
                
                sum2 = sum2 - num;
                sum1 = sum1 + num;
            }
            count++;
        }
        
        return -1;
    }
}
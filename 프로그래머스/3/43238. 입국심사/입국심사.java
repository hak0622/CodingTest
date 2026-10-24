class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        long left = 1;
        long right = Integer.MAX_VALUE;
        
        for(int t : times){
            right = (long)Math.min(right,t);
        }
        
        right = right * n;
        
        while(left < right){
            long mid = left + (right - left) / 2;
            
            long people = 0;
            
            for(int t : times){
                people = people + mid / t;
            }
            
            if(people < n){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        
        return right;
    }
}
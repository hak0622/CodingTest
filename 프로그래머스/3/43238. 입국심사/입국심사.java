class Solution {
    public long solution(int n, int[] times) {
        long left = 1;
        long right = 0;
        
        int minTime = Integer.MAX_VALUE;
        
        for(int t : times){
            minTime = Math.min(minTime, t);
        }
        
        right = (long) minTime * n;
        
        while(left < right){
            long mid = left + (right - left) / 2;
            
            long people = 0;
            
            for(int t : times){
                people = people + mid / t;
            }
            
            if(people >= n) right = mid;
            else left = mid + 1;
        }
        return left;
    }
}
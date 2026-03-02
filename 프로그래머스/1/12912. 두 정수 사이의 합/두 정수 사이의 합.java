class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long low = Math.min(a,b);
        long max = Math.max(a,b);
        
        for(long i=low; i<=max; i++){
            answer = answer + i;
        }
        return answer;
    }
}
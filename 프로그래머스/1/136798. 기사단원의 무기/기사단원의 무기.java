class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i=1; i<=number; i++){
            int cnt = divide(i);
            
            if(cnt <= limit) answer += cnt;
            else answer += power;
        }
        return answer;
    }
    
    public int divide(int n){
        int count = 0;
        
        for(int i=1; i<=n; i++){
            if(n % i == 0) count++;
        }
        return count;
    }
}
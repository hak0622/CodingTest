class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i=1; i<=number; i++){
            int cnt = num(i);
            
            if(cnt <= limit) answer += cnt;
            else answer += power;
        }
        
        return answer;
    }
    
    public int num(int n){
        if(n == 1) return 1;
        
        int cnt = 0;
        
        for(int i=1; i<=n; i++){
            if(n % i == 0) cnt++;
        }
        
        return cnt;
    }
}
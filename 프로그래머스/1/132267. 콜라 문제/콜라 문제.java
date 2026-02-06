class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n >= a){
            int exchange = n / a;
            int can = exchange * b;
            
            answer = answer + can;
            n = (n % a) + can;
        }
        return answer;
    }
}
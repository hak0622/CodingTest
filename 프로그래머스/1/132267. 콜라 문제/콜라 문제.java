class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n >= a){
            int changed = n / a;
            int can = changed * b;
            
            answer = answer + can;
            n = can + (n % a);
        }
        return answer;
    }
}
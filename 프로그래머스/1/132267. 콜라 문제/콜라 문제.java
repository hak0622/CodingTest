class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n >= a){
            int mok = (n / a) * b;
            n = n - (n/a * a) + mok; 
            answer = answer + mok;
        }
        return answer;
    }
}
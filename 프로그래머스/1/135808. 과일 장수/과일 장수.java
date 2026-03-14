import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int n = 0;
        
        Arrays.sort(score);
        
        for(int i=score.length-1; i>=0; i--){
            n++;
            
            if(n == m){
                int sum = score[i] * m;
                answer = answer + sum;
                n = 0;
            }
        }

        return answer;
    }
}
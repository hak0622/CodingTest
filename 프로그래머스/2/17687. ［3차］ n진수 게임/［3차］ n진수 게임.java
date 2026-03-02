import java.util.*;

class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();
        int num = 0;
        
        while(sb.length() < t * m){
            String convert = Integer.toString(num,n).toUpperCase();
            sb.append(convert);
            num++;
        }
        
        StringBuilder answer = new StringBuilder();
        
        int turn = 1;
        int answerCount = 0;
        
        for(int i=0; i<sb.length(); i++){
            char c = sb.charAt(i);
            
            if(turn == p){
                answer.append(c);
                answerCount++;
            }
            
            if(answerCount == t){
                break;
            }
            
            turn++;
            
            if(turn > m){
                turn = 1;
            }
        }
        
        return answer.toString();
    }
}
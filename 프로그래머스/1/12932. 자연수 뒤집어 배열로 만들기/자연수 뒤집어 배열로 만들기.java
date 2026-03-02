import java.util.*;

class Solution {
    public int[] solution(long n) {
        String s = "" + n;
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        
        String newS = sb.toString();
        int[]answer = new int[newS.length()];
        
        for(int i=0; i<newS.length(); i++){
            answer[i] = newS.charAt(i) - '0';
        }
        return answer;
    }
}
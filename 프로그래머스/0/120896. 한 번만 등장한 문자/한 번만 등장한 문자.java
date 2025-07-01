import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[]ch = s.toCharArray();
        Arrays.sort(ch);
        
        for(int i=0; i<ch.length; i++){
            int count = 0;
            for(int j=0; j<ch.length; j++){
                if(i!=j && ch[i] == ch[j]){
                    count++;
                }
            }
            if(count == 0){
                answer += ch[i];
            }
        }
        return answer;
    }
}
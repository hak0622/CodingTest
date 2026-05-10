import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        String[]s = new String[numbers.length];
        
        for(int i=0; i<numbers.length; i++){
            s[i] = numbers[i] + "";
        }
        
        Arrays.sort(s, (a,b) -> (b + a).compareTo(a + b));
        
        if (s[0].equals("0")) return "0";
        
        for(int i=0; i<s.length; i++){
            answer.append(s[i]);
        }
        
        return answer.toString();
    }
}

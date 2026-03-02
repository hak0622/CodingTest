import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String s = "" + n;
        StringBuilder sb = new StringBuilder();
        char[]ch = s.toCharArray();
        Arrays.sort(ch);
        
        for(int i=ch.length-1; i>=0; i--){
            sb.append(ch[i]);
        }
        
        return Long.parseLong(sb.toString());
    }
}
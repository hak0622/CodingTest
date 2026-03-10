import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        List<String>list = new ArrayList<>();
        
        list.add(words[0]);
        
        for(int i=1; i<words.length; i++){
            String prev = words[i -1];
            String now = words[i];
            
            if(prev.charAt(prev.length() - 1) != now.charAt(0) || list.contains(now)){
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                return answer;
            }
            list.add(now);
        }
        return answer;
    }
}
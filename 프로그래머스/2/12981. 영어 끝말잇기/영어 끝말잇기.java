import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        Set<String>use = new HashSet<>();
        
        use.add(words[0]);

        for(int i=1; i<words.length; i++){
            String before = words[i-1];
            String cur = words[i];
            
            char beforeC = before.charAt(before.length()-1);
            char curC = cur.charAt(0);
            
            if(cur.length() == 1 || beforeC != curC || use.contains(cur)){
                int person = (i % n) + 1;
                int turn = (i / n) + 1;
                return new int[]{person,turn};
            }
            use.add(cur);
        }
        return new int[]{0,0};
    }
}
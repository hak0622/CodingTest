import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        HashSet<String>set = new HashSet<>();
        
        set.add(words[0]);
        
        for(int i=1; i<words.length; i++){
            String start = words[i-1];
            String cur = words[i];
            
            if(start.charAt(start.length()-1) != cur.charAt(0) || set.contains(cur)){
                return new int[]{(i % n) + 1, (i / n) + 1};
            }
            set.add(cur);
        }
        return new int[]{0,0};
    }
}
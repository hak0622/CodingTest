import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        HashSet<String>set = new HashSet<>();
        
        set.add(words[0]);
        char lastC = words[0].charAt(words[0].length() - 1);
                                     
        for(int i=1; i<words.length; i++){
            if(set.contains(words[i])){
                return new int[]{(i % n) + 1, (i / n) + 1};
            }
            
            char nextStartC = words[i].charAt(0);
            char nextLastC = words[i].charAt(words[i].length() - 1);
            
            if(lastC != nextStartC){
                 return new int[]{(i % n) + 1, (i / n) + 1};
            }else{
                lastC = nextLastC;
                set.add(words[i]);
            }
        }
        return new int[]{0,0};
    }
}
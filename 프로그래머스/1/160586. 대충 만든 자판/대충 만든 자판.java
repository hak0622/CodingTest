import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[]answer=  new int[targets.length];
        HashMap<Character,Integer>map = new HashMap<>();
        
        for(String key : keymap){
            for(int i=0; i<key.length(); i++){
                char c = key.charAt(i);
                int press = i + 1;
                
                if(!map.containsKey(c)){
                    map.put(c,press);
                }else{
                    map.put(c, Math.min(map.get(c),press));
                }
            }
        }
        
        for(int i=0; i<targets.length; i++){
            String word = targets[i];
            int sum = 0;
            
            for(int j=0; j<word.length(); j++){
                char c = word.charAt(j);
                
                if(!map.containsKey(c)){
                    sum = -1;
                    break;
                }
                sum += map.get(c);
            }
            answer[i] = sum;
        }
        return answer;
    }
}
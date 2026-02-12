import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        HashMap<Character,Integer>map = new HashMap<>();
        
        for(String key : keymap){
            for(int i=0; i<key.length(); i++){
                char c = key.charAt(i);
                int count = i+1;
                
                if(!map.containsKey(c) || count < map.get(c)){
                    map.put(c,count);
                }
            }
        }
        
        int[]answer = new int[targets.length];
        for(int i=0; i<targets.length; i++){
            int total = 0;
            boolean canMake = true;
            
            for(char c : targets[i].toCharArray()){
                if(map.containsKey(c)){
                    total = total + map.get(c);
                }else{
                    canMake = false;
                    break;
                }
            }
            answer[i] = canMake ? total : -1;
        }
        return answer;
    }
}
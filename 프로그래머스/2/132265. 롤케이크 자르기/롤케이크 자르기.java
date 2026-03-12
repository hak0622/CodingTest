import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        Set<Integer>set = new HashSet<>();
        Map<Integer,Integer>map = new HashMap<>();
        
        for(int t : topping){
            map.put(t,map.getOrDefault(t,0) + 1);
        }
        
        for(int i=0; i<topping.length; i++){
            int cur = topping[i];
            
            set.add(cur);
            map.put(cur,map.get(cur) - 1);
            
            if(map.get(cur) == 0){
                map.remove(cur);
            }
            
            if(set.size() == map.size()){
                answer++;
            }
        }
        return answer;
    }
}
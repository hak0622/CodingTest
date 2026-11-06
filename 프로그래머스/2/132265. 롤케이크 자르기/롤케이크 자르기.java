import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        HashMap<Integer,Integer>map = new HashMap<>();
        HashSet<Integer>set = new HashSet<>();
        
        for(int i=0; i<topping.length; i++){
            map.put(topping[i],map.getOrDefault(topping[i],0)+1);
        }
        
        for(int i=0; i<topping.length-1; i++){
            int t = topping[i];
            
            set.add(t);
            map.put(t, map.get(t)-1);
            
            if(map.get(t) == 0) map.remove(t);
            
            if(set.size() == map.size()) answer++;
        }
        return answer;
    }
}
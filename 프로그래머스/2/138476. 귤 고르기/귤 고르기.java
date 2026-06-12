import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer,Integer>map = new HashMap<>();
        
        for(int t : tangerine){
            map.put(t,map.getOrDefault(t,0)+1);
        }
        
        List<Integer>list = new ArrayList<>(map.values());
        list.sort(Collections.reverseOrder());
        
        for(int i=0; i<list.size(); i++){
            if(k <= 0) return answer;
            
            k = k - list.get(i);
            answer++;
        }
        return answer;
    }
}
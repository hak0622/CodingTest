import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        HashMap<Integer,Integer>map = new HashMap<>();
        List<Integer>list = new ArrayList<>();
        int answer = 0;
        
        for(int i=0; i<tangerine.length; i++){
            map.put(tangerine[i],map.getOrDefault(tangerine[i],0)+1);
        }
        
        for(int v : map.values()){
            list.add(v);
        }
        
        list.sort(Collections.reverseOrder());
        
        for(int i=0; i<list.size(); i++){
            if(k <= 0) break;
            
            k = k - list.get(i);
            answer++;
        }
        
        return answer;
    }
}
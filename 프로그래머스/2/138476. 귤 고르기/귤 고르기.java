import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        List<Integer>list = new ArrayList<>();
        Map<Integer,Integer>map = new HashMap<>();
        
        for(int n : tangerine){
            map.put(n, map.getOrDefault(n,0) + 1);
        }
        
        for(int n : map.values()){
            list.add(n);
        }
        
        Collections.sort(list);
        
        for(int i=list.size()-1; i>=0; i--){
            k = k - list.get(i);
            answer++;
            
            if(k <= 0){
                break;
            }
        }
        return answer;
    }
}